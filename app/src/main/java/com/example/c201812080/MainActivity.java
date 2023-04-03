package com.example.c201812080;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 = findViewById(R.id.editText2);
        View.OnClickListener lis = new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s= e2.getText().toString()+" "+e1.getText().toString();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                String ss=e1.getText().toString();
                e1.setText(e2.getText());
                e2.setText(ss);
            }
        };
        b.setOnClickListener(lis);
    }

}