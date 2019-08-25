package com.example.parentcollegeinteraction.AccountActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parentcollegeinteraction.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView t=(TextView)findViewById(R.id.textView2);
        Button b=(Button)findViewById(R.id.button);
        ImageView iv=(ImageView)findViewById(R.id.imageView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, AdminLogin.class);
                startActivity(i);


            }
        });
    }
}
