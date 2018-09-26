package com.example.github.dmgj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.github.hellowlrld.R;

/**
 * Created by thunder on 2018/9/26
 * <p>
 * 类的说明：
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.addActivity(this);
        StatusBarCompat.compat(this, getColor());
        setContentView(getLayoutId());
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }

    public abstract int getLayoutId();

    public abstract void initView();

    /**
     * 设置状态栏颜色 默认abcd  子布局如果颜色不同 重写该方法
     * @return
     */
    protected int getColor() {
        return R.color.abcd;
    }
}
