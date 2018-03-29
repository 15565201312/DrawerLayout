package com.example.administrator.day01_test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.day01_test.fragment.LanyaFragment;
import com.example.administrator.day01_test.fragment.LiuliangFragment;
import com.example.administrator.day01_test.fragment.MyFragment;
import com.example.administrator.day01_test.fragment.SheziFragment;

public class MainActivity extends AppCompatActivity {


    private ImageView img;
    public static DrawerLayout liner;
    public static NavigationView navigation;
    private RadioButton but_my;
    private RadioButton but_shezi;
    private RadioButton but_liuliang;
    private RadioButton but_lanya;
    private FrameLayout fragment;
    private RadioGroup rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment, new MyFragment())
                .commit();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liner.openDrawer(navigation);


            }
        });

        rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){

                    case R.id.but_my:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new MyFragment()).commit();
                        break;
                    case R.id.but_lanya:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new LanyaFragment()).commit();
                        break;

                    case R.id.but_liuliang:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new LiuliangFragment()).commit();
                        break;

                    case R.id.but_shezi:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new SheziFragment()).commit();
                        break;
                }
            }
        });
    }


    private void initView() {
        img = (ImageView) findViewById(R.id.img);

        liner = (DrawerLayout) findViewById(R.id.liner);
        navigation = (NavigationView) findViewById(R.id.navigation);
        liner.setScrimColor(Color.TRANSPARENT);


        but_my = (RadioButton) findViewById(R.id.but_my);

        but_shezi = (RadioButton) findViewById(R.id.but_shezi);

        but_liuliang = (RadioButton) findViewById(R.id.but_liuliang);

        but_lanya = (RadioButton) findViewById(R.id.but_lanya);

        fragment = (FrameLayout) findViewById(R.id.fragment);

        rad = (RadioGroup) findViewById(R.id.rad);

    }
}
