package com.example.mojo_pizza.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mojo_pizza.Helper.PreferenceHelper;
import com.example.mojo_pizza.R;

public class Item_Detail_Activity extends AppCompatActivity {
    private ImageView mTv_Show_Image_Poster;
    private TextView mTv_Show_Name;
    private TextView mTv_Show_Detail;
    private TextView mTv_Show_Detail_1;
    private TextView mTv_Show_Prize;
    private Button mBtnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        initView();

        int imageId = PreferenceHelper.getIntFromPreference(Item_Detail_Activity.this, "ImagePoster");
        String Name = PreferenceHelper.getStringFromPreference(Item_Detail_Activity.this, "ItemName");
        String Detail = PreferenceHelper.getStringFromPreference(Item_Detail_Activity.this, "ItemDetail");
        String Detail_1 = PreferenceHelper.getStringFromPreference(Item_Detail_Activity.this, "ItemDetail_1");
        String Prize = PreferenceHelper.getStringFromPreference(Item_Detail_Activity.this, "Prize");

        mTv_Show_Image_Poster.setImageResource(imageId);
        mTv_Show_Name.setText(Name);
        mTv_Show_Prize.setText(Prize);
        mTv_Show_Detail.setText(Detail);
        mTv_Show_Detail_1.setText(Detail_1);

    }

    private void initView() {
        mTv_Show_Name= findViewById(R.id.Trans_Tv_Show_Name);
        mTv_Show_Image_Poster= findViewById(R.id.Tv_Show_Image);
        mTv_Show_Detail= findViewById(R.id.Tv_Show_Detail);
        mTv_Show_Detail_1= findViewById(R.id.Tv_Detail_1);
        mTv_Show_Prize= findViewById(R.id.Tv_Show_Prize);
        mBtnAddToCart= findViewById(R.id.Trans_Btn_addToCart);
    }
}