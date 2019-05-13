package in.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    private TextView mTxt1;
    private TextView mTxt2;
    private Button mBtn1;
    private Button mBtn2;

    int counter1 = 0;
    int counter2 = 0;
    private EditText mEditText;
    private Button mBtn3;

    // sharpsamarth@gmail.com
    // samarthk0105@gmail.com

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        mTxt1 = findViewById(R.id.txt1);
        mTxt2 = findViewById(R.id.txt2);
        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);

        mEditText = findViewById(R.id.editText);
        mBtn3 = findViewById(R.id.btn3);

        mTxt1.setTextColor(Color.GREEN);

        mTxt2.setText("How are u?");


        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Log.e("MSG1", "Click");

        if (v.getId() == R.id.btn1) {
            Log.e("MSG1", "Click1");
            counter1++;
            mTxt1.setText("Counter " + counter1);

        } else if (v.getId() == R.id.btn2) {
            Log.e("MSG1", "Click2");
            counter2++;
            mTxt2.setText("Counter " + counter2);
        } else if (v.getId() == R.id.btn3) {
            String s = mEditText.getText().toString();
            Log.e("MSG1", "Click3 " + s);

            mTxt2.setText(s);


            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
            finish();
        }

    }
}
