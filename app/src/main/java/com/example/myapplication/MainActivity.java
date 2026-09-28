package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private double firstNum = 0;
    private String operator = "";
    private int opPos = 0;
    private String trig = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.editTextNumber);
    }

    public double calcular(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return b;
    }
    public void Calcular(View view) {
        String text = num.getText().toString();

        if (!trig.isEmpty()) {
            double x = Double.parseDouble(text.substring(opPos));   // "sin5" -> "5"
            if (grados) x = Math.toRadians(x);
            double r = 0;

            switch (trig) {
                case "sin": r = Math.sin(x); break;
                case "cos": r = Math.cos(x); break;
                case "tan": r = Math.tan(x); break;
            }

            num.setText(text + "=" + r);
            trig = "";
            return;
        }

        if (operator.isEmpty()) return;

        double secondNum = Double.parseDouble(text.substring(opPos));
        double result = calcular(firstNum, secondNum, operator);

        num.setText(text + "=" + result);
        operator = "";
    }

    public void Click_Clear(View view) {
        num.setText("");
        operator = "";
        trig = "";
        firstNum = 0;
        opPos = 0;
    }

    public void Click_1(View view) { num.append("1"); }
    public void Click_2(View view) { num.append("2"); }
    public void Click_3(View view) { num.append("3"); }
    public void Click_4(View view) { num.append("4"); }
    public void Click_5(View view) { num.append("5"); }
    public void Click_6(View view) { num.append("6"); }
    public void Click_7(View view) { num.append("7"); }
    public void Click_8(View view) { num.append("8"); }
    public void Click_9(View view) { num.append("9"); }
    public void Click_0(View view) { num.append("0"); }

    public void Click_Dividir(View view) {
        String text = num.getText().toString();

        if (operator.isEmpty()) {
            firstNum = Double.parseDouble(text);
        } else {
            double secondNum = Double.parseDouble(text.substring(opPos));
            firstNum = calcular(firstNum, secondNum, operator);
        }
        operator = "/";
        num.append("/");
        opPos = num.getText().length();
    }
    public void Click_Multiplicar(View view) {
        String text = num.getText().toString();

        if (operator.isEmpty()) {
            firstNum = Double.parseDouble(text);
        } else {
            double secondNum = Double.parseDouble(text.substring(opPos));
            firstNum = calcular(firstNum, secondNum, operator);
        }
        operator = "*";
        num.append("*");
        opPos = num.getText().length();
    }
    public void Click_Sumar(View view) {
        String text = num.getText().toString();

        if (operator.isEmpty()) {
            firstNum = Double.parseDouble(text);
        } else {
            double secondNum = Double.parseDouble(text.substring(opPos));
            firstNum = calcular(firstNum, secondNum, operator);
        }
        operator = "+";
        num.append("+");
        opPos = num.getText().length();
    }
    public void Click_Restar(View view) {
        String text = num.getText().toString();

        if (operator.isEmpty()) {
            firstNum = Double.parseDouble(text);
        } else {
            double secondNum = Double.parseDouble(text.substring(opPos));
            firstNum = calcular(firstNum, secondNum, operator);
        }
        operator = "-";
        num.append("-");
        opPos = num.getText().length();
    }
    private boolean grados = true;

    public void Click_TrigUnit(View view) {
        grados = !grados;
        Button b = (Button) view;
        b.setText(grados ? "DEG" : "RAD");
    }
    public void Click_Seno(View view) {
        num.append("sin");
        trig = "sin";
        opPos = num.getText().length();
    }

    public void Click_Coseno(View view) {
        num.append("cos");
        trig = "cos";
        opPos = num.getText().length();
    }

    public void Click_Tangente(View view) {
        num.append("tan");
        trig = "tan";
        opPos = num.getText().length();
    }
}