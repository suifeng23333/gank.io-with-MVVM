package com.example.qqq34.mvvmdemo.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.qqq34.mvvmdemo.BR;

import java.io.Serializable;

/**
 * Created by 康颢曦 on 2016/11/27.
 */

public class WebViewModel  extends BaseObservable implements Serializable {
    private String name;

    public WebViewModel(String name) {
        this.name = name;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
