package com.kira.bellmantask.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kira.bellmantask.R;
import com.kira.bellmantask.model.Event;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private List<Event> eventList = new ArrayList<>();
    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        return new EventViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Picasso.get().load(eventList.get(position).getCategories().get(0).getCoverImageUrl()).into(holder.itemImage);
        holder.itemName.setText(eventList.get(position).getName());
        holder.categoryName.setText(eventList.get(position).getCategories().get(0).getName());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public void setListItem(List<Event> listItem) {
        this.eventList = listItem;
        notifyDataSetChanged();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName, categoryName;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage_ImgV);
            itemName = itemView.findViewById(R.id.name_TxtV);
            categoryName = itemView.findViewById(R.id.categoryName_TxtV);
        }
    }

}
