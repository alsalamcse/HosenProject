package com.aga.hosen.hosenproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Queue extends AppCompatActivity implements View.OnClickListener {

    private EditText etNumber;
    private EditText etIDN;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        etNumber=(EditText)findViewById(R.id.etNumber);
        etIDN=(EditText)findViewById(R.id.etIDN);
        btnSave=(Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==btnSave){
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }

    }
}
