package com.hackathon.google.micro;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class ShelterActivity extends AppCompatActivity {

    Button b1;
    EditText ed;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);
        b1=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editZipCode);
        tv = (TextView)findViewById(R.id.numberOfMealsDonated);
        tv.setText("5");
    }

    public void find(View view) {
        Toast.makeText(getApplicationContext(),
                "Hotel 1 provides with  free  meals", Toast.LENGTH_SHORT).show();
    }

}
