package com.example.mvvm_architecture_pattern.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_architecture_pattern.model.User;
import com.example.mvvm_architecture_pattern.model.UserRepository;

public class MainActivityViewModel extends AndroidViewModel {


    UserRepository userRepository;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application );
    }
    public LiveData<User[]> getAllUserData(){
        return userRepository.getUserData();
    }
}
