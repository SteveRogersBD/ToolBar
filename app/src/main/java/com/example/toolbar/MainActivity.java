package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    ImageView image1, image2;
    TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        text = findViewById(R.id.text);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        text.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        int v = view.getId();
        if(v==R.id.image1) Toast.makeText(this, "BackButton", Toast.LENGTH_SHORT).show();
        else if(v==R.id.text) Toast.makeText(this, "Text", Toast.LENGTH_SHORT).show();
        else if(v==R.id.image2) Toast.makeText(this, "MenuButton", Toast.LENGTH_SHORT).show();
    }
}