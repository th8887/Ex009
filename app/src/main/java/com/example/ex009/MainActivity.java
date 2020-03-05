package com.example.ex009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn, big, eq, small, clear;
    TextView tvn1, tvn2, boo, per;
    int n1,n2,count,sum,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        big=(Button) findViewById(R.id.big);
        eq=(Button) findViewById(R.id.eq);
        small=(Button) findViewById(R.id.small);
        clear=(Button) findViewById(R.id.clear);

        tvn1=(TextView) findViewById(R.id.tvn1);
        tvn2=(TextView) findViewById(R.id.tvn2);
        boo=(TextView) findViewById(R.id.boo);
        per=(TextView) findViewById(R.id.per);

        n1=n2=count=sum=0;
        t=0;
    }

    public static Random rnd= new Random();
    public void start(View view) {
        n1= rnd.nextInt(100)+1;
        n2=rnd.nextInt(100)+1;
        tvn1.setText("number"+n1);
        tvn2.setText("number"+n2);
        per.setText(t);
        sum++;
    }

    public void presstoclear(View view) {
        tvn1.setText(" ");
        tvn2.setText(" ");
        boo.setText(" ");
        per.setText("0%");
    }

    public void b(View view) {
        if ((n1>n2)||(n2>n1)) {
            boo.setText("true");
            if (t==1){
                t=0;
            }
            else {
                t++;
                count++;
            }
        }
        else {
            boo.setText("false");
        }
        per.setText((count/sum)*100+"%");
    }

    public void e(View view) {
        if (n1==n2){
            boo.setText("true");
            if(t==1){
                t=0;
            }
            else {
                t++;
                count++;
            }
        }
        else {
            boo.setText("false");
        }
        per.setText((count/sum)*100+"%");
    }

    public void s(View view) {
        if ((n1<n2)||(n2<n1)){
            boo.setText("true");
            if(t>1){
                t=0;
            }
            else {
                t++;
                count++;
            }
        }
        else {
            boo.setText("false");
        }
        per.setText((count/sum)*100+"%");
    }
}
