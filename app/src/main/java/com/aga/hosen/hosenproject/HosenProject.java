package com.aga.hosen.hosenproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HosenProject extends AppCompatActivity {

    private TextView tvclient;
    private EditText etphone;
    private EditText etemail;
    private EditText etpassw;
    private Button btnsignup;
    private TextView tvmanager;
    private EditText etemail2;
    private EditText etpassw2;
    private Button etsignin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosen_project);
        tvclient = (TextView) findViewById(R.id.tvclient);
        etphone = (EditText) findViewById(R.id.etphone);
        etemail = (EditText) findViewById(R.id.etemail);
        etpassw = (EditText) findViewById(R.id.etpassw);
        btnsignup = (Button) findViewById(R.id.btnsignup);
        tvmanager = (TextView) findViewById(R.id.tvmanager);
        etemail2 = (EditText) findViewById(R.id.etemail2);
        etpassw2 = (EditText) findViewById(R.id.etpassw2);
        etsignin = (Button) findViewById(R.id.etsignin);







    }
}
