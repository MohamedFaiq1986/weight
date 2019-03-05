package com.mohammed.weight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);

    }
    public void bbb(View v){
        String s=editText.getText().toString();
        Intent intent=new Intent(MainActivity.this,info.class);
        intent.putExtra("value",s);
        startActivity(intent);

    }
}
