package com.improve10x.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskListAdapter extends RecyclerView.Adapter<TaskListViewHolder> {
    public ArrayList<TaskListScreen> taskListScreens;
    public void setData(ArrayList<TaskListScreen> taskListScreenArrayList ){
        taskListScreens = taskListScreenArrayList;


    }
    @NonNull
    @Override
    public TaskListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasklist_item,parent,false);
        TaskListViewHolder taskListViewHolder = new TaskListViewHolder(view);
        return taskListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListViewHolder holder, int position) {
        TaskListScreen taskListScreen = taskListScreens.get(position);
        holder.titleTxt.setText(taskListScreen.title);
        holder.messageTxt.setText(taskListScreen.message);

    }

    @Override
    public int getItemCount() {
        return taskListScreens.size();
    }
}
