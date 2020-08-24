package com.example.graduationsashar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    Button cameraopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cameraopen = findViewById(R.id.cameraopen);
        cameraopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SashAR = (new Intent(Home.this, SashAR.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                Bundle setData = new Bundle();
//                setData.putString("idproyek", stringid);
                SashAR.putExtras(setData);

                startActivity(SashAR);
            }
        });
    }
}
