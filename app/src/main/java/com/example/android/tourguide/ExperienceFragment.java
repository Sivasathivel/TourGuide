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
public class ExperienceFragment extends Fragment {


    public ExperienceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list,container,false);
        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(getString(R.string.exp1), getString(R.string.eDesc1)));
        items.add(new ListItem(getString(R.string.exp2), getString(R.string.eDesc2)));
        items.add(new ListItem(getString(R.string.exp3), getString(R.string.eDesc3)));
        items.add(new ListItem(getString(R.string.exp4), getString(R.string.eDesc4)));
        items.add(new ListItem(getString(R.string.exp5), getString(R.string.eDesc5)));
        items.add(new ListItem(getString(R.string.exp6), getString(R.string.eDesc6)));
        items.add(new ListItem(getString(R.string.exp7), getString(R.string.eDesc7)));
        items.add(new ListItem(getString(R.string.exp8), getString(R.string.eDesc8)));
        items.add(new ListItem(getString(R.string.exp9), getString(R.string.eDesc9)));
        items.add(new ListItem(getString(R.string.exp10), getString(R.string.eDesc10)));
        items.add(new ListItem(getString(R.string.exp11), getString(R.string.eDesc11)));
        items.add(new ListItem(getString(R.string.exp12), getString(R.string.eDesc12)));
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),items, R.color.colorAccent);
        listView.setAdapter(adapter);
        return rootView;
    }

}
