package com.example.zekipenguenson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout bayrak=findViewById(R.id.bayraklayout);
        final LinearLayout dunya=findViewById(R.id.dunyalayout);
        final LinearLayout kitap=findViewById(R.id.kitaplayout);
        final LinearLayout mat=findViewById(R.id.matlayout);
        final Button baslabuton=findViewById(R.id.startbtn);

        bayrak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="bayrak";
                bayrak.setBackgroundResource(R.drawable.round_back_white_stroke10);
                dunya.setBackgroundResource(R.drawable.round_back_white10);
                kitap.setBackgroundResource(R.drawable.round_back_white10);
                mat.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        dunya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="dunya";
                bayrak.setBackgroundResource(R.drawable.round_back_white10);
                dunya.setBackgroundResource(R.drawable.round_back_white_stroke10);
                kitap.setBackgroundResource(R.drawable.round_back_white10);
                mat.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        kitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="kitap";
                bayrak.setBackgroundResource(R.drawable.round_back_white10);
                dunya.setBackgroundResource(R.drawable.round_back_white10);
                kitap.setBackgroundResource(R.drawable.round_back_white_stroke10);
                mat.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="mat";
                bayrak.setBackgroundResource(R.drawable.round_back_white10);
                dunya.setBackgroundResource(R.drawable.round_back_white10);
                kitap.setBackgroundResource(R.drawable.round_back_white10);
                mat.setBackgroundResource(R.drawable.round_back_white_stroke10);

            }
        });

        baslabuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Lütfen bir konu seçiniz!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);

                }
            }
        });


    }
}