package com.e.welnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    EditText etMobileNum;
    Button getOtpButton;
    String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        etMobileNum = findViewById(R.id.et_enter_phone);
        getOtpButton = findViewById(R.id.get_otp_button);


        if(etMobileNum.getText() != null) {
            if(etMobileNum.length() == 10) {
                phoneNumber = etMobileNum.getText().toString();
            } else {
                Toast.makeText(this, "Phone number should be of 10 digits", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Cannot get otp without a phone number", Toast.LENGTH_SHORT).show();
        }

        getOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(phoneNumber.length() != null) {
//
//                }
            }
        });
    }
}