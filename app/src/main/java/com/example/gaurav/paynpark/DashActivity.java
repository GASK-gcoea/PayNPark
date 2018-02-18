package com.example.gaurav.paynpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class DashActivity extends AppCompatActivity implements View.OnClickListener {
private CardView userProfileCard,userQrCard,userPaymentCard,userLogCard;
    private Intent goToActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        //defining cards
        userProfileCard = (CardView)findViewById(R.id.user_profile_card);
        userQrCard = (CardView) findViewById(R.id.user_qr_card);
        userPaymentCard = (CardView)findViewById(R.id.user_payment_card);
        userLogCard = (CardView) findViewById(R.id.user_log_card);
        //adding click listeners to cards
        userProfileCard.setOnClickListener(this);
        userQrCard.setOnClickListener(this);
        userPaymentCard.setOnClickListener(this);
        userLogCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.user_profile_card : goToActivity = new Intent(DashActivity.this,UserProfileActivity.class); startActivity(goToActivity); break;
            case R.id.user_qr_card : goToActivity = new Intent(DashActivity.this,UserQRActivity.class); startActivity(goToActivity); break;
            case R.id.user_payment_card : goToActivity = new Intent(DashActivity.this,UserPaymentActivity.class); startActivity(goToActivity); break;
            case R.id.user_log_card : goToActivity = new Intent(DashActivity.this,UserLogActivity.class); startActivity(goToActivity); break;
            default: break;
        }

    }
}
