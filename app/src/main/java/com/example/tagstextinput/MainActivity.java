package com.example.tagstextinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton materialButton = findViewById(R.id.btn);
        TagsInputEditText editText = findViewById(R.id.tagsET);

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, Objects.requireNonNull(editText.getText()).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}