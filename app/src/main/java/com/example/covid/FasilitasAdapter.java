package com.example.covid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid.fasilitas.DataItem;
import com.example.covid.kasus.ContentItem;

import java.util.ArrayList;
import java.util.Collections;

public class FasilitasAdapter extends RecyclerView.Adapter<FasilitasAdapter.ViewHolder> {

    private ArrayList<DataItem> data = new ArrayList<>();
    private Context context;

    public FasilitasAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<DataItem> items) {
        data.clear();
        Collections.reverse(items);
        data.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_rs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FasilitasAdapter.ViewHolder holder, int position) {
        holder.nama.setText(data.get(position).getNama());
        holder.alamat.setText(String.valueOf(data.get(position).getAlamat()));
        holder.maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri Intent = Uri.parse("geo: "+data.get(position).getLatitude()+","+
                        data.get(position).getLongitude()+"?q="+Uri.encode(data.get(position).getNama()));

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Intent);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama, alamat;
        Button maps;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama        = itemView.findViewById(R.id.tv_namaRS);
            alamat      = itemView.findViewById(R.id.tv_isiAlamat);
            maps        = itemView.findViewById(R.id.btn_maps);
        }
    }
}