package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private EditText name;
    private EditText password;

    private Button entry,on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.et_name);
        password=findViewById(R.id.et_password);

        entry=findViewById(R.id.btn_entry);
        on=findViewById(R.id.btn_on);

        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name!=null&&password!=null){
                    Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                    String text = name.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("texts",text);
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else {
                    Toast.makeText(MainActivity.this,"密码或用户名不能为空",Toast.LENGTH_SHORT).show();
                }
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
