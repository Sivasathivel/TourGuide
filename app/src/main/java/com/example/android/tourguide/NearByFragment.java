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
        items.add(new ListItem(getString(R.string.tem1), getString(R.string.tDesc1)));
        items.add(new ListItem(getString(R.string.tem2), getString(R.string.tDesc2)));
        items.add(new ListItem(getString(R.string.tem3), getString(R.string.tDesc3)));
        items.add(new ListItem(getString(R.string.tem4), getString(R.string.tDesc4)));
        items.add(new ListItem(getString(R.string.tem5), getString(R.string.tDesc5)));
        items.add(new ListItem(getString(R.string.tem6), getString(R.string.tDesc6)));
        items.add(new ListItem(getString(R.string.tem7), getString(R.string.tDesc7)));
        items.add(new ListItem(getString(R.string.tem8), getString(R.string.tDesc8)));
        items.add(new ListItem(getString(R.string.tem9), getString(R.string.tDesc9)));
        items.add(new ListItem(getString(R.string.tem10), getString(R.string.tDesc10)));
        items.add(new ListItem(getString(R.string.tem11), getString(R.string.tDesc11)));
        items.add(new ListItem(getString(R.string.tem12), getString(R.string.tDesc12)));
        items.add(new ListItem(getString(R.string.tem13), getString(R.string.tDesc13)));
        items.add(new ListItem(getString(R.string.tem14), getString(R.string.tDesc14)));
        items.add(new ListItem(getString(R.string.tem15), getString(R.string.tDesc15)));
        items.add(new ListItem(getString(R.string.tem16), getString(R.string.tDesc16)));
        items.add(new ListItem(getString(R.string.tem17), getString(R.string.tDesc17)));
        items.add(new ListItem(getString(R.string.tem18), getString(R.string.tDesc18)));

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
