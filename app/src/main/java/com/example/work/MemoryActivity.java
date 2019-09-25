package com.example.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MemoryActivity extends AppCompatActivity {
    private TextView classname,memory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        classname=findViewById(R.id.tv_classname);
        memory=findViewById(R.id.tv_memory);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name  = bundle.getString("text");
            String name2=bundle.getString("text2");
            classname.setText(name);
            memory.setText(name2);
        }

    }
}
