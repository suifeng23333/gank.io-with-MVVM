package com.example.qqq34.mvvmdemo.view.fragment;

import android.databinding.BaseObservable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qqq34.mvvmdemo.core.BaseFragment;
import com.example.qqq34.mvvmdemo.core.IPresenter;
import com.example.qqq34.mvvmdemo.databinding.FragmentFuliBinding;
import com.example.qqq34.mvvmdemo.presenter.FuliFragmentPresenter;
import com.example.qqq34.mvvmdemo.viewmodel.FuliViewModel;

/**
 * Created by 康颢曦 on 2016/11/27.
 */

public class FuliFragment extends BaseFragment {
    private FragmentFuliBinding binding;
    private FuliFragmentPresenter fuliFragmentPresenter;
    private FuliViewModel fuliViewModel;
    @Override
    protected View initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentFuliBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void initListeners() {

    }

    @Override
    public void initOldData(@Nullable BaseObservable baseObservable) {
        fuliViewModel = (FuliViewModel) baseObservable;
        binding.setViewmodel(fuliViewModel);
        fuliFragmentPresenter = new FuliFragmentPresenter();
    }

    @Override
    public void initData() {
        fuliViewModel =new FuliViewModel("fuli");
        binding.setViewmodel(fuliViewModel);
        fuliFragmentPresenter = new FuliFragmentPresenter();
    }

    @Override
    public IPresenter getPresenter() {
        return fuliFragmentPresenter;
    }

    @Override
    public BaseObservable getViewModel() {
        return fuliViewModel;
    }
}