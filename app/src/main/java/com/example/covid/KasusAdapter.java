package com.example.covid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid.kasus.ContentItem;

import java.util.ArrayList;
import java.util.Collections;

public class KasusAdapter extends RecyclerView.Adapter<KasusAdapter.ViewHolder> {

    private ArrayList<ContentItem> data = new ArrayList<>();
    private Context context;

    public KasusAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<ContentItem> items) {
        data.clear();
        Collections.reverse(items);
        data.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public KasusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_kasus, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KasusAdapter.ViewHolder holder, int position) {
        holder.tanggal.setText(data.get(position).getTanggal());
        holder.sembuh.setText(String.valueOf(data.get(position).getConfirmationSelesai()));
        holder.meninggal.setText(String.valueOf(data.get(position).getConfirmationMeninggal()));
        holder.terkonfirmasi.setText(String.valueOf(data.get(position).getConfirmationDiisolasi()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tanggal, sembuh, meninggal, terkonfirmasi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tanggal         = itemView.findViewById(R.id.tv_tanggal);
            sembuh          = itemView.findViewById(R.id.tv_sembuh);
            meninggal       = itemView.findViewById(R.id.tv_meninggal);
            terkonfirmasi   = itemView.findViewById(R.id.tv_terkonfirmasi);
        }
    }
}
