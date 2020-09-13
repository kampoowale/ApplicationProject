package com.example.myapplicationdata.search_flavor.model;

import java.util.List;
//
//public class MyArray
//{
//    List<Data> data;
//
//    public List<Data> getData(){
//        return data;
//    }
//    public void setData(List<Data> data){
//        this.data=data;
//    }
//
//}

class Tag{
    public String name;
    public String display_name;
    public int followers;
    public int total_items;
    public boolean following;
    public boolean is_whitelisted;
    public String background_hash;
    public String thumbnail_hash;
    public String accent;
    public boolean background_is_animated;
    public boolean thumbnail_is_animated;
    public boolean is_promoted;
    public String description;
    public String logo_hash;
    public String logo_destination_url;
    public DescriptionAnnotations description_annotations;
}

class AdConfig{
    public List<String> safeFlags;
    public List<Object> highRiskFlags;
    public List<Object> unsafeFlags;
    public List<Object> wallUnsafeFlags;
    public boolean showsAds;
}

public class MyArray{
    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public List<Datum> data;

}

