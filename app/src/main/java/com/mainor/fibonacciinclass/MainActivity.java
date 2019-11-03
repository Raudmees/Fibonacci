package com.mainor.fibonacciinclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView errorText = findViewById(R.id.errorBox);
        final EditText inputEditText = findViewById(R.id.mainactivity_et_input);
        final Button goButton = findViewById(R.id.mainactivity_button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 String input = inputEditText.getText().toString();

                if (input.trim().length()==0) {

                    errorText.setVisibility(View.VISIBLE);

                } else {
                    int inputNumber = Integer.parseInt(inputEditText.getText().toString());

                    if (inputNumber > 0) {

                        startActivity(new Intent(context, RecyclerActivity.class).putExtra("Input", (int) inputNumber));
                    } else {
                        errorText.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
    }
}
