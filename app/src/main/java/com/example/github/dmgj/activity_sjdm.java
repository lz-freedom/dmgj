package com.example.github.dmgj;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.github.hellowlrld.R;

public class activity_sjdm extends BaseActivity {


    private Button bt3;
    private TextView textView0;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;

    @Override
    public int getLayoutId() {
        return R.layout.activity_sjdm;
    }

    @Override
    public void initView() {
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(new activity_sjdm.MyListener());
        textView0 = (TextView) findViewById(R.id.textView0);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ActivityManager.addActivity(this);
//        setContentView(R.layout.activity_sjdm);
//        StatusBarCompat.compat(this, R.color.abcd);
//
//        bt3 = (Button) findViewById(R.id.bt3);
//        bt3.setOnClickListener(new activity_sjdm.MyListener());
//        textView0 = (TextView) findViewById(R.id.textView0);
//        textView1 = (TextView) findViewById(R.id.textView1);
//        textView2 = (TextView) findViewById(R.id.textView2);
//        textView3 = (TextView) findViewById(R.id.textView3);
//        textView4 = (TextView) findViewById(R.id.textView4);
//        textView5 = (TextView) findViewById(R.id.textView5);
//        textView6 = (TextView) findViewById(R.id.textView6);
//        textView7 = (TextView) findViewById(R.id.textView7);
//        textView8 = (TextView) findViewById(R.id.textView8);
//
//    }
//
//    @Override
//    protected void onDestroy() {
//
//        super.onDestroy();
//        ActivityManager.removeActivity(this);
//    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(activity_sjdm.this, activity_xuanze.class);
        startActivity(intent);
        activity_sjdm.this.finish();
    }


    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
//            Toast tot = Toast.makeText(
//                    MainActivity.this,
//                    "",
//                    Toast.LENGTH_LONG);
//            tot.show();
            String xz[] = {"1号","2号","3号","4号","5号","6号","7号","8号","9号"};
            Name.tr();
            bt3.setText("再来一次");
            textView0.setText(Name.zx[0]);
            textView1.setText(Name.zx[1]);
            textView2.setText(Name.zx[2]);
            textView3.setText(Name.zx[3]);
            textView4.setText(Name.zx[4]);
            textView5.setText(Name.zx[5]);
            textView6.setText(Name.zx[6]);
            textView7.setText(Name.zx[7]);
            textView8.setText(Name.zx[8]);
        }
    }
}
