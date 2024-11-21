package com.dov.hello;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private EditText firstnameEdit;
    private EditText lastnameEdit;
    private TextView greetText;
    private Button greetButton;
    private Button toastButton;
    private Button snackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnameEdit = findViewById(R.id.firstname_edit);
        lastnameEdit = findViewById(R.id.lastname_edit);
        greetText = findViewById(R.id.greet_text);
        greetButton = findViewById(R.id.greet_button);
        toastButton = findViewById(R.id.toast_button);
        snackButton = findViewById(R.id.snack_button);

        greetButton.setOnClickListener(v -> {
            greetText.setText("Bonjour " + firstnameEdit.getText().toString() + " " + lastnameEdit.getText().toString() + " !");
        });


        toastButton.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour", Toast.LENGTH_SHORT).show();

        });

        snackButton.setOnClickListener(v -> {
            Snackbar.make(snackButton, "Bonjour et aurevoir", Snackbar.LENGTH_LONG).setAction("Aurevoir", view -> {
                finish();
            }).show();
        });

    }
}