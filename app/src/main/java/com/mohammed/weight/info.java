package com.mohammed.weight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class info extends AppCompatActivity {
TextView textView2,textViewM,textViewJupiter,textViewSatun,textViewNeptune,textViewUranus,textViewEarth,textViewVenus,t_mars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
       textView2=(TextView)findViewById(R.id.textView2);
        textViewM=(TextView)findViewById(R.id.textViewM);
        t_mars=(TextView)findViewById(R.id.t_mars);
        textViewVenus=(TextView)findViewById(R.id.textViewVenus);
        textViewEarth=(TextView)findViewById(R.id.textViewEarth);
        textViewUranus=(TextView)findViewById(R.id.textViewUranus);
        textViewNeptune=(TextView)findViewById(R.id.textViewNeptune);
        textViewSatun=(TextView)findViewById(R.id.textViewSatun);
        textViewJupiter=(TextView)findViewById(R.id.textViewJupiter);

        textView2.setText(getIntent().getStringExtra("value"));
        String s=textView2.getText().toString();
        float a=Float.parseFloat(s);
        float mercury,mars,venus,earth,uranus,neptune,satum,jupiter;

        mercury =(a*3.7f)/9.81f;
        mars =(a*3.711f)/9.81f;
        venus=(a*8.87f)/9.81f;
       earth=a*1.0f;
        uranus=(a*8.69f)/9.81f;
        neptune=(a*11.15f)/9.81f;
        satum=(a*10.44f)/9.81f;
        jupiter=(a*24.79f)/9.81f;
        textViewM.setText(String.valueOf(mercury));
        t_mars.setText(String.valueOf(mars));
        textViewVenus.setText(String.valueOf(venus));
        textViewEarth.setText(String.valueOf(earth));
        textViewUranus.setText(String.valueOf(uranus));
        textViewNeptune.setText(String.valueOf(neptune));
        textViewSatun.setText(String.valueOf(satum));
        textViewJupiter.setText(String.valueOf(jupiter));

    }
    public void back(View v){
        Intent intent=new Intent(info.this,MainActivity.class);
        startActivity(intent);
    }
}
