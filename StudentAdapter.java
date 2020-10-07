package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    List studentDataList;

    public StudentAdapter(List studentDataList) {
        this.studentDataList= studentDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list_row, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        StudentData data= (StudentData) studentDataList.get(position);
        holder.name.setText(data.name);
        holder.age.setText(String.valueOf(data.age));

    }

    @Override
    public int getItemCount() {
        return studentDataList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,age;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
        }
    }
}
