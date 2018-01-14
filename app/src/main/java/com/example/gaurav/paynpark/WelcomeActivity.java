package com.example.gaurav.paynpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout l1,l2;
    Button enter;
    Animation uptodown,downtoup;
    Intent goToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        enter = findViewById(R.id.button2);
        enter.setOnClickListener((View.OnClickListener) this);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.up_to_down);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.down_to_up);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
    }
    public void onClick (View v)
    {
     if(v == enter)
     {
         goToLogin = new Intent(WelcomeActivity.this,LoginActivity.class);
         startActivity(goToLogin);
     }
    }
}
