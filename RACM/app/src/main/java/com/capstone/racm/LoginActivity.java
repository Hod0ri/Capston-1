package com.capstone.racm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout layout;
    private TextView tbtn_forget, tbtn_signupm, lb_warn, tbtn_signup;
    private Button btn_signin;
    private EditText edt_id, edt_pw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        layout = findViewById(R.id.layout);
        tbtn_forget = findViewById(R.id.tbtn_forget);
        tbtn_signup = findViewById(R.id.tbtn_signup);
        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);
        btn_signin = findViewById(R.id.btn_signin);
        lb_warn = findViewById(R.id.lb_warn);

        // Account (admin, 1q2w3e4r!
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edt_id.getText().toString();
                String passwd = edt_pw.getText().toString();

                // Login Process  (Temp Account : admin, 1q2w3e4r!)
                if(id.isEmpty() || passwd.isEmpty()) {

                } else if(id.equals("admin") && passwd.equals("1q2w3e4r")) {
                    Intent intent = new Intent(getApplicationContext(), DashActivity.class);
                    startActivity(intent);
                } else if(id.equals("admin") && !passwd.equals("1q2w3e4r!")) {
                    lb_warn.setText("비밀번호가 일치하지 않습니다!");
                    lb_warn.setVisibility(View.VISIBLE);
                } else {
                    lb_warn.setText("올바르지 않은 정보입니다!");
                    lb_warn.setVisibility(View.VISIBLE);
                }

            }
        });


        tbtn_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FindAccountActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        });

        tbtn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        });
    }
}