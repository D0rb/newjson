package com.dorbismuth.apptst;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Dor on 14/12/2018.
 */

public class newsObj {
    private String source;
    private  int id;
    private  String author;
    private  String title;
    private  String description;
    private  String urlToImage;
    private  String publishedAt;
    private  String content;
    public String getSource(newsObj obj){
        return obj.source;
    }
    public  String getTitle(newsObj obj){
        return obj.title;
    }
    public  String getAuthor(newsObj obj){
        return obj.author;
    }
    public  String getDescription(newsObj obj){
        return obj.description;
    }
    public  String getUrlToImage(newsObj obj){
        return obj.urlToImage;
    }
    public  String getPublishedAt(newsObj obj){
        return obj.publishedAt;
    }
    public  String getContent(newsObj obj){
        return obj.content;
    }

    public  ArrayList<newsObj> setObject(JSONArray array , ArrayList<newsObj> arrlist){
        JSONObject jsonObject = null;
    for (int i=0;i<array.length();i++){
        try {
            newsObj _obj = new newsObj();
            jsonObject = array.getJSONObject(i);
            jsonObject.getString("source");
            id = i;
            _obj.source = jsonObject.get("author").toString();
            _obj.title = jsonObject.get("title").toString();
            _obj.description = jsonObject.get("description").toString();
            _obj.urlToImage = jsonObject.get("urlToImage").toString();
            _obj.publishedAt = jsonObject.get("publishedAt").toString();
            _obj.content = jsonObject.get("content").toString();
            arrlist.add(_obj);
        } catch (JSONException e) {
            Log.d("Dor",e.toString() + " Error at newsObj");
        }

    }
    return  arrlist;
    }

}
