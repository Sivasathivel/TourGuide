package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExperienceFragment extends Fragment {


    public ExperienceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);
        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("Pondicherry Aqua Tourism", "Backwater Tourist Center"));
        items.add(new ListItem("Culture Arts And Crafts", "Discover French Influence on Tamil heritage"));
        items.add(new ListItem("Shopping", "Ceramic tableware and ornaments, terracotta toys and trinkets...\n"));
        items.add(new ListItem("Health And Wellness", "Speciality hospitals, testing facilities and labs, at a fraction of the cost"));
        items.add(new ListItem("Gourmet", "Few things demonstrate Pondicherry's rich historical heritage and diverse contemporary culture the way its cuisine does...."));
        items.add(new ListItem("Faith Based", "Pondicherry has several sites of religious and spiritual interest..."));
        items.add(new ListItem("Puducherry Science Centre And Planetarium", "6 areas of focus at the moment with ample provision for...\n"));
        items.add(new ListItem("M.I.C.E", "Pondicherry is a budding destination for corporate and other meetings and events..."));
        items.add(new ListItem("Sports And Adventure Sports", "Pondicherry offers tourists a host of recreational sports to partake of..."));
        items.add(new ListItem("Filming", "Heritage Franco-Indian buildings in eye-catching hues..."));
        items.add(new ListItem("Heritage Walks", "Starts from Ashram Office and ends at Dining Room..."));
        items.add(new ListItem("Education", "Pondicherry's excellent formal education opportunities are availed by students from all over the country..."));
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        if(listView == null)
            Log.e("Error in Listview","listView is null");
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),items, R.color.colorAccent);
        if(adapter == null)
            Log.e("Error in adapter","adapter is null");
        listView.setAdapter(adapter);
        return rootView;
    }

}
