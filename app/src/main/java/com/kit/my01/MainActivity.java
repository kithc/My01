package com.kit.my01;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Dialog dialog;

    public void btnClick(View v) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View myView = inflater.inflate(R.layout.layout_mysend_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(myView);
        myView.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "你点击了", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"你好",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"你好",Toast.LENGTH_LONG).show();
//                Toast.makeText(MainActivity.this, "你点击了返回", Toast.LENGTH_LONG).show();
//                Toast.makeText(MainActivity.this,"你点击了",Toast.LENGTH_LONG).show();
            }
        });
        dialog = builder.create();
        dialog.show();
    }

}
