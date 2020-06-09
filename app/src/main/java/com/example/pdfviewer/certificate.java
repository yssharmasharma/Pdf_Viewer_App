package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class certificate extends AppCompatActivity {
    PDFView certi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        certi=(PDFView)findViewById(R.id.certi);

        certi.fromAsset("YASH_SHARMA_Hired_Certificate.pdf").load();
    }
}
