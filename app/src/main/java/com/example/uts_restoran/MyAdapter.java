package com.example.uts_restoran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Restoran> listResto;
    private Context context;

    public MyAdapter(List<Restoran> listResto, Context context) {
        this.listResto = listResto;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restoran listResto2 = listResto.get(position);
        holder.namaRestoran.setText(listResto2.getNama());
        holder.rating.setText(listResto2.getRating());
        holder.jumlahPenilai.setText(listResto2.getJumlahVoter());
        holder.jarakWaktu.setText(listResto2.getJarak());
        holder.biayaAntar.setText(listResto2.getBiaya());
        holder.fotoMakanan.setImageResource(listResto2.getFotoMakanan());
    }

    @Override
    public int getItemCount() {

        return listResto.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView namaRestoran, rating, jumlahPenilai, biayaAntar, jarakWaktu;
        public ImageView fotoMakanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaRestoran = (TextView) itemView.findViewById(R.id.namaRestoran);
            rating = (TextView) itemView.findViewById(R.id.rating);
            jumlahPenilai = (TextView) itemView.findViewById(R.id.jumlahPenilai);
            jarakWaktu = (TextView) itemView.findViewById(R.id.jarakWaktu);
            biayaAntar = (TextView) itemView.findViewById(R.id.biayaAntar);
            fotoMakanan = (ImageView) itemView.findViewById(R.id.fotoMakanan);
        }
    }
}
