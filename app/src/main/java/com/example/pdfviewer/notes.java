package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class notes extends AppCompatActivity {
    PDFView note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        note=(PDFView)findViewById(R.id.note);
        note.fromAsset("unit 2 part 2.pdf").load();
    }
}
