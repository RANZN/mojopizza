package com.example.pizza.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.pizza.Image_model;
import com.example.pizza.R;
import com.example.pizza.model_adapter;

import java.util.ArrayList;

public class Home_Fragment extends Fragment {
    private ImageSlider imageSlider;
    private ArrayList<SlideModel> imageList=new ArrayList<>();
    private ArrayList<Image_model>   imageButtons=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageList.add(new SlideModel(R.drawable.pizza1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.pizza1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.pizza1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.pizza1, ScaleTypes.FIT));
        initviews(view);
        imageSlider.setImageList(imageList);
        buildStudentList();
        setRecyclerView();

    }
    private void buildStudentList() {
        for (int i=0;i<20;i++)
        {
            if(i%4==0)
            {
                Image_model model=new Image_model(R.drawable.pizza1);
                imageButtons.add(model);
            }
            else if(i%4==1)
            {
                Image_model model=new Image_model(R.drawable.pizza1);
                imageButtons.add(model);
            }
            else if(i%4==2)
            {
                Image_model model=new Image_model(R.drawable.pizza1);
                imageButtons.add(model);
            }
            else if(i%4==3)
            {
                Image_model model=new Image_model(R.drawable.pizza1);
                imageButtons.add(model);
            }
        }
    }

    private void setRecyclerView() {
        model_adapter adapter=new model_adapter(imageButtons);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this.getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initviews(View view) {
        imageSlider=view.findViewById(R.id.image_slider);
        recyclerView=view.findViewById(R.id.recycler1);
    }
}