package com.example.digitronsabiranje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editBroj1,editBroj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBroj1=(EditText) findViewById(R.id.editTextNumber);
        editBroj2=(EditText) findViewById(R.id.editTextNumber2);
    }
    public void onClickSaberi(View view){
        double rez=Double.parseDouble(editBroj1.getText()))+Double.parseDouble(editBroj2.getText());

    }
}