package com.example.customgridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter gridViewAdapter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User("Antonio"));
        userArrayList.add(new User("Daniela"));
        userArrayList.add(new User("Sofia"));
        userArrayList.add(new User("Marcos"));
        userArrayList.add(new User("Juan"));
        userArrayList.add(new User("Guadalupe"));
        userArrayList.add(new User("Hugo"));

        textView = (TextView) findViewById(R.id.textView);
        gridView = (GridView) findViewById(R.id.gridView);

        gridViewAdapter = new GridViewAdapter(this, userArrayList);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User user = (User) gridViewAdapter.getItem(position);
                textView.setText("User selected: " + user.name);
            }
        });
    }
}