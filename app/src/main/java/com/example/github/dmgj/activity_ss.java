package com.example.github.dmgj;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.github.hellowlrld.R;
import com.example.github.dmgj.util.SearchAdapter;

public class activity_ss extends Activity implements View.OnClickListener  {

    private LinearLayout empty;
    private AutoCompleteTextView search;
    private ListView listView;
    public static int length = 0;
    public static String student [] = new String[200];





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.addActivity(this);
        setContentView(R.layout.activity_ss);
        StatusBarCompat.compat(this, R.color.abcd);

        Resources res =getResources();
        final String[] str = res.getStringArray(R.array.languages);
        final String[] temp = res.getStringArray(R.array.result);
        final String[][] result = getTwoDimensionalArray(temp);

        final String[] languages = res.getStringArray(R.array.languages);
        listView =  findViewById(R.id.list);//得到ListView对象的引用
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,languages));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(result[i][1]!=null || result[2][length]!=null) {
                    for (length = 1; result[i][length] != null; length++) {
                        student[length-1] = result[i][length];
                    }

                    Intent intent = new Intent(activity_ss.this, activity_xuanze.class);
                    startActivity(intent);
                    activity_ss.this.finish();
                }

            }
        });

        /*为ListView设置Adapter来绑定数据*/




        empty = this.<LinearLayout>findViewById(R.id.empty);
        empty.setOnClickListener(this);
        search = this.<AutoCompleteTextView>findViewById(R.id.search);
        // 自动提示适配器
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);
        // 支持拼音检索
        final SearchAdapter<String> adapter = new SearchAdapter<String>(activity_ss.this,
                android.R.layout.simple_list_item_1, str, SearchAdapter.ALL);
        search.setAdapter(adapter);

        search.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String bj = ((TextView)view).getText().toString();
                for(int a = 0;a<temp.length;a++){
                    if(bj.equals(result[a][0])){
                        for (length = 1; result[a][length] != null; length++) {
                            student[length-1] = result[a][length];
                        }
                    }



//                if(result[i][1]!=null || result[i][2]!=null) {
//                    for (length = 1; result[i][length] != null; length++) {
//                        student[length-1] = result[i][length];
//                    }


                    Intent intent = new Intent(activity_ss.this, activity_xuanze.class);
                    startActivity(intent);
                    activity_ss.this.finish();
                }

            }});
    }

    private String[][] getTwoDimensionalArray(String[] array) {
        String[][] twoDimensionalArray = new String[200][200];
        for (int i = 0; i < array.length; i++) {
            String[] tempArray = array[i].split(",");
            if (twoDimensionalArray == null) {
                twoDimensionalArray = new String[array.length][tempArray.length];
            }
            for (int j = 0; j < tempArray.length; j++) {
                twoDimensionalArray[i][j] = tempArray[j];
            }
        }
        return twoDimensionalArray;
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        ActivityManager.removeActivity(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.empty:
                search.setText("");
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(activity_ss.this,MainActivity.class);
        startActivity(intent);
        activity_ss.this.finish();
    }

}
