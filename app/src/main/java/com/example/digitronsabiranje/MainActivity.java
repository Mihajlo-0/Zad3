package com.example.digitronsabiranje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editBroj1,editBroj2;
    TextView rezultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBroj1=(EditText) findViewById(R.id.editTextNumber);
        editBroj2=(EditText) findViewById(R.id.editTextNumber2);
        rezultat=(TextView) findViewById(R.id.rezultatText);
    }
    public void onClickSaberi(View view){
        double rez=Double.parseDouble(String.valueOf(editBroj1.getText()))+Double.parseDouble(String.valueOf(editBroj2.getText()));
        rezultat.setText(String.valueOf(rez));

    }
}