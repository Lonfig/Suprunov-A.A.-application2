package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


    public class MainActivity extends AppCompatActivity {
        private Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button1);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v){
                    openActivity1();
                }
            });
        }
        public void openActivity1() {
            Intent intent= new Intent(this, activity_2.class);
            startActivity(intent);
        }
    }