package com.example.mojo_pizza.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mojo_pizza.Menu.All_in_oneFragment;
import com.example.mojo_pizza.Menu.Big10Fragment;
import com.example.mojo_pizza.Menu.DessertsAndDrinksFragment;
import com.example.mojo_pizza.Menu.Detil_ItemFragment;
import com.example.mojo_pizza.Menu.GarlicBreadsFragment;
import com.example.mojo_pizza.Menu.HalfAndHalfFragment;
import com.example.mojo_pizza.Menu.PartyComboFragment;
import com.example.mojo_pizza.Menu.StatersFragment;
import com.example.mojo_pizza.R;
import com.example.mojo_pizza.communication.CommunicationListener;

public class MainActivity extends AppCompatActivity implements CommunicationListener {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager= getSupportFragmentManager();
       getSupportFragmentManager().beginTransaction().replace(R.id.contaner,new All_in_oneFragment(),"all_In_One").commit();
    }


    @Override
    public void launchBig10Fragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Big10Fragment big10 = new Big10Fragment();
        fragmentTransaction.replace(R.id.contaner,big10,"Big_10").addToBackStack("").commit();
    }

    @Override
    public void launchDessertAndDrinkFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DessertsAndDrinksFragment dessert = new DessertsAndDrinksFragment();
        fragmentTransaction.replace(R.id.contaner,dessert,"dessert").addToBackStack("").commit();
    }

    @Override
    public void launchGarlicFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        GarlicBreadsFragment garlic = new GarlicBreadsFragment();
        fragmentTransaction.replace(R.id.contaner,garlic,"Garlic").addToBackStack("").commit();
    }

    @Override
    public void launchHalfAndHalfFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HalfAndHalfFragment half = new HalfAndHalfFragment();
        fragmentTransaction.replace(R.id.contaner,half,"HAlf").addToBackStack("").commit();
    }

    @Override
    public void launchPartyComboFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PartyComboFragment party = new PartyComboFragment();
        fragmentTransaction.replace(R.id.contaner,party,"Party").addToBackStack("").commit();
    }

    @Override
    public void launchStartersFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StatersFragment starters = new StatersFragment();
        fragmentTransaction.replace(R.id.contaner,starters ,"Starters").addToBackStack("").commit();
    }

    @Override
    public void launchDetailItemFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Detil_ItemFragment detail  = new Detil_ItemFragment();
        fragmentTransaction.add(R.id.contaner,detail,"Detail").addToBackStack("").commit();
    }
}