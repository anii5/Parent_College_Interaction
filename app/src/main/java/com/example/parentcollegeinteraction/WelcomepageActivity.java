package com.example.parentcollegeinteraction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.parentcollegeinteraction.AccountActivity.AdminLogin;
import com.example.parentcollegeinteraction.AccountActivity.ParentLogin;
import com.example.parentcollegeinteraction.AccountActivity.ResetPasswordActivity;
import com.example.parentcollegeinteraction.AccountActivity.SignupActivity;
import com.example.parentcollegeinteraction.AccountActivity.TeacherLogin;

public class WelcomepageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_admin,parents,teacher;
    private TextView Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);

        btn_admin=(Button)findViewById(R.id.Admin);
        parents=(Button)findViewById(R.id.parents);
        teacher=(Button)findViewById(R.id.teacher);
        Welcome=(TextView) findViewById(R.id.textView);

        btn_admin.setOnClickListener(this);
        parents.setOnClickListener(this);
        teacher.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn_admin){
            finish();
            startActivity(new Intent(WelcomepageActivity.this, AdminLogin.class));
        }
        if (v == teacher){
            finish();
            startActivity(new Intent(WelcomepageActivity.this, TeacherLogin.class));
        }
        if (v == parents){
            finish();
            startActivity(new Intent(WelcomepageActivity.this, ParentLogin.class));

        }
    }


}
