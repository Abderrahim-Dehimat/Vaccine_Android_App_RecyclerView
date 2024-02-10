package com.example.vaccineapprecylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<VaccineModelClass> data;

    public CustomAdapter(ArrayList<VaccineModelClass> data) {
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView vaccineImg;
        TextView vaccineName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.vaccineImg = itemView.findViewById(R.id.vaccineImg);
            this.vaccineName = itemView.findViewById(R.id.vaccineName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(v.getContext(), "Name: "+ data.get(position).getVaccineName(), Toast.LENGTH_SHORT).show();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemList = inflater.inflate(R.layout.item_list_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(itemList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // getting the data from the model class
        holder.vaccineImg.setImageResource(data.get(position).getVaccineImg());
        holder.vaccineName.setText(data.get(position).getVaccineName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
