package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        itemList.add(new Item("Android","android@gmail.com",R.drawable.android));
        itemList.add(new Item("Dart","dart@gmail.com",R.drawable.dart));
        itemList.add(new Item("Java","java@gmail.com",R.drawable.java));
        itemList.add(new Item("Python","python@gmail.com",R.drawable.python));
        itemList.add(new Item("VS Code","vscode@gmail.com",R.drawable.vscode));
        itemList.add(new Item("Android","android@gmail.com",R.drawable.android));
        itemList.add(new Item("Dart","dart@gmail.com",R.drawable.dart));
        itemList.add(new Item("Java","java@gmail.com",R.drawable.java));
        itemList.add(new Item("Python","python@gmail.com",R.drawable.python));
        itemList.add(new Item("VS Code","vscode@gmail.com",R.drawable.vscode));

        itemList.add(new Item("Android","android@gmail.com",R.drawable.android));
        itemList.add(new Item("Dart","dart@gmail.com",R.drawable.dart));
        itemList.add(new Item("Java","java@gmail.com",R.drawable.java));
        itemList.add(new Item("Python","python@gmail.com",R.drawable.python));
        itemList.add(new Item("VS Code","vscode@gmail.com",R.drawable.vscode));

        itemList.add(new Item("Android","android@gmail.com",R.drawable.android));
        itemList.add(new Item("Dart","dart@gmail.com",R.drawable.dart));
        itemList.add(new Item("Java","java@gmail.com",R.drawable.java));
        itemList.add(new Item("Python","python@gmail.com",R.drawable.python));
        itemList.add(new Item("VS Code","vscode@gmail.com",R.drawable.vscode));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),itemList));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}