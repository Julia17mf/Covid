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

import com.example.covid.FasilitasAdapter;
import com.example.covid.FasilitasViewModel;
import com.example.covid.R;
import com.example.covid.fasilitas.DataItem;

import java.util.ArrayList;

public class RSFragment extends Fragment {

    private FasilitasAdapter fasilitasAdapter;
    private FasilitasViewModel fasilitasViewModel;
    private RecyclerView rvRS;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rs, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fasilitasAdapter = new FasilitasAdapter(getContext());
        fasilitasAdapter.notifyDataSetChanged();

        rvRS = view.findViewById(R.id.rv_rs);
        rvRS.setLayoutManager(new GridLayoutManager(getContext(), 1));

        fasilitasViewModel = new ViewModelProvider(this).get(FasilitasViewModel.class);
        fasilitasViewModel.setDataRS();
        fasilitasViewModel.getDataRS().observe(this, getDataRS);

        rvRS.setAdapter(fasilitasAdapter);
    }

    private Observer<ArrayList<DataItem>> getDataRS = new Observer<ArrayList<DataItem>>() {
        @Override
        public void onChanged(ArrayList<DataItem> data) {
            if(data != null) {
                fasilitasAdapter.setData(data);
            }
        }
    };
}