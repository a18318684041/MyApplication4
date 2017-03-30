package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

public class MainActivity extends AppCompatActivity {

    private Gson mGson;
    private static final String TAG ="main" ;
    private EditText edt_company;
    private EditText edt_code;
    private Button btn;
    private TextView txt;
    private  String result;
    private Data data;//那个切割的类

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mGson = new Gson();
        edt_code = (EditText) findViewById(R.id.edt_code);
        edt_company = (EditText) findViewById(R.id.edt_company);
        btn = (Button) findViewById(R.id.btn_chaxun);
        txt = (TextView) findViewById(R.id.txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String company = edt_company.getText().toString().trim();
                        final String num = edt_code.getText().toString().trim();
                        result =  Demo.getRequest1(company,num) ;
                        Log.d(TAG, result+"  ");

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                String str = "";
                                if (result!=null){
                                    data = mGson.fromJson(result,Data.class);
                                    for (int i = 0; i <data.getResult().getList().size(); i++) {
                                        Log.d(TAG, "run: "+data.getResult().getList().get(i).getRemark());
                                         str += data.getResult().getList().get(i).getRemark()+" "+ data.getResult().getList().get(i).getDatetime()+"\n";
                                    }
                                    txt.setText(str);
                                }else {
                                    txt.setText("null");
                                }

                            }
                        });
                    }
                }).start();

            }
        });

    }
}
