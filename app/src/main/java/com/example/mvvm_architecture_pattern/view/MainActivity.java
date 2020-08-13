package com.example.mvvm_architecture_pattern.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

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






    }
}