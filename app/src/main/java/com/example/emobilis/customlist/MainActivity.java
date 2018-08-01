package com.example.emobilis.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Custom> listitems;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        listitems = new ArrayList<>();
        listitems.add(new Custom(R.drawable.a,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.b,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.c,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.d,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.e,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.f,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.g,"Gaza","Gully"));
        listitems.add(new Custom(R.drawable.h,"Gaza","Gully"));
        CustomAdapter adapter = new CustomAdapter(this,R.layout.trill,listitems);
        listView.setAdapter(adapter);
    }
}
