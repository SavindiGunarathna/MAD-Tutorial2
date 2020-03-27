package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


        EditText number1;
        EditText number2;
        Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        number1= findViewById(R.id.editText);
        number2 = findViewById(R.id.editText2);
        ok = findViewById(R.id.button);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("number1",number1.getText().toString());
                intent.putExtra("number2",number2.getText().toString());

                Context context = getApplicationContext();
                CharSequence message = "You just click the OK button";
                int duration = Toast.LENGTH_LONG;

                Toast toast =  Toast.makeText(context,message,duration);

                toast.show();

                startActivity(intent);
            }
        });


    }
}
