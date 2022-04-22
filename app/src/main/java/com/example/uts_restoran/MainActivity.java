package com.example.uts_restoran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View.OnClickListener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Restoran> listResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listResto = new ArrayList<>();

        listResto.add(new Restoran("KFC", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan1));
        listResto.add(new Restoran("CFC", "5 km (30 menit)", "15.000", "1", "4", R.drawable.makanan2));
        listResto.add(new Restoran("Burger King", "1.5 km (6 menit)", "2.000", "1", "2", R.drawable.makanan3));
        listResto.add(new Restoran("Solaria", "10 km (60 menit)", "21.000", "1", "3.5", R.drawable.makanan4));
        listResto.add(new Restoran("Hokben", "6 km (35 menit)", "18.000", "1", "5", R.drawable.makanan5));
        listResto.add(new Restoran("AW", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan6));
        listResto.add(new Restoran("Bakmie", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan7));
        listResto.add(new Restoran("Gokana", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan8));
        listResto.add(new Restoran("Cheesecake Factory", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan9));
        listResto.add(new Restoran("Olive Garden", "3 km (10 menit)", "3.000", "1", "5", R.drawable.makanan2));

        adapter = new MyAdapter(listResto, this);
        recyclerView.setAdapter(adapter);

        TextView txt = (TextView)  findViewById(R.id.daftarRestoran);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });



        /*View inflatedView = getLayoutInflater().inflate(R.layout.list_item, null);
        TextView txt = (TextView) inflatedView.findViewById(R.id.menuMakanan);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });*/
    }
}