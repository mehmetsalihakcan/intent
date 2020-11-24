package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


             // 2. SAYFA -> verilerin alındığı sayfa

                String ad_soyad_bilgisi= getIntent().getExtras().getString("AD_SOYAD");
                int yas_bilgisi=getIntent().getExtras().getInt("YAS");
                boolean durum_bilgisi=getIntent().getExtras().getBoolean("DURUM");

                // çıktıları console yazdırdım geliyor.
                System.out.println("Adınız soyadınız :   : "+ ad_soyad_bilgisi);
                System.out.println("Yaşınız  : "+ yas_bilgisi);
                System.out.println("Durum  : "+ durum_bilgisi);

    }
}