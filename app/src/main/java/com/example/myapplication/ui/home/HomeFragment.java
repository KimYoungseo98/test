package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class HomeFragment extends Fragment {
    public static HomeFragment newInstance(int index){
        HomeFragment hf = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index",index);
        hf.setArguments(bundle);
        return hf;
    }

    public int getShowInt(){
        return getArguments().getInt("index", 0 );
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}