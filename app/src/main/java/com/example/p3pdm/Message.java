package com.example.p3pdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Message extends AppCompatActivity {

    private EditText mensagemEditText;
    private Button enviarButton;
    private RecyclerView mensagensRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        final FirebaseFirestore db = FirebaseFirestore.getInstance();
        mensagemEditText = findViewById(R.id.mensagemEditText);
        enviarButton = findViewById(R.id.enviarButton);
        mensagensRecyclerView = findViewById(R.id.mensagensRecyclerView);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagemEditText.getText();

                Map<String, Object> msg = new HashMap<>();
                msg.put("User", mensagemEditText);


                db.collection("Messages")
                        .add(msg);
            }
        });

    }
}
