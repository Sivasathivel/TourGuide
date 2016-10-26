package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sivasathivelkandasamy on 2016-10-26.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {
    private int colorResourceID;
    public ListItemAdapter(Activity context, ArrayList<ListItem> list, int colorCategory){
        super(context,0,list);
        colorResourceID = colorCategory;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        ListItem item = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.item_title);
        title.setText(item.getTitle());
        TextView desc = (TextView) listItemView.findViewById(R.id.item_desc);
        desc.setText(item.getDesc());
        ImageView imag = (ImageView) listItemView.findViewById(R.id.list_image_id);
        if(item.fragmentHasImage())
            imag.setImageResource(item.getImageResourceID());
        else
            imag.setVisibility(View.GONE);
        LinearLayout textLayout = (LinearLayout) listItemView.findViewById(R.id.item_text_group_id);
        textLayout.setBackgroundResource(colorResourceID);
        return listItemView;
    }
}
