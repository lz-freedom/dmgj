package com.example.github.dmgj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.github.hellowlrld.R;

public class activity_xuanze extends BaseActivity {

    private Button bt1;
    private Button bt2;


    @Override
    public int getLayoutId() {
        return R.layout.activity_xuanze;
    }

    @Override
    public void initView() {
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new activity_xuanze.MyListener());
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new activity_xuanze.MyListener1());
    }

    @Override
    protected int getColor() {
        return R.color.abcde;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ActivityManager.addActivity(this);
//        setContentView(R.layout.activity_xuanze);
//        StatusBarCompat.compat(this, R.color.abcde);
//
//        bt1 = (Button) findViewById(R.id.bt1);
//        bt1.setOnClickListener(new activity_xuanze.MyListener());
//        bt2 = (Button) findViewById(R.id.bt2);
//        bt2.setOnClickListener(new activity_xuanze.MyListener1());
//
//    }

    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(activity_xuanze.this, activity_sjdm.class);
            startActivity(intent);
            activity_xuanze.this.finish();

        }
    }

//    @Override
//    public void onDestroy() {
//
//        super.onDestroy();
//        ActivityManager.removeActivity(this);
//    }



    class MyListener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(activity_xuanze.this, activity_qtdm.class);
            startActivity(intent);
            activity_xuanze.this.finish();
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(activity_xuanze.this, activity_ss.class);
        startActivity(intent);
        activity_xuanze.this.finish();
    }
}

