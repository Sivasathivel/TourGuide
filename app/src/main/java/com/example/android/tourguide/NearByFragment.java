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
public class NearByFragment extends Fragment {


    public NearByFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("Gangaikondacholapuram", "Location:\n100 Kms to South"));
        items.add(new ListItem("Chidambaram",
                "Location:\n100 Kms to North"));
        items.add(new ListItem("Gingee","Location:\n70 Kms to NW"));
        items.add(new ListItem("Karaikal", "Location:\n130Kms to South"));
        items.add(new ListItem("Keezhoor", "Location:\n22 kms to the West"));
        items.add(new ListItem("Mandagapattu", "Location:\n57 kms to the West"));
        items.add(new ListItem("Marakanam", "Location:\n38 kms to the North"));
        items.add(new ListItem("Nagapattinam", "Location:\n152 kms to the South"));
        items.add(new ListItem("Nagore", "Location:\n140 kms to the South"));
        items.add(new ListItem("Panamalai", "Location:\n66 kms to the West"));
        items.add(new ListItem("Pichavaram", "Location:\n73 kms to the South"));
        items.add(new ListItem("Singavaram", "Location:\n70 kms to the North West"));
        items.add(new ListItem("Tharangambadi", "Location:\n114 Kms to the South"));
        items.add(new ListItem("Thalavanur", "Location:\n67 Kms to the West"));
        items.add(new ListItem("Thiruvannamalai", "Location:\n106 Kms to the West"));
        items.add(new ListItem("Vedanthangal", "Location:\n100 Kms to the North"));
        items.add(new ListItem("Velankanni", "Location:\n160 Kms to the South"));
        items.add(new ListItem("Mahabalipuram", "Location:\n100 Kms to the North"));

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
