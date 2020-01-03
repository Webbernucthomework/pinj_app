package com.example.pinj_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button click;
    private TextView rank;
    public static int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.button);

        rank = findViewById(R.id.textView);

        //final int r = (int)(Math.random()*10);

        //final String a = String.valueOf(r);


            click.setOnClickListener(new View.OnClickListener() {
                @Override


                public void onClick(View v) {

                    if (flag == 0) {
                        final int r = (int)(Math.random()*10);
                        final String a = String.valueOf(r);
                        rank.setText(a);
                        flag = 1;
                    } else {
                        final int r = (int)(Math.random()*10);
                        final String a = String.valueOf(r);
                        rank.setText(a);
                        flag = 0;
                    }

                }


            });

    }


}
