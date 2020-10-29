package com.example.mpipapplication.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mpipapplication.Models.Student;
import com.example.mpipapplication.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Student> students;

    public RecyclerViewAdapter(Context context, List<Student> students){
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Generirame View od Shablonot koj sto sakame da go koristeme (Vo slucajov = row.xml)

        View view = LayoutInflater.from(context).inflate(R.layout.row, null, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Go povrzuvame soodvetno kreiranoto viewHolderot so podatocite
        Student student = students.get(position);

        holder.setFirstName(student.firstName);
        holder.setLastName(student.lastName);
        holder.setIndex(student.index);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView firstName;
        private TextView lastName;
        private TextView index;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);
            index = itemView.findViewById(R.id.index);
        }

        public void setFirstName(String firstName){
            this.firstName.setText(firstName);
        }

        public void setLastName(String lastName){
            this.lastName.setText(lastName);
        }

        public void setIndex(String index){
            this.index.setText(index);
        }
    }
}
