package com.example.mpipapplication.Adapters;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mpipapplication.Models.Student;
import com.example.mpipapplication.R;


import java.util.List;

public class BasicListViewAdapter extends BaseAdapter {

    private Context context;
    private List<Student> students;

    public BasicListViewAdapter(Context context, List<Student> students){
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row, null, false);
        }


        Student student = students.get(position);

        TextView firstName = convertView.findViewById(R.id.firstName);
        TextView lastName = convertView.findViewById(R.id.lastName);
        TextView index = convertView.findViewById(R.id.index);

        firstName.setText(student.firstName);
        lastName.setText(student.lastName);
        index.setText(student.index);


        return convertView;
    }
}
