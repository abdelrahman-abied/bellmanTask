package com.kira.bellmantask.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kira.bellmantask.R;
import com.kira.bellmantask.model.Data;
import com.kira.bellmantask.view.adapter.AttractionAdapter;
import com.kira.bellmantask.view.adapter.EventAdapter;
import com.kira.bellmantask.view.adapter.HotspotsAdapter;
import com.kira.bellmantask.viewmodel.CategoryDataViewModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    RecyclerView attractionRecyclerView;
    RecyclerView eventRecyclerView;
    RecyclerView hotspotsRecyclerView;
    private AttractionAdapter attractionAdapter;
    private EventAdapter eventAdapter;
    private HotspotsAdapter hotspotsAdapter;
    private CategoryDataViewModel dataViewModel;
    private FrameLayout frameLayout;
    private FloatingActionButton bellmanFAB, attractionsFAB, eventsFAB, hotspotsFAB, searchLocationFAB;
    private boolean fabVisibility = false;
    ImageView homeImgV, searchImgV, profileImgV, notificationImgV;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        bellmanFAB = findViewById(R.id.bellmanFab);
        attractionsFAB = findViewById(R.id.attractionsFab);
        eventsFAB = findViewById(R.id.eventsFab);
        hotspotsFAB = findViewById(R.id.hotspotsFab);
        searchLocationFAB = findViewById(R.id.mapFab);
        frameLayout = findViewById(R.id.frameLayout);

        homeImgV = findViewById(R.id.home_ImgV);
        searchImgV = findViewById(R.id.search_ImgV);
        notificationImgV = findViewById(R.id.notification_ImgV);
        profileImgV = findViewById(R.id.profile_ImgV);

        attractionRecyclerView = findViewById(R.id.attractionsList_recyclerview);
        eventRecyclerView = findViewById(R.id.eventsList_recyclerview);
        hotspotsRecyclerView = findViewById(R.id.hostspotsList_recyclerview);
        attractionRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        attractionRecyclerView.setHasFixedSize(true);
        attractionAdapter = new AttractionAdapter();
        eventAdapter = new EventAdapter();
        hotspotsAdapter = new HotspotsAdapter();
        eventRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        eventRecyclerView.setHasFixedSize(true);
        hotspotsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        hotspotsRecyclerView.setHasFixedSize(true);

        dataViewModel = new CategoryDataViewModel();
        dataViewModel = ViewModelProviders.of(this).get(CategoryDataViewModel.class);
        dataViewModel.getBellmanData();
        dataViewModel.categoryMutableLiveData.observe(this, new Observer<Data>() {
            @Override
            public void onChanged(Data data) {
                attractionAdapter.setListItem(data.getAttractions());
                attractionRecyclerView.setAdapter(attractionAdapter);
                hotspotsAdapter.setListItem(data.getHotSpots());
                hotspotsRecyclerView.setAdapter(hotspotsAdapter);
                eventAdapter.setListItem(data.getEvents());
                eventRecyclerView.setAdapter(eventAdapter);
            }
        });
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideFab();
            }
        });
        bellmanFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fabVisibility == false) {
                    showFab();
                    fabVisibility = true;
                } else {
                    hideFab();
                    fabVisibility = false;
                }
            }
        });

        homeImgV.setOnClickListener(this);
        notificationImgV.setOnClickListener(this);
        profileImgV.setOnClickListener(this);
        searchImgV.setOnClickListener(this);

    }


    private void showFab() {
        frameLayout.setVisibility(View.VISIBLE);
        attractionsFAB.show();
        eventsFAB.show();
        searchLocationFAB.show();
        hotspotsFAB.show();

    }

    private void hideFab() {
        attractionsFAB.hide();
        eventsFAB.hide();
        searchLocationFAB.hide();
        hotspotsFAB.hide();
        frameLayout.setVisibility(View.GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_ImgV:
                homeImgV.setImageResource(R.drawable.home_bottom_icon);
                notificationImgV.setImageResource(R.drawable.notification_grey_bottom_icon);
                profileImgV.setImageResource(R.drawable.profile_grey_bottom_icon);
                searchImgV.setImageResource(R.drawable.search_grey_bottom_icon);
                break;
            case R.id.search_ImgV:
                homeImgV.setImageResource(R.drawable.home_grey_bottom_icon);
                notificationImgV.setImageResource(R.drawable.notification_grey_bottom_icon);
                profileImgV.setImageResource(R.drawable.profile_grey_bottom_icon);
                searchImgV.setImageResource(R.drawable.search_bottom_icon);
                break;
            case R.id.profile_ImgV:
                homeImgV.setImageResource(R.drawable.home_grey_bottom_icon);
                notificationImgV.setImageResource(R.drawable.notification_grey_bottom_icon);
                profileImgV.setImageResource(R.drawable.profile_bottom_icon);
                searchImgV.setImageResource(R.drawable.search_grey_bottom_icon);
                break;
            case R.id.notification_ImgV:
                homeImgV.setImageResource(R.drawable.home_grey_bottom_icon);
                notificationImgV.setImageResource(R.drawable.notification_bottom_icon);
                profileImgV.setImageResource(R.drawable.profile_grey_bottom_icon);
                searchImgV.setImageResource(R.drawable.search_grey_bottom_icon);
                break;
        }
    }
}
