package com.example.p3pdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText idNomeUser;
    private Button idBtOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idNomeUser = findViewById(R.id.idNomeUser);
        idBtOk = findViewById(R.id.idBtOk);

        idBtOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idNomeUser.getText();
                Intent intent = new Intent(MainActivity.this, Message.class);
            }
        });

    }
}
