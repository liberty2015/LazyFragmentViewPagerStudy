package com.example.acfun.bookviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by acfun on 2016/12/6.
 */

public class PagerFragmentStateAdapter extends FragmentStatePagerAdapter {
    public PagerFragmentStateAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    /**
     *这里是ViewPager动态加载的重难点
     * 在这里返回PagerAdapter.POSITION_NONE，就能通知ViewPager删除已经不再主页面的View
     * 因为普通的FragmentPagerAdapter在加载一次fragment之后就会一直在内存中，直到程序退出
     * @param object
     * @return
     */
    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
