package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mpipapplication.Models.Student;

import java.util.ArrayList;

public class FirstListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_list_view);

//        ArrayList<String> list = initData();

        Resources res = getResources();

        String[] list = res.getStringArray(R.array.items);

        ListView basicListView = findViewById(R.id.basicListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        basicListView.setAdapter(adapter);
    }

    private ArrayList<Student> initData() {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Ime-1", "Prezime-1", "Index-1"));
        list.add(new Student("Ime-2", "Prezime-2", "Index-2"));
        list.add(new Student("Ime-3", "Prezime-3", "Index-3"));
        list.add(new Student("Ime-4", "Prezime-4", "Index-4"));
        list.add(new Student("Ime-5", "Prezime-5", "Index-5"));
        list.add(new Student("Ime-6", "Prezime-6", "Index-6"));
        list.add(new Student("Ime-7", "Prezime-7", "Index-7"));
        list.add(new Student("Ime-8", "Prezime-8", "Index-8"));



        return list;
    }
}