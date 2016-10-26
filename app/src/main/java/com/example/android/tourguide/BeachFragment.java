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
public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("Auroville Beach",
                        "Location: Periyamudaliar Chavadi", R.drawable.auro));
        items.add(new ListItem("Paradise Beach",
                "Location: Nonankuppam", R.drawable.paradise));
        items.add(new ListItem("Promenade Beach",
                "Location: Beach Road", R.drawable.promenade));
        items.add(new ListItem("Serenity Beach",
                "Location: Kottakuppam", R.drawable.serenity));
        items.add(new ListItem("VEERAMPATTINAM BEACH",
                "Location:Veerampattinam", R.drawable.veerampattinam));

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
