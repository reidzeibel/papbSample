package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecyclerItem> list = new ArrayList<>();

        list.add(new RecyclerItem("Ridwan Aditama", "07/256449/PA/11770"));
        list.add(new RecyclerItem("Kukuh Truna Wijaya", "13/350999/SV/04063"));
        list.add(new RecyclerItem("Yusuf Himawan", "16/401067/SV/11571"));
        list.add(new RecyclerItem("Ade Dwi Putra","17/410819/SV/12746"));
        list.add(new RecyclerItem("Anggit Prayoga", "17/410822/SV/12749"));
        list.add(new RecyclerItem("Bella Wulan N", "17/410828/SV/12755"));
        list.add(new RecyclerItem("Devi Qurnia Sari", "17/410831/SV/12758"));
        list.add(new RecyclerItem("Ester Prenatalia Adi", "17/410837/SV/12764"));
        list.add(new RecyclerItem("Fikri Ulinukha", "17/410840/SV/12767"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerAdapter adapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
