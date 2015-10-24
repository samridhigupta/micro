package com.hackathon.google.micro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterCodeActivity extends AppCompatActivity {
    Button b1;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_code);

        b1=(Button)findViewById(R.id.button3);
        ed=(EditText)findViewById(R.id.editText3);

    }

    public void validate(View view) {
        System.out.println("Control got here");
        System.out.println(ed.getText().toString());
        if(ed.getText().toString().equals("12345")) {
            Intent intent = new Intent(this, DonationActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "You code was not recognized, please try again", Toast.LENGTH_SHORT).show();
        }
    }
}
