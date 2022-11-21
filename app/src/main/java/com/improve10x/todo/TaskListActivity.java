package com.improve10x.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {
    public ArrayList<TaskListScreen>taskListList;
    public RecyclerView taskListRv;
    public TaskListAdapter taskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        getSupportActionBar().setTitle("TaskList");
        setData();
        setTaskList();
        setHandleButton();
    }

    public void setHandleButton() {
        Button taskListBtn = findViewById(R.id.tasklist_btn);
        taskListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddTaskActivity.class);
            startActivity(intent);

        });
    }

    public void setTaskList() {
        taskListRv = findViewById(R.id.tasklist_rv);
        taskListRv.setLayoutManager(new LinearLayoutManager(this));
        taskListAdapter = new TaskListAdapter();
        taskListAdapter.setData(taskListList);
        taskListRv.setAdapter(taskListAdapter);


    }

    public void setData() {
        taskListList = new ArrayList<>();
        TaskListScreen taskListScreen = new TaskListScreen();
        taskListScreen.title = "Get vegetables";
        taskListScreen.message = "for 1 week";
        taskListList.add(taskListScreen);

        TaskListScreen taskListScreen1 = new TaskListScreen();
        taskListScreen1.title = "Reading news";
        taskListScreen1.message = "Explore politics,filmy and sport news";
        taskListList.add(taskListScreen1);

        TaskListScreen taskListScreen2 = new TaskListScreen();
        taskListScreen2.title = "Prepare Lunch";
        taskListScreen2.message = "Biryani and Raitha. yummyyyyy";
        taskListList.add(taskListScreen2);

        TaskListScreen taskListScreen3 = new TaskListScreen();
        taskListScreen3.title = "Have BreakFast";
        taskListScreen3.message = "Healthy Breakfast for a better morning";
        taskListList.add(taskListScreen3);
    }
}