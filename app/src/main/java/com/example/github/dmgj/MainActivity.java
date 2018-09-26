package com.example.github.dmgj;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.github.hellowlrld.R;

public class MainActivity extends Activity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.addActivity(this);
        setContentView(R.layout.activity_main);
        StatusBarCompat.compat(this, R.color.abcd);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activity_ss.class));

            }

        });

    }
    private long mPressedTime = 0;

    @Override
    public void onBackPressed() {

        long mNowTime = System.currentTimeMillis();
        if((mNowTime - mPressedTime) > 2000){
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            mPressedTime = mNowTime;
         }
         else{

            ActivityManager.finishAll();
            this.finish();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0); //常规java、c#的标准退出法，返回值为0代表正常退出
         }
    }




}

