package com.example.administrator.day01_test.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.day01_test.MainActivity;
import com.example.administrator.day01_test.R;

import static com.example.administrator.day01_test.MainActivity.navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    private ImageView img;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        initView(view);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.liner.closeDrawer(navigation);
            }
        });
        return view;
    }

    private void initView(View view) {
        img = (ImageView) view.findViewById(R.id.img);
    }
}
