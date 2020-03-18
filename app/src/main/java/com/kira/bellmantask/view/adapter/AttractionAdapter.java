package com.kira.bellmantask.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kira.bellmantask.R;
import com.kira.bellmantask.model.Attraction;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {

    private List<Attraction> attractionList = new ArrayList<>();

    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        return new AttractionViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull AttractionViewHolder holder, int position) {
//        String imageUrl = attractionList.get(position).getPhotos().get(0);
//        String categoryNameItem = attractionList.get(position).getCategories().get(0).getName();
//        Picasso.get().load(imageUrl).placeholder(R.drawable.bellman_bottom_icon).into(holder.itemImage);
        holder.itemImage.setImageResource(R.drawable.error_image);
        holder.itemName.setText(attractionList.get(position).getName());
        holder.categoryName.setText(attractionList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return attractionList.size();
    }

    public void setListItem(List<Attraction> listItem) {
        this.attractionList = listItem;
        notifyDataSetChanged();
    }

    public class AttractionViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName, categoryName;

        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage_ImgV);
            itemName = itemView.findViewById(R.id.name_TxtV);
            categoryName = itemView.findViewById(R.id.categoryName_TxtV);
        }
    }


}
