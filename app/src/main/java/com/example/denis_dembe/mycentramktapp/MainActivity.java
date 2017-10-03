package com.example.denis_dembe.mycentramktapp;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"Foods","Fruits","Dressing"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.potrait);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout reltv1= (RelativeLayout) findViewById(R.id.foodsmain);
                RelativeLayout reltv2= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout reltv3 = (RelativeLayout) findViewById(R.id.dressingmain);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Foods":

                            reltv1.setVisibility(View.VISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);

                            break;
                        case "Fruits":

                            reltv1.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.VISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);
                            break;
                        case "Dressing":

                            reltv1.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.VISIBLE);
                            break;
                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout reltv1= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout reltv2= (RelativeLayout) findViewById(R.id.clothesmain);
                RelativeLayout reltv3 = (RelativeLayout) findViewById(R.id.dressingmain);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Foods":

                            reltv1.setVisibility(View.VISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);

                            break;
                        case "Fruits":

                            reltv1.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.VISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);

                            break;
                        case "Dressing":

                            reltv1.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.VISIBLE);
                            break;
                    }
                }
            });
        }
    }
}

