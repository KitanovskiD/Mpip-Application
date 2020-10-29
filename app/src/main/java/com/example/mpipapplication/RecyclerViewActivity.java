package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mpipapplication.Adapters.RecyclerViewAdapter;
import com.example.mpipapplication.Models.Student;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        ArrayList<Student> list = initData();

        RecyclerView recyclerView = findViewById(R.id.recyclerViewComponent);

        // Dokolku sme sigurni deka bilo kakva promena na zapis koj sto prikazuvam
        //Nema da rezultira so promena na layout-ot
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);

        recyclerView.setAdapter(adapter);

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