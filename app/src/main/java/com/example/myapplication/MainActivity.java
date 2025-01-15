package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.klasy;
import java.util.Random;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public TextView wynik1;
    public TextView wynik2;
    public TextView wynik3;
    public TextView wynik4;
    public TextView wynik5;
    public ImageView pol1;
    public ImageView pol2;
    public ImageView pol3;
    public ImageView pol4;
    public ImageView pol5;
    public TextView los;
    public TextView wynikgryp;
    public TextView rzuty;
    public Button start;
    private Button reset;
    public int wynikgry;
    public int ilosc;
    public int wyniklos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wynik1 = findViewById(R.id.Result1);
        wynik2 = findViewById(R.id.Result2);
        wynik3 = findViewById(R.id.Result3);
        wynik4 = findViewById(R.id.Result4);
        wynik5 = findViewById(R.id.Result5);
        pol1 = findViewById(R.id.pole1);
        pol2 = findViewById(R.id.pole2);
        pol3 = findViewById(R.id.pole3);
        pol4 = findViewById(R.id.pole4);
        pol5 = findViewById(R.id.pole5);

        los = findViewById(R.id.los);
        wynikgryp = findViewById(R.id.gameresult);
        rzuty = findViewById(R.id.numthrow);
        start = findViewById(R.id.start);
        reset = findViewById(R.id.reset);


        los.setText("Wynik tego losowania : " + wyniklos);
        wynikgryp.setText("Wynik gry: " + wynikgry);
        rzuty.setText("Liczba rzutów: " + ilosc);


                klasy klasy = new klasy(wynik1, wynik2, wynik3, wynik4, wynik5,pol1,pol2,pol3,pol4,pol5, los, wynikgryp, rzuty, start, reset);
                start.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        klasy.rollDice();
                    }
                });

                reset.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        klasy.resetgame();
                    }
                });
            }
        }
