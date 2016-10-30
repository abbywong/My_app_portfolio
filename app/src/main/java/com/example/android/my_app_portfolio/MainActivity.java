package com.example.android.my_app_portfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            initView();}


         // 方法：初始化View
         private void initView() {
             btn1 = (Button) findViewById(R.id.spotify_streamer);
             btn2 = (Button) findViewById(R.id.score_app);
             btn3 = (Button) findViewById(R.id.library_app);
             btn4 = (Button) findViewById(R.id.build_it_bigger);
             btn5 = (Button) findViewById(R.id.XYZ_reader);
             btn6 = (Button) findViewById(R.id.capstone_my_own_app);

             btn1.setOnClickListener(new MyClickListener());
            btn2.setOnClickListener(new MyClickListener());
             btn3.setOnClickListener(new MyClickListener());
             btn4.setOnClickListener(new MyClickListener());
             btn5.setOnClickListener(new MyClickListener());
             btn6.setOnClickListener(new MyClickListener());
         }
    class MyClickListener implements OnClickListener {
        @Override
             public void onClick(View v) {
            switch (v.getId()) {
                                                  default:
                    Toast.makeText(MainActivity.this, "This button will launch my Gradle Project App!", Toast.LENGTH_LONG).show();
                    break;
                   }
             }
    }
}






