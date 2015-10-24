package com.hackathon.google.micro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DonationActivity extends AppCompatActivity {

    Button b1;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        b1=(Button)findViewById(R.id.button);
        et=(EditText)findViewById(R.id.editText3);
        tv=(TextView)findViewById(R.id.tv);
    }


    public void donate(View view) {
        Toast.makeText(getApplicationContext(), "donated " + et.getText() + " number of meals", Toast.LENGTH_SHORT).show();
        int cost = 2 * Integer.valueOf(et.getText().toString().trim());
        tv.setText("$" + String.valueOf(cost));
    }
}
