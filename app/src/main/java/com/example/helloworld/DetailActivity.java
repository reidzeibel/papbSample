package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");

        TextView textNama = findViewById(R.id.nama);
        TextView textNim = findViewById(R.id.nim);

        textNama.setText(nama);
        textNim.setText(nim);
    }
}
