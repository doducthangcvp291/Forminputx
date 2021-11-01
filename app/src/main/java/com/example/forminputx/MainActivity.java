package com.example.forminputx;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText hoten,mssv,ngaysinh,sdt,email ;

    Button submit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hoten = (EditText) findViewById(R.id.hoten);
        mssv = (EditText) findViewById(R.id.mssv);
        ngaysinh = (EditText) findViewById(R.id.Ngaysinh);
        sdt = (EditText) findViewById(R.id.sdt);
        email = (EditText) findViewById(R.id.email);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (TextUtils.isEmpty(hoten.getText())) {
                    hoten.setError("Please enter your name");
                    hoten.setBackgroundResource(R.drawable.edterr);
                }
                if (TextUtils.isEmpty(mssv.getText())) {
                    mssv.setError("Please enter your student ID");
                    mssv.setBackgroundResource(R.drawable.edterr);
                }
                if (TextUtils.isEmpty(ngaysinh.getText())) {
                    ngaysinh.setError("Please enter your birthday");
                    ngaysinh.setBackgroundResource(R.drawable.edterr);
                }
                if (TextUtils.isEmpty(sdt.getText())) {
                    sdt.setError("Please enter your phone number");
                    sdt.setBackgroundResource(R.drawable.edterr);
                }
                if (TextUtils.isEmpty(email.getText())) {
                    email.setError("Please enter your email");
                    email.setBackgroundResource(R.drawable.edterr);

            }
            }
        });
        /*
        public void onClick(View view) {
            if(edittext.getText().toString().isEmpty()){
                edittext.setError("error");
                edittext.setBackgroundResource(R.drawable.edterr);
            }else {
                edittext.setBackgroundResource(R.drawable.edtnormal);
            }
        }
        */

    }
}