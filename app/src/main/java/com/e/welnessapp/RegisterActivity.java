package com.e.welnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    EditText name, email, password, mobile, dob, bg;
    TextView memberAlready;
    Button register;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        mobile = findViewById(R.id.et_mobile);
        dob = findViewById(R.id.et_dob);
        bg = findViewById(R.id.et_bg);
        register = findViewById(R.id.button_submit);
        memberAlready = findViewById(R.id.tv_member);

        auth = FirebaseAuth.getInstance();


        register.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String emailId = email.getText().toString();
                String pass = password.getText().toString();


                if (TextUtils.isEmpty(emailId)) {
                    Toast.makeText(getApplicationContext(), R.string.email_text, Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(getApplicationContext(), R.string.pass_text, Toast.LENGTH_LONG).show();
                }
                if (pass.length() == 0) {
                    Toast.makeText(getApplicationContext(), R.string.pass_text, Toast.LENGTH_LONG).show();
                }
                if (pass.length() < 8) {
                    Toast.makeText(getApplicationContext(), R.string.pass_length, Toast.LENGTH_LONG).show();
                } else {
                    auth.createUserWithEmailAndPassword(emailId, pass)
                            .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    if (!task.isSuccessful()) {
                                        Toast.makeText(RegisterActivity.this, R.string.error, Toast.LENGTH_LONG).show();
                                    } else {
                                        Intent intent = new Intent(RegisterActivity.this, HomeScreen.class);
//                                        intent.putExtra("name", name.getText().toString());
//                                        intent.putExtra("dob", dob.getText().toString());
//                                        intent.putExtra("bg", bg.getText().toString());
                                        startActivity(intent);
                                        finish();
                                    }
                                }
                            });
                }
            }
        });
    }

    public void navigate_sign_in(View v) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

}
