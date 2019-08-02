package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertLKR(View view) {
        EditText editText = findViewById(R.id.editText);

        double value = Double.parseDouble(editText.getText().toString());
        double LKRvalue = value * 180;

        Toast.makeText(this, "LKR Value: "+"Rs."+LKRvalue, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
