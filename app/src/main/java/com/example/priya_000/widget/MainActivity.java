package com.example.priya_000.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {
     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img=(ImageView)findViewById(R.id.img);
        tv=(TextView)findViewById(R.id.ed);

        final Random r=new Random();
        img.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        img.setImageResource(putImage(r.nextInt(6)));
                    }
                }
        );

    }

    public int putImage(int num)
    {
        int image=0;

        switch(num)
        {
            case 0:
                image=R.drawable.a;
                tv.setText("You got 1");
                break;
            case 1:
                image=R.drawable.b;
                tv.setText("You got 2");
                break;
            case 2:
                image=R.drawable.c;
                tv.setText("You got 3");
                break;
            case 3:
                image=R.drawable.d;
                tv.setText("You got 4");
                break;
            case 4:
                image=R.drawable.e;
                tv.setText("You got 5");
                break;
            case 5:
                image=R.drawable.f;
                tv.setText("You got 6");
                break;
        }
        return image;
    }
}
