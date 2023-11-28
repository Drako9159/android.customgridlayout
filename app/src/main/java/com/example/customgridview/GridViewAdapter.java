package com.example.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<User> userArrayList;

    GridViewAdapter(Context context, ArrayList<User> userArsUserArrayList) {
        this.context = context;
        this.userArrayList = userArsUserArrayList;
    }

    @Override
    public int getCount() {
        return userArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return userArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.grid_view_item, null);

        }
        TextView textViewName = (TextView) convertView.findViewById(R.id.textViewName);
        textViewName.setText(userArrayList.get(position).name);
        return convertView;


    }
}
