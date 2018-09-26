package com.example.github.dmgj;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.github.hellowlrld.R;



public class activity_qtdm extends Activity {

    public static int x = 0;
    private Button bt4;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.addActivity(this);
        setContentView(R.layout.activity_qtdm);
        StatusBarCompat.compat(this, R.color.abcd);

        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(new activity_qtdm.MyListener());
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        ActivityManager.removeActivity(this);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(activity_qtdm.this, activity_xuanze.class);
        startActivity(intent);
        activity_qtdm.this.finish();
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

            Name_qt.tr();

//            Resources res =getResources();
//            String[] languages = res.getStringArray(R.array.languages);
//            for (int i = 0;i<languages.length;i++){
//                db = helper.getWritableDatabase();
//                db.execSQL("insert into records(name) values('" + (languages[i]) + "')");
//            }
            bt4.setText("下一页");
            textView10.setText(Name_qt.zx[0]);
            textView11.setText(Name_qt.zx[1]);
            textView12.setText(Name_qt.zx[2]);
            textView13.setText(Name_qt.zx[3]);
            textView14.setText(Name_qt.zx[4]);
            textView15.setText(Name_qt.zx[5]);
            textView16.setText(Name_qt.zx[6]);
            textView17.setText(Name_qt.zx[7]);
            textView18.setText(Name_qt.zx[8]);
            x = x+9;
            if(x>activity_ss.length){
                bt4.setText("重新点名");
                x = 0;
                Toast tot = Toast.makeText(
                    activity_qtdm.this,
                    "点名结束!!!",
                    Toast.LENGTH_LONG);
            tot.show();
            }
        }
    }
}
