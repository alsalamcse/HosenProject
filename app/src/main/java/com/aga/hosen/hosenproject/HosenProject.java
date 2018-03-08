package com.aga.hosen.hosenproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HosenProject extends AppCompatActivity implements View.OnClickListener {

    private TextView tvclient;
    private EditText etphone;
    private EditText etemail;
    private EditText etpassw;
    private Button btnsignin1;
    private TextView tvmanager;
    private EditText etemail2;
    private EditText etpassw2;
    private Button etsignin;
    private FirebaseUser firebaseUser;
    private FirebaseAuth firebaseAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosen_project);
        tvclient = (TextView) findViewById(R.id.tvclient);
        etphone = (EditText) findViewById(R.id.etphone);
        etemail = (EditText) findViewById(R.id.etemail);
        etpassw = (EditText) findViewById(R.id.etpassw);
        btnsignin1 = (Button) findViewById(R.id.btnsignin1);
        tvmanager = (TextView) findViewById(R.id.tvmanager);


        etemail2 = (EditText) findViewById(R.id.etemail2);
        etpassw2 = (EditText) findViewById(R.id.etpassw2);
        etsignin = (Button) findViewById(R.id.etsignin);
        btnsignin1.setOnClickListener(this);

    }

    private void dataHandler(){
        String stEmail=etemail.getText().toString();
        String stPassw=etpassw.getText().toString();

        signIn(stEmail,stPassw);
    }


    private void signIn(String email, String passw) {
        firebaseAuth.signInWithEmailAndPassword(email,passw).addOnCompleteListener(HosenProject.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(HosenProject.this, "signIn succesful", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(HosenProject.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public void onClick(View view) {

        dataHandler();
    }
}
