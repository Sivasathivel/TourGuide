package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
        items.add(new ListItem(getString(R.string.beach1),
                        getString(R.string.bloc1), R.drawable.auro));
        items.add(new ListItem(getString(R.string.beach2),
                getString(R.string.bloc2), R.drawable.paradise));
        items.add(new ListItem(getString(R.string.beach3),
                getString(R.string.bloc3), R.drawable.promenade));
        items.add(new ListItem(getString(R.string.beach4),
                getString(R.string.bloc4), R.drawable.serenity));
        items.add(new ListItem(getString(R.string.beach5),
                getString(R.string.bloc5), R.drawable.veerampattinam));

        ListView listView = (ListView)rootView.findViewById(R.id.list);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),items, R.color.colorAccent);
        listView.setAdapter(adapter);

        return rootView;
    }
}
