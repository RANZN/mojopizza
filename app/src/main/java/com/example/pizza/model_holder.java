package com.example.pizza;

import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class model_holder extends RecyclerView.ViewHolder{
    private ImageButton mImgBtn;
    public model_holder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);

    }

    private void initviews(View itemView) {
        mImgBtn=itemView.findViewById(R.id.imgImage);
    }

    public void setData(Image_model model) {
        mImgBtn.setImageResource(model.getImageId());
    }
}
