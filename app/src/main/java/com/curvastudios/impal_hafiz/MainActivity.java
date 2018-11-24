package com.curvastudios.impal_hafiz;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPlane;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlane = findViewById(R.id.btn_plane);
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, new FragmentEmpty());
        transaction.commit();

        btnPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, new FragmentDetail());
                transaction.commit();

            }
        });

    }
}
