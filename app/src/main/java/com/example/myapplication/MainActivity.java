package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Calcular(View view) {
        // Log.d("Sara", "buenas");
    }

    public void Click_1(View view) {
    }

    public void Click_2(View view) {
    }

    public void Click_3(View view) {
    }

    public void Click_4(View view) {
    }
    public void Click_5(View view) {
    }
    public void Click_6(View view) {
    }
    public void Click_7(View view) {
    }
    public void Click_8(View view) {
    }
    public void Click_9(View view) {
    }
    public void Click_0(View view) {

    }
    public void Click_Dividir(View view) {
    }
    public void Click_Multiplicar(View view) {
    }
    public void Click_Sumar(View view) {
    }
    public void Click_Restar(View view) {
    }
    public void Click_Seno(View view) {
    }
    public void Click_Coseno(View view) {
    }
    public void Click_Tangente(View view) {
    }

}