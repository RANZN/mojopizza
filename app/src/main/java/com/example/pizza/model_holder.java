package com.example.pizza;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class model_holder extends RecyclerView.ViewHolder{
    private ImageView mImgBtn;
    public model_holder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View itemView) {
        mImgBtn = itemView.findViewById(R.id.imgImage);
    }

    public void setData(Image_model model) {
        mImgBtn.setImageResource(model.getImageId());
    }
}
