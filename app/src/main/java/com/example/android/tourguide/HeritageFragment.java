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
public class HeritageFragment extends Fragment {


    public HeritageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("ASHRAM DINING ROOM (since 1934)", "Location:\nAnanda Ranga Pillai Street"));
        items.add(new ListItem("Sri Aurobindo International Centre of Education",
                "Location:\n Rue de la Marine (Chetty Street Extn.)"));
        items.add(new ListItem("AUROVILLE","Location:\nBommayapalayam"));
        items.add(new ListItem("SRI AUROBINDO ASHRAM",
                "Location:\nMarine St, White Town"));

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
