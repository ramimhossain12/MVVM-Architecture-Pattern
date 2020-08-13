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
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityViewModell = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.btnID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultTest = mainActivityViewModell.addFunction(editText1.getText().toString(), editText2.getText().toString());
                String result1 = mainActivityViewModell
                        .multipleFunction(editText1.getText().toString(),editText2.getText().toString());
                Toast.makeText(MainActivity.this,result1,Toast.LENGTH_SHORT).show();

            }
        });


    }
}