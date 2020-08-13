package com.example.mvvm_architecture_pattern.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {


    //For Live Data

    MutableLiveData<String> resultLiveData;

    public MutableLiveData<String> addFunction(String value1, String value2) {

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 + num2;
        if (resultLiveData==null){
            resultLiveData = new MutableLiveData<>();
        }
        resultLiveData.setValue(String.valueOf(result));
        return resultLiveData;

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
