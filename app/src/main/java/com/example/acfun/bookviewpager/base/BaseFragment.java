package com.example.acfun.bookviewpager.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by acfun on 2016/12/6.
 */

public abstract class BaseFragment extends LazyFragment {

    private View containerView;
    private boolean isPrepared;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int viewId=setLayoutId();
        if (viewId!=0){
            View view=inflater.inflate(viewId,container);
            containerView=view;
            isPrepared=true;
            lazyLoad();
            return view;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected abstract int setLayoutId();

    @Override
    protected void lazyLoad() {
        if (!isPrepared||!isVisible){
            return;
        }
        lazyLoadData();
    }

    protected  abstract void lazyLoadData();
}
