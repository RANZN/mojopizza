package com.example.pizza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pizza.Fragments.AccountFragment;
import com.example.pizza.Fragments.CartFragment;
import com.example.pizza.Fragments.ClubFragment;
import com.example.pizza.Fragments.FreeFragment;
import com.example.pizza.Fragments.Home_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnv=findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Home_Fragment()).commit();
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId())
                {
                    case R.id.home:
                        fragment=new Home_Fragment();
                        break;
                    case R.id.cart:
                        fragment=new CartFragment();
                        break;
                    case R.id.search:
                        fragment=new ClubFragment();
                        break;
                    case R.id.profile:
                        fragment=new FreeFragment();
                        break;
                    case R.id.message:
                        fragment=new AccountFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                return true;
            }
        });

    }
}