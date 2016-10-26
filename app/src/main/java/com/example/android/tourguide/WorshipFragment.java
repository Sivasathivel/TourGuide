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
public class WorshipFragment extends Fragment {


    public WorshipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("KAMATCHIAMMAN KOIL",
                "The singularity of the temple lies in the unembellished form of the temple structure",
                R.drawable.kamatchi));
        items.add(new ListItem("KANNIGA PARAMESWARI TEMPLE",
                "The temple is unique in its architecture as it blends the style of the French with the traditional Deccan architecture of India.",
                R.drawable.kanniga));
        items.add(new ListItem("MANAKULA VINAYAGAR TEMPLE",
                "The ancient temple was constructed three centuries ago and still stands in all its magnificent glory.",
                R.drawable.mana));
        items.add(new ListItem("SRI GOKILAMBAL THIRUKAMESHWARA TEMPLE",
                "During French colonial rule, the Governor of Puducherry used to join this very procession and actively participate in the drawing of the chariot through the streets.",
                R.drawable.goki));
        items.add(new ListItem("SRI VARADARAJA PERUMAL TEMPLE",
                " It is believed to be one of the oldest temples in the town and is 800 years old.", R.drawable.varada));
        items.add(new ListItem("VEDHAPUREESWARAR TEMPLE",
                "One of the oldest of Temples. Was demolished by French in 1748 and rebuilt", R.drawable.vedha));

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
