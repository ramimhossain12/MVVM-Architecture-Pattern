package com.example.mvvm_architecture_pattern.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm_architecture_pattern.Adapter.UserAdapter;
import com.example.mvvm_architecture_pattern.R;
import com.example.mvvm_architecture_pattern.model.User;
import com.example.mvvm_architecture_pattern.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModell;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityViewModell = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        mainActivityViewModell.getAllUserData().observe(this, new Observer<User[]>() {
            @Override
            public void onChanged(User[] users) {
                 recyclerView.setAdapter(new UserAdapter(users)  );
            }
        });






    }
}