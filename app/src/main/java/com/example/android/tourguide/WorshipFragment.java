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
public class WorshipFragment extends Fragment {


    public WorshipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(getString(R.string.wor1), getString(R.string.wDesc1), R.drawable.kamatchi));
        items.add(new ListItem(getString(R.string.wor2), getString(R.string.wDesc2), R.drawable.kanniga));
        items.add(new ListItem(getString(R.string.wor3), getString(R.string.wDesc3), R.drawable.mana));
        items.add(new ListItem(getString(R.string.wor4), getString(R.string.wDesc4), R.drawable.goki));
        items.add(new ListItem(getString(R.string.wor5), getString(R.string.wDesc5), R.drawable.varada));
        items.add(new ListItem(getString(R.string.wor6), getString(R.string.wDesc6), R.drawable.vedha));

        ListView listView = (ListView)rootView.findViewById(R.id.list);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),items, R.color.colorAccent);
        listView.setAdapter(adapter);

        return rootView;
    }

}
