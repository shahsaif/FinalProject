package com.example.finalproject.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.Adapters.RecyclerViewAdapter;
import com.example.finalproject.Models.PromotingModel;
import com.example.finalproject.R;

import java.util.ArrayList;
import java.util.List;

public class Promotion extends Fragment {
    View view;
    RecyclerView recyclerView;
    List<PromotingModel> list;

    public Promotion() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.promotion ,container,false);

        recyclerView = view.findViewById(R.id.promotion_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        list.add(new PromotingModel("Facebook",R.drawable.facebook,200));
        list.add(new PromotingModel("Instagram",R.drawable.instagram,120));

        list.add(new PromotingModel("OtherSocial",R.drawable.othersocial,100));

        list.add(new PromotingModel("YouTube",R.drawable.youtube,150));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(),list);
        recyclerView.setAdapter(adapter);





        return view;
    }
}
