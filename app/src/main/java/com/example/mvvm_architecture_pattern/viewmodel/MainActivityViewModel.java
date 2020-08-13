package com.example.mvvm_architecture_pattern.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public String addFunction(String value1, String value2) {

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 + num2;
        return String.valueOf(result);

    }
    //subtract function
    public String subFunction(String value1, String value2) {

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 - num2;
        return String.valueOf(result);

    }

    //multiple function
    public String mulFunction(String value1, String value2) {

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 * num2;
        return String.valueOf(result);

    }


    //division function

    public String divFunction(String value1, String value2) {

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 / num2;
        return String.valueOf(result);

    }

}
