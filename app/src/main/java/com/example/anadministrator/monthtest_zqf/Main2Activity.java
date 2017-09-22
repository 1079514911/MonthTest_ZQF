package com.example.anadministrator.monthtest_zqf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anadministrator.monthtest_zqf.Adapter.RecycleViewAdapterDuotiaomu;
import com.example.anadministrator.monthtest_zqf.JavaBean.Bean2;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView mRecycler3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        Bundle extras = getIntent().getExtras();
        Bean2 name = (Bean2) extras.getSerializable("name");
        System.out.println(name.others.size());
        mRecycler3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRecycler3.setAdapter(new RecycleViewAdapterDuotiaomu(name,this));
    }

    private void initView() {
        mRecycler3 = (RecyclerView) findViewById(R.id.recycler3);
    }
}
