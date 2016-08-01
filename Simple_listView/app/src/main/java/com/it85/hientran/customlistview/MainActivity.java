package com.it85.hientran.customlistview;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;


import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView lv;
    ArrayList<Object_Adapter> mang = new ArrayList<Object_Adapter>();

//    public static int [] prgmImages={R.drawable.hinh1,R.drawable.hinh2,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.listView);
        doCreateData();


        final Intent intent = new Intent(MainActivity.this , Table_item.class);

        // tao đối tượng custom adapter
        CustomAdapter adapter = new CustomAdapter(MainActivity.this , R.layout.activity_item_list , mang);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(intent);

            }
        });

    }


    // add dữ liệu vào mảng
    private void doCreateData(){

        Object_Adapter object = new Object_Adapter();
        object.setTenversion("Android 1.5 ");
        object.setVersion("Cupcake");
        object.setHinh(R.drawable.hinh14);

        Object_Adapter object1 = new Object_Adapter();
        object1.setTenversion("Android 1.6 ");
        object1.setVersion("Donut");
        object1.setHinh(R.drawable.hinh1);

        Object_Adapter object2 = new Object_Adapter();
        object2.setTenversion("Android 2.0 và Android 2.1 ");
        object2.setVersion("Eclair");
        object2.setHinh(R.drawable.hinh11);


        Object_Adapter object3 = new Object_Adapter();
        object3.setTenversion("Android 2.2 ");
        object3.setVersion("Froyo");
        object3.setHinh(R.drawable.hinh15);

        Object_Adapter object4 = new Object_Adapter();
        object4.setTenversion("Android 2.3 ");
        object4.setVersion("Gingerbread");
        object4.setHinh(R.drawable.hinh7);

        Object_Adapter object5 = new Object_Adapter();
        object5.setTenversion("Android 3.x ");
        object5.setVersion("Honeycomb");
        object5.setHinh(R.drawable.hinh8);

        Object_Adapter object6 = new Object_Adapter();
        object6.setTenversion("Android 4.0 ");
        object6.setVersion("Ice Cream Sandwich");
        object6.setHinh(R.drawable.hinh20);

        Object_Adapter object7 = new Object_Adapter();
        object7.setTenversion("Android 4.1 ");
        object7.setVersion("Jelly Bean");
        object7.setHinh(R.drawable.hinh18);

        Object_Adapter object8 = new Object_Adapter();
        object8.setTenversion("Android 4.4");
        object8.setVersion("KitKat");
        object8.setHinh(R.drawable.hinh8);

        Object_Adapter object9 = new Object_Adapter();
        object9.setTenversion("Android 5.0 ");
        object9.setVersion("Lollipop");
        object9.setHinh(R.drawable.hinh15);

        Object_Adapter object10 = new Object_Adapter();
        object10.setTenversion("Android 6.0");
        object10.setVersion("Marshmallow");
        object10.setHinh(R.drawable.hinh18);

        Object_Adapter object11 = new Object_Adapter();
        object11.setTenversion("Android N 7.0");
        object11.setVersion(" Nougat");
        object11.setHinh(R.drawable.hinh20);

        mang.add(object);
        mang.add(object1);
        mang.add(object2);
        mang.add(object3);
        mang.add(object4);
        mang.add(object5);
        mang.add(object6);
        mang.add(object7);
        mang.add(object8);
        mang.add(object9);
        mang.add(object10);
        mang.add(object11);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}
