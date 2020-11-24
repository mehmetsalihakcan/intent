package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. SAYFA -> verilerin gönderildiği sayfa
        Intent intent = new Intent(this,SecondActivity.class);

        //BÜYÜK HARFLE YAZILANLAR DİĞER SAYFADA KEY OLARAK KULLANILACAK VE BU KEYLER ÜZERİNDEN VALUE LERİNE ULAŞACAĞIZ
        //3 farklı veri türü gönderme şekli
        intent.putExtra("AD_SOYAD","Mehmet Salih AKCAN");
        intent.putExtra("YAS",30);
        intent.putExtra("DURUM",true);
        startActivity(intent);
    }
}