package com.example.covid.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.covid.KasusAdapter;
import com.example.covid.KasusViewModel;
import com.example.covid.R;
import com.example.covid.kasus.ContentItem;

import java.util.ArrayList;

public class KasusFragment extends Fragment {

    private KasusAdapter kasusAdapter;
    private KasusViewModel kasusViewModel;
    private RecyclerView rvKasus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kasus, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        kasusAdapter = new KasusAdapter(getContext());
        kasusAdapter.notifyDataSetChanged();

        rvKasus = view.findViewById(R.id.rv_kasus);
        rvKasus.setLayoutManager(new GridLayoutManager(getContext(), 1));

        kasusViewModel = new ViewModelProvider(this).get(KasusViewModel.class);
        kasusViewModel.setDataCovid();
        kasusViewModel.getDataCovid().observe(this, getDataCovid);

        rvKasus.setAdapter(kasusAdapter);
    }

    private Observer<ArrayList<ContentItem>> getDataCovid = new Observer<ArrayList<ContentItem>>() {
        @Override
        public void onChanged(ArrayList<ContentItem> data) {
            if(data != null) {
                kasusAdapter.setData(data);
            }
        }
    };
}