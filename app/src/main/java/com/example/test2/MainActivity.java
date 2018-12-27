package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email, pass;

    private static final String  email_txt="qwe";
    private static final String  pass_txt="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login (View V){
        img = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button3);
        email = (EditText)findViewById(R.id.editText6);
        pass = (EditText)findViewById(R.id.editText5);
        if (email_txt.equals(String.valueOf(email.getText()))  && pass_txt.equals(String.valueOf(pass.getText())))
            img.setImageResource(R.drawable.right);
        else
            img.setImageResource(R.drawable.wrong);
    }
}
