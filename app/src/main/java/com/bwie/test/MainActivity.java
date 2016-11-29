package com.bwie.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * autour: 梁萌萌
 * date: 2016/11/29 20:05 
 * update: 2016/11/29
 */
public class MainActivity extends AppCompatActivity {

    private EditText et;
    private Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataFragment df=new DataFragment();

                Bundle bundle = new Bundle();
                String str = et.getText().toString().trim();
                bundle.putString("str",str);
                df.setArguments(bundle);

                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fm,df,"df");
                transaction.commit();
            }
        });


    }

}
