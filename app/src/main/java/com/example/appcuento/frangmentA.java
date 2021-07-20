package com.example.appcuento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class frangmentA extends Fragment {





    public frangmentA() {

    }

public static  frangmentA newInstance(String param1,String param2){
  frangmentA fragment = new frangmentA();
        return fragment;
}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_frangment_a, container, false);
    }
}