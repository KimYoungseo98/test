package com.example.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class DashboardFragment extends Fragment {
    public static DashboardFragment newInstance(int index){
        DashboardFragment hf = new DashboardFragment();
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
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
}