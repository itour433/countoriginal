package com.mou78.onenotcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView saido;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.count);
        saido = (TextView)findViewById(R.id.saido);
        count = 0;

    }

    public void one(View v){
        count = count + 1;
        textView.setText(count +"");

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

    public  void minus(View v) {
        count = count - 1;
        textView.setText(count + "");
        if (count <= 30) {
            saido.setText("カウントしよう！");
            } else if (count >= 100) {
                saido.setText("めっちゃ増えた！！！");
            } else if (count >= 50) {
                saido.setText("50を超えた！！！");
            } else if (count >= 30) {
                saido.setText("30を超えた！！！");
            }
        }
    public void two(View v){
        count = count +2;
        textView.setText(count +"");
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

    public void three(View v){
        count = count +3;
        textView.setText(count +"");
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

    public void four(View v){
        count = count +4;
        textView.setText(count +"");
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

    public void minustwo(View v){
        count = count -2;
        textView.setText(count +"");
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

    public void minusfour(View v){
        count = count -4;
        textView.setText(count +"");
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

    public void minusthree(View v){
        count = count -2;
        textView.setText(count +"");
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

    public void delete(View v){
        count = 0;
        textView.setText(count +"");
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
}