package com.example.acfun.bookviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by acfun on 2016/12/6.
 */

/**
 * FragmentPagerAdapter最好用于页面数量较少且变化较少的情况，
 * 因为用户访问过的fragment都会被保存在内存中，会造成大量内存开销
 *
 * 以下源自：http://www.jianshu.com/p/3d68d6ec9468
 *
 * FragmentStatePagerAdapter:在切换不同的Fragment的时候，会把前面的Fragment销毁，
 * 而系统在销毁前，会把Fragment的Bundle在它的nSaveInstanceState(Bundle)保存下来。
 * 等用户切换回来的时候，Fragment就会根据它的instance state恢复出来。
 *
 *FragmentPagerAdapter：Fragment在切换的时候，不会销毁，而只是调用事务中的detach方法，
 * 这种方法，只会把Fragment的view销毁，而保留了以前的Fragment对象。所以通过这种方式创建的Fragment一直不会被销毁。
 *
 */
public class PagerFragmentAdapter extends FragmentPagerAdapter {

    public PagerFragmentAdapter(FragmentManager fm) {
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
}
