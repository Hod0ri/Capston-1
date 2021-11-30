package com.capstone.racm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

public class RegisterActivity extends AppCompatActivity {

    private LinearLayout rlayout;
    private Button btn_rcancel, btn_registerSubmit;
    private CheckBox chk_agree;
    private EditText edt_IdValue, edt_nickname, edt_phone, edt_address, edt_password, edt_password2;

    private void FindView() {
        // Find View By Id
        rlayout = findViewById(R.id.rLayout);
        btn_rcancel = findViewById(R.id.btn_rcancel);
        chk_agree = findViewById(R.id.chk_agree);
        btn_registerSubmit = findViewById(R.id.btn_registerSubmit);
        edt_address = findViewById(R.id.edt_address);
        edt_nickname = findViewById(R.id.edt_nickname);
        edt_password2 = findViewById(R.id.edt_Password2);
        edt_password = findViewById(R.id.edt_Password);
        edt_address = findViewById(R.id.edt_address);
        edt_phone = findViewById(R.id.edt_phoneNum);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        FindView();


        // Return to main
        btn_rcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        });

        // Activate Submit Button
        chk_agree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk_agree.isChecked()) {
                    btn_registerSubmit.setEnabled(true);
                } else {
                    btn_registerSubmit.setEnabled(false);
                }
            }
        });

    }
}