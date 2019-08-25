package com.example.parentcollegeinteraction.Parent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.parentcollegeinteraction.R;

public class Parent_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_homepage);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.parent_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.user){
            Toast.makeText(this,"Update Details",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.ViewFeedback){
            Toast.makeText(this,"Feedbacks",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.AccountSetting){
            Toast.makeText(this,"Account Setting",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.Help){
            Toast.makeText(this,"Help",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.Logout){
            Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.notification){
            Toast.makeText(this,"Notifications",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
