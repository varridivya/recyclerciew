package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List studentDataList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        studentAdapter=new StudentAdapter(studentDataList);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();
    }
    private void StudentDataPrepare() {
        StudentData data=new StudentData("sai",25);
        studentDataList.add(data);
        data=new StudentData("siva",25);
        studentDataList.add(data);
        data=new StudentData("raghu",20);
        studentDataList.add(data);
        data=new StudentData("raj",28);
        studentDataList.add(data);
        data=new StudentData("amar",15);
        studentDataList.add(data);
        data=new StudentData("bapu",19);
        studentDataList.add(data);
        data=new StudentData("chandra",52);
        studentDataList.add(data);
        data=new StudentData("deraj",30);
        studentDataList.add(data);
        data=new StudentData("eshanth",28);
        studentDataList.add(data);
    }
}