package com.dov.hello;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText firstnameEdit;
    private EditText lastnameEdit;
    private TextView greetText;
    private Button greetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnameEdit = findViewById(R.id.firstname_edit);
        lastnameEdit = findViewById(R.id.lastname_edit);
        greetText = findViewById(R.id.greet_text);
        greetButton = findViewById(R.id.greet_button);

        greetButton.setOnClickListener(v -> {
            greetText.setText("Bonjour " + firstnameEdit.getText().toString() + " " + lastnameEdit.getText().toString() + " !");
        });

    }
}