package com.example.homework_42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView infoT;
private Button button;
private Ticket ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.newTicket);
        infoT = findViewById(R.id.infoT);
        button.setOnClickListener(listener);
        Bundle bundleticket = getIntent().getExtras();
        if (bundleticket != null) {
            ticket = (Ticket) bundleticket.getSerializable(Ticket.class.getSimpleName());
            infoT.setText(ticket.toString());
        }
    }
private View.OnClickListener listener = view -> {
    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
};

}