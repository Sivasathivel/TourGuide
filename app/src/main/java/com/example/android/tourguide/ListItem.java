package com.example.android.tourguide;

/**
 * Created by sivasathivelkandasamy on 2016-10-26.
 */

public class ListItem {
    private String title;
    private String desc;
    private int imgID;
    private boolean hasImage = false;
    //All items has images, no boolean variable not required

    //Constructor
    public ListItem(String name, String details, int imageResouceID){
        title = name;
        desc  = details;
        imgID = imageResouceID;
        hasImage = true;
    }
    public ListItem(String name, String details){
        title = name;
        desc  = details;
    }
    /*Explicit Setters Not Required...
      ...as the items would be assigned using the Constructor
     */
    //Getters
    public String getTitle(){return title;}
    public String getDesc(){return desc;}
    public int getImageResourceID(){return imgID;}
    public boolean fragmentHasImage(){return hasImage;}
}
