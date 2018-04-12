package jp.techacademy.watanabe.shouta.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = findViewById(R.id.editText1);
        mEditText2 = findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);

        double a = Double.parseDouble(mEditText1.getText().toString());
        double b = Double.parseDouble(mEditText2.getText().toString());
        double result = 0;

        if (v.getId() == R.id.button1) {
            result = a + b;
        } else if (v.getId() == R.id.button2) {
            result = a - b;
        } else if (v.getId() == R.id.button3) {
            result = a * b;
        } else if (v.getId() == R.id.button4) {
            result = a / b;
        }
        intent.putExtra("result", result);
        startActivity(intent);
    }
}