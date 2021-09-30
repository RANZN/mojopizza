package com.example.mojo_pizza.Menu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mojo_pizza.Activities.Item_Detail_Activity;
import com.example.mojo_pizza.Adapter.All_Model;
import com.example.mojo_pizza.Adapter.MenuAdapter;
import com.example.mojo_pizza.Helper.PreferenceHelper;
import com.example.mojo_pizza.R;
import com.example.mojo_pizza.communication.CommunicationListener;
import com.example.mojo_pizza.communication.ItemClickListener;

import java.util.ArrayList;


public class All_in_oneFragment extends Fragment implements ItemClickListener {
    private ImageView btnBack;
    private ImageView TvFavorite;
    private TextView mTvPredict;
    private TextView mTvHalfAndHalf;
    private TextView mTvPartyCombo;
    private TextView mTvBig_10;
    private TextView mTvStarters;
    private TextView mTvGarlicBread;
    private TextView mTvDesserts;
    private RecyclerView recyclerView;
    private CommunicationListener listener;
    private ArrayList<All_Model> all_modelsList = new ArrayList<>();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (CommunicationListener) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_in_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildRecyclerViewData();
        setRecyclerviewAdapter();
        onClick();
    }

    private void onClick() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Under Progress", Toast.LENGTH_SHORT).show();
            }
        });
        mTvDesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchDessertAndDrinkFragment();
            }
        });
        TvFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Under Progress", Toast.LENGTH_SHORT).show();
            }
        });
        mTvPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mTvHalfAndHalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchHalfAndHalfFragment();
            }
        });
        mTvPartyCombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchPartyComboFragment();
            }
        });
        mTvBig_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchBig10Fragment();
            }
        });
        mTvStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchStartersFragment();
            }
        });
        mTvGarlicBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.launchGarlicFragment();
            }
        });
    }


    private void setRecyclerviewAdapter() {
        MenuAdapter menuAdapter = new MenuAdapter(all_modelsList , this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(menuAdapter);
    }

    private void buildRecyclerViewData() {
        all_modelsList = new ArrayList<>();
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.half_1,"$410"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.half_2,"$300"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.half_3,"$200"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.half_4,"$200"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.big_1,"$260"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.big_2,"$390"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.big_3,"$400"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.big_4,"$400"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.combo_1,"$540"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.combo_2,"$100"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.combo_3,"$180"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.combo_4,"$180"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.starters_1,"$250"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.starters_2,"$430"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.starters_3,"$220"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.starters_4,"$220"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.garlic_1,"$450"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.garlic_2,"$290"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.garlic_3,"$290"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.garlic_4,"$290"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.desserts_1,"$310"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.desserts_2,"$450"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.desserts_3,"$450"));
        all_modelsList.add(new All_Model("Half & Half Pizzas","Veg - Non-Veg Half Half","Cant't make up your mind? No worries get 2 different haves in one big 10-inch pizza","The fight ends today! Get your own half now. pick a half each of any 2  & make 1 big 10 inch pizza ",R.drawable.desserts_4,"$450"));
    }


    private void initViews(View view) {
        btnBack = view.findViewById(R.id.btnback);
        TvFavorite = view.findViewById(R.id.btnfavorite);
        mTvPredict = view.findViewById(R.id.predict);
        mTvHalfAndHalf = view.findViewById(R.id.HalfAndHalf);
        mTvPartyCombo = view.findViewById(R.id.partycombo);
        mTvBig_10 = view.findViewById(R.id.Big_10);
        mTvStarters = view.findViewById(R.id.Starters);
        mTvGarlicBread = view.findViewById(R.id.GarlicBread);
        mTvDesserts = view.findViewById(R.id.Desserts);
        recyclerView = view.findViewById(R.id.all_menu_recyclerView);
    }

    @Override
    public void onItemClick(int position, All_Model all_model) {
        PreferenceHelper.writeIntToPreference(getContext(), "ImagePoster",all_model.getPosterImage());
        PreferenceHelper.writeStringToPreference(getContext(),"ItemName",all_model.getNameOfItem());
        PreferenceHelper.writeStringToPreference(getContext(),"ItemDetail",all_model.getDetailOfItem_1());
        PreferenceHelper.writeStringToPreference(getContext(),"ItemDetail_1",all_model.getDetailOfItem());
        PreferenceHelper.writeStringToPreference(getContext(),"Prize",all_model.getPrize());

        listener.launchDetailItemFragment();
    }
}