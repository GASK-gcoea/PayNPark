package com.example.gaurav.paynpark;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
Button login;
TextView signIn;
Intent goToDashboard,goToSignIn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.button);
        login.setOnClickListener(this);
        signIn = (TextView) findViewById(R.id.textView5);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == login)
        {
           // goToDashboard = new Intent(LoginActivity.this,MainActivity.class);
            //startActivity(goToDashboard);
        }
        else if(v == signIn)
        {
            signIn.setPaintFlags(signIn.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
            goToSignIn = new Intent(LoginActivity.this,SignInActivity.class);
            startActivity(goToSignIn);
        }

    }
}
