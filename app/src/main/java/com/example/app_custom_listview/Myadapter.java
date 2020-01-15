package com.example.app_custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadapter extends BaseAdapter {
    Context c;
    ArrayList<String>data;
    public  Myadapter(Context c, ArrayList<String>data){
        this.c=c;
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null) {
            LayoutInflater.from(c).inflate(android.R.layout.simple_list_item_2, null, false);
        }
            TextView txt=v.findViewById(android.R.id.text2);
            String name=data.get(i);
            txt.setText(name);


        return v;
    }
}
