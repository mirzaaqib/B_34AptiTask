package com.pallefire.b_34aptitask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt,bt1,bt2,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt1);
        bt1= (Button) findViewById(R.id.bt2);
        bt2= (Button) findViewById(R.id.bt3);
        bt5= (Button) findViewById(R.id.bt4);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FourthFragment fourthFragment=new FourthFragment();
                fourthFragment.show(getSupportFragmentManager(),null);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdFragment thirdFragment=new ThirdFragment();
                thirdFragment.show(getSupportFragmentManager(),null);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment=new SecondFragment();
                secondFragment.show(getSupportFragmentManager(),null);

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();
                firstFragment.show(getSupportFragmentManager(),null);
            }
        });
    }
}
