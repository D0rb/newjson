package com.dorbismuth.apptst;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ListView listView;
    private Button btn;
    private EditText editText;
    static newsObj newsObj = new newsObj();
    public JSONArray jsonArray;
    private ArrayAdapter<String> adapter;
    private ArrayList<newsObj> titles = new ArrayList<>();

    static String ApiKEY = "a84fe07796df46ab99e4ccfd145b2577";
    static String URL = "https://newsapi.org/v2/top-headlines?sources=abc-news&apiKey=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new getJSON().execute();

    }
    private class getJSON extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... params) {
            return Stream.downloadSource(URL+ApiKEY);
        }

        @Override
        protected void onPostExecute(String s) {
            try {
                JSONObject jsonObject = new JSONObject(s);
                JSONArray jsonArray = jsonObject.getJSONArray("articles");
                newsObj.setObject(jsonArray , titles);
                if (titles.size()!=0) {
                    listView = (ListView) findViewById(R.id.listView);
                    adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
                    listView.setAdapter(adapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent i = new Intent(getApplicationContext() , readActivity.class);
                            i.putExtra("title",newsObj.getTitle(titles.get(position)));
                            i.putExtra("source",newsObj.getSource(titles.get(position)));
                            i.putExtra("description",newsObj.getDescription(titles.get(position)));
                            startActivity(i);

                        }
                    });
                    for (int i=0;i<titles.size();i++){
                        adapter.add(newsObj.getTitle(titles.get(i)));
                    }
                    adapter.notifyDataSetChanged();
                }
            } catch (JSONException e) {
                Log.d("Dor",e.toString());
            }

            super.onPostExecute(s);
        }
    }

}
