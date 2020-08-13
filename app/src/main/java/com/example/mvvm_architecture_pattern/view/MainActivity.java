package com.example.mvvm_architecture_pattern.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvvm_architecture_pattern.R;
import com.example.mvvm_architecture_pattern.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModell;

    EditText editText1, editText2;
    Button button, subbtn, mulbtn, divbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityViewModell = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.btnID);
        subbtn = findViewById(R.id.btnsubID);
        mulbtn = findViewById(R.id.btnmulID);
        divbtn = findViewById(R.id.btndivlID);


        //add
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultTest = mainActivityViewModell.addFunction(editText1.getText().toString(), editText2.getText().toString());

                Toast.makeText(MainActivity.this, resultTest, Toast.LENGTH_SHORT).show();

            }
        });

        //sub
             subbtn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     String rest = mainActivityViewModell.subFunction(editText1.getText().toString(), editText2.getText().toString());

                     Toast.makeText(MainActivity.this, rest, Toast.LENGTH_SHORT).show();
                 }
             });

             //mul
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest = mainActivityViewModell.mulFunction(editText1.getText().toString(), editText2.getText().toString());

                Toast.makeText(MainActivity.this, rest, Toast.LENGTH_SHORT).show();
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest = mainActivityViewModell.divFunction(editText1.getText().toString(), editText2.getText().toString());

                Toast.makeText(MainActivity.this, rest, Toast.LENGTH_SHORT).show();
            }
        });

    }
}