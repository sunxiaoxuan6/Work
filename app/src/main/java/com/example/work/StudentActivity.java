package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class StudentActivity extends AppCompatActivity {

    private List<Fragment> fragments;
    private TextView sname;
    private RadioButton classes,reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        classes=findViewById(R.id.rb_class);
        reference=findViewById(R.id.rb_reference);

        sname=findViewById(R.id.tx_sname);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name  = bundle.getString("texts");
            sname.setText("欢迎"+name+"来到您的空间");
        }


        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentActivity.this, ClassActivity.class);
                startActivity(intent);
            }
        });
    }
}
