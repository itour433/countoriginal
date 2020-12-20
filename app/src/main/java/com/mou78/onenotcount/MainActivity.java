package com.mou78.onenotcount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView saido;
    int count;
    int setCount;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.count);
        saido = (TextView)findViewById(R.id.saido);
        pref = getSharedPreferences("countbox",MODE_PRIVATE);
        int setCount = pref.getInt("number",0);
        textView.setText(setCount +"");


    }

    public void one(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount + 1;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
        } else if(setCount >= 100) {
            saido.setText("めっちゃ増えた！！！");
        } else if(setCount >= 50) {
            saido.setText("50を超えた！！！");
        } else if(setCount >= 30) {
        saido.setText("30を超えた！！！");
        }
    }

    public  void minus(View v) {
        int setCount = pref.getInt("number",0);
        setCount = setCount - 1;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
            saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
            saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
            saido.setText("30を超えた！！！");
            }
        }
    public void two(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount + 2;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void three(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount + 3;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void four(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount + 4;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void minustwo(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount - 2;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void minusfour(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount - 4;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

//        int setCount = pref.getInt("number",0);
        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void minusthree(View v){
        int setCount = pref.getInt("number",0);
        setCount = setCount - 2;
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        editor.putInt("number", setCount);
        editor.commit();

//        int setCount = pref.getInt("number",0);
        textView.setText(setCount +"");


        if (setCount <= 30) {
            saido.setText("カウントしよう！");
            } else if(setCount >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(setCount >= 50) {
                saido.setText("50を超えた！！！");
            } else if(setCount >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

    public void delete(View v){
        SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();

        textView.setText(setCount +"");

        if (count <= 30) {
                saido.setText("カウントしよう！");
            } else if(count >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if(count >= 50) {
                saido.setText("50を超えた！！！");
            } else if(count >= 30) {
                saido.setText("30を超えた！！！");
            }
        }

        //カウントした数字を共有
        public void share(View v){

            int setCount = pref.getInt("number",0);
            SharedPreferences.Editor editor = pref.edit();
            SharedPreferences pref= getSharedPreferences("countbox", Context.MODE_PRIVATE);
            editor.putInt("number", setCount);

        ShareCompat.IntentBuilder builder
                = ShareCompat.IntentBuilder.from(MainActivity.this);
        String subject = "カウントした数字について";
        String bodyText = setCount + "回カウントされました";
        builder.setSubject(subject)
                .setText(bodyText)
                .setType("text/plain");
        Intent intent = builder.createChooserIntent();

        builder.startChooser();
            }

    }