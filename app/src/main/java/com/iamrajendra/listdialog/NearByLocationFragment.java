package com.iamrajendra.listdialog;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iamrajendra.listdialog.adapter.LocationAdapter;
import com.iamrajendra.listdialog.models.LocationData;

/**
 * A placeholder fragment containing a simple view.
 */
public class NearByLocationFragment extends Fragment {
    private RecyclerView recyclerView;
    LocationData locationData;

    public NearByLocationFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        locationData = ((NearBYLocationActivity)getActivity()).locationData;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_near_by_location, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) getView().findViewById(R.id.location_list_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(new LocationAdapter(getActivity(),getContext(),locationData.mList_places));
    }


}
