package com.dorbismuth.apptst;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridLayout ops , nums1 , nums2 , nums3;
    String[] opsList = {"+","-","*","/"};
    String[] opsList_keys = {"-1","-2","-3","-4"};
    String[] nums = {"0","1","2","3","4","5","6","7","8","9","10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ops = (GridLayout) findViewById(R.id.ops);
        nums1 = (GridLayout) findViewById(R.id.nums1);
        nums2 = (GridLayout) findViewById(R.id.nums2);
        nums3 = (GridLayout) findViewById(R.id.nums3);
        for(int i=0;i<opsList.length;i++){
            Button btn = new Button(this);
            btn.setLayoutParams(new ViewGroup.LayoutParams(GridLayout.LayoutParams.WRAP_CONTENT, GridLayout.LayoutParams.WRAP_CONTENT));
            btn.setText(opsList[i]);
            btn.setId(View.generateViewId());
            btn.setTag(opsList_keys[i]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickedOPS(v);
                }
            });
            ops.addView(btn);
        }
        for(int i=0;i<4;i++){
            Button btn = new Button(this);
            btn.setLayoutParams(new ViewGroup.LayoutParams(GridLayout.LayoutParams.WRAP_CONTENT, GridLayout.LayoutParams.WRAP_CONTENT));
            btn.setText(nums[i]);
            btn.setId(View.generateViewId());
            btn.setTag(i);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickedNums(v);
                }
            });
            nums1.addView(btn);
        }
        for(int i=4;i<8;i++){
            Button btn = new Button(this);
            btn.setLayoutParams(new ViewGroup.LayoutParams(GridLayout.LayoutParams.WRAP_CONTENT, GridLayout.LayoutParams.WRAP_CONTENT));
            btn.setText(nums[i]);
            btn.setId(View.generateViewId());
            btn.setTag(i);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickedNums(v);
                }
            });
            nums2.addView(btn);
        }
        for(int i=8;i<11;i++){
            Button btn = new Button(this);
            btn.setLayoutParams(new ViewGroup.LayoutParams(GridLayout.LayoutParams.WRAP_CONTENT, GridLayout.LayoutParams.WRAP_CONTENT));
            btn.setText(nums[i]);
            btn.setTag(i);
            btn.setId(View.generateViewId());
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickedNums(v);
                }
            });
            nums3.addView(btn);
        }

    }
    public void onClickedNums(View v){
        switch (Integer.valueOf((Integer) v.getTag())){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }
    public void onClickedOPS(View v){

    }
    public String calc(String num1 , String num2,int mode){
        int a = Integer.valueOf(num1);
        int b = Integer.valueOf(num2);
        int calc = 0;
        switch (mode){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return  String.valueOf(calc);
    }
}
