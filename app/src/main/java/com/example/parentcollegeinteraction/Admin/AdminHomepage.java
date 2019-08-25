package com.example.parentcollegeinteraction.Admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parentcollegeinteraction.R;

public class AdminHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_homepage);
        Spinner s=(Spinner)findViewById(R.id.spinner);
        TextView t=(TextView)findViewById(R.id.AdminHomepage);
        Button b1=(Button)findViewById(R.id.AddTeacher);
        Button b2=(Button)findViewById(R.id.RemoveTeacher);
        Button b3=(Button)findViewById(R.id.Feedback);

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(AdminHomepage.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Teachers));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.admin_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.user){
            Toast.makeText(this,"Update Details",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.attendence){
            Toast.makeText(this,"Attendence",Toast.LENGTH_SHORT).show();
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
