package com.example.acfun.bookviewpager.base;

import android.support.v4.app.Fragment;

/**
 * Created by acfun on 2016/12/6.
 */

/**
 * 该Fragment旨在实现懒加载功能
 */

public abstract class LazyFragment extends Fragment {
    protected boolean isVisible;

    /**
     * 该方法在于告诉系统，这个Fragment的UI是否可见。
     * 这个方法从源码上可以看到在FragmentPagerAdapter和FragmentStatePagerAdapter的instantiateItem和setPrimaryItem中被调用，
     * 因此在这里重写这个方法旨在获得FragmentUI当前的可见性以判断使用加载数据
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()){
            isVisible=true;
            onVisible();
        }else {
            isVisible=false;
            onInvisible();
        }
    }

    protected void onVisible(){
        lazyLoad();
    }

    protected abstract void lazyLoad();

    protected void onInvisible(){}
}
