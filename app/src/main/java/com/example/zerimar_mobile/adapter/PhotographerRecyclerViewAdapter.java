package com.example.zerimar_mobile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.zerimar_mobile.R;
import com.example.zerimar_mobile.model.Photographer;

import java.util.List;

public class PhotographerRecyclerViewAdapter extends RecyclerView.Adapter<PhotographerRecyclerViewAdapter.MyViewHolder> {
    private List<Photographer> photographers;

    public PhotographerRecyclerViewAdapter(List<Photographer> vacancies) {
        this.photographers = vacancies;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView specialization;
        TextView name;
        TextView location;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            specialization = itemView.findViewById(R.id.specialization);
            name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.lacation);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vacancy = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_photographer_adapter, parent, false);
        return new MyViewHolder(vacancy);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Photographer photographer = photographers.get(position);

        holder.specialization.setText(photographer.getSpecialization());
        holder.name.setText(photographer.getNome());
        holder.location.setText(photographer.getLocation());
    }

    @Override
    public int getItemCount() {
        return photographers.size();
    }
}
