package com.example.parentcollegeinteraction.AccountActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parentcollegeinteraction.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputEmail, inputPassword;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignUp=(Button)findViewById(R.id.sign_up_button);
        btnSignIn=(Button)findViewById(R.id.sign_in_button);

        inputEmail=(EditText)findViewById(R.id.email);
        inputPassword=(EditText)findViewById(R.id.password);

        // t1=(TextView)findViewById(R.id.t4);

        progressDialog=new ProgressDialog(this);
        firebaseAuth=FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser()!=null){
            finish();
            startActivity(new Intent(this,HomeActivity.class));
        }

        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
    }
    private void registerUser(){
        String email=inputEmail.getText().toString().trim();
        String p=inputPassword.getText().toString().trim();
        if ((TextUtils.isEmpty(email))){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(p)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("Registering User...");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email,p).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    finish();
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    Toast.makeText(SignupActivity.this,"Registered Successfully",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(SignupActivity.this,"Could not register. please try again",Toast.LENGTH_LONG).show();
                }
                progressDialog.dismiss();
            }
        });
    }
    @Override
    public void onClick(View v) {
        if ((v == btnSignUp)){
            registerUser();
        }
        if ((v == btnSignIn)){
            startActivity(new Intent(SignupActivity.this, AdminLogin.class));

        }
    }
}
