package com.example.secretnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends AppCompatActivity {

    private Button sendCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        sendCode = (Button) findViewById(R.id.send_code);
        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCodeEntryActivity();
            }
        });
    }

    public void openCodeEntryActivity() {
        Intent intent = new Intent(ForgotPasswordActivity.this, CodeEntryActivity.class);
        startActivity(intent);
    }
}