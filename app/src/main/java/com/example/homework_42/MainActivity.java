package com.example.homework_42;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// поля
    private EditText idIn, departurePlaceIn,departureDateIn,arrivalPlaceIn,arrivalDateIn;
    private TextView costTIn;
    private EditText button;

    private  int id;
    private float cost = 750.5f;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idIn = findViewById(R.id.idIn);
        departurePlaceIn = findViewById(R.id.departurePlaceIn);
        departureDateIn = findViewById(R.id.departureDateIn);
        arrivalPlaceIn = findViewById(R.id.arrivalPlaceIn);
        arrivalDateIn = findViewById(R.id.arrivalDateIn);
        costTIn = findViewById(R.id.costTIn);
        button = findViewById(R.id.button);

        costTIn.setText("Стоимость билета:" + cost + "монет");

        button.setOnClickListener(listener);
    }



    private View.OnClickListener listener = view -> {
    id = Integer.parseInt(idIn.getText().toString());
        Ticket ticket = new Ticket(id,
                departurePlaceIn.getText().toString(),
                departureDateIn.getText().toString(),
                arrivalPlaceIn.getText().toString(),
                arrivalDateIn.getText().toString(),
                Float.parseFloat(costTIn.getText().toString()));
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(Ticket.class.getSimpleName(), ticket);
        startActivity(intent);
    };
}