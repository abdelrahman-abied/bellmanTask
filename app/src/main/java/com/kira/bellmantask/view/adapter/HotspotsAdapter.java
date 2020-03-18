package com.kira.bellmantask.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kira.bellmantask.R;
import com.kira.bellmantask.model.HotSpot;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class HotspotsAdapter extends RecyclerView.Adapter<HotspotsAdapter.HotspotsViewHolder> {

    private List<HotSpot> hotSpotList = new ArrayList<>();
    private String categoryNameItem;
    private String itemImageUrl;
    @NonNull
    @Override
    public HotspotsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        return new HotspotsViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull HotspotsViewHolder holder, int position) {
        categoryNameItem=hotSpotList.get(position).getName() ;
        itemImageUrl=hotSpotList.get(position).getPhotos().get(0);
        if (categoryNameItem == null) {
            categoryNameItem=" ";
        }
        Picasso.get().load(itemImageUrl).placeholder(R.drawable.error_image).error(R.drawable.bellman_bottom_icon).into(holder.itemImage);
        holder.itemName.setText(hotSpotList.get(position).getName());
        holder.categoryName.setText(categoryNameItem);

    }

    @Override
    public int getItemCount() {
        return hotSpotList.size();
    }

    public void setListItem(List<HotSpot> listItem) {
        this.hotSpotList = listItem;
        notifyDataSetChanged();
    }

    public class HotspotsViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName, categoryName;

        public HotspotsViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage_ImgV);
            itemName = itemView.findViewById(R.id.name_TxtV);
            categoryName = itemView.findViewById(R.id.categoryName_TxtV);
        }
    }

 }
