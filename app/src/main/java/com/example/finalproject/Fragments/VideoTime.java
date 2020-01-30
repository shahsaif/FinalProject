package com.example.finalproject.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.finalproject.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class VideoTime extends Fragment {
    View view;
    Spinner spinner,spinnerHour;
    List<String> list;
    List<String> listHour;

    public VideoTime() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.video_time , container , false);
        spinner = view.findViewById(R.id.select_date_spinner);
        spinnerHour = view.findViewById(R.id.select_hour_spinner);

        list = new ArrayList<>();
        list.add("Select Available Date");

        listHour = new ArrayList<>();
        listHour.add("Select hour celebrity is available on");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_dropdown_item,list);
        spinner.setAdapter(arrayAdapter);

        ArrayAdapter arrayAdapterHour = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_dropdown_item,listHour);
        spinnerHour.setAdapter(arrayAdapterHour);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), list.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerHour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),listHour.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }


}
