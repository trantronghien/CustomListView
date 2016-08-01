package com.it85.hientran.customlistview;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;


import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView lv;
    ArrayList<Android> mang = new ArrayList<Android>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        putData();
        lv=(ListView) findViewById(R.id.listView);
        final Intent intent = new Intent(MainActivity.this , Table_item.class);
        // tao đối tượng custom adapter
        CustomAdapter adapter = new CustomAdapter(MainActivity.this , R.layout.activity_item_list , mang);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);  // hiện thị menu cho item list

        // bắt sự kiện click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(intent);
            }
        });

        // set longClick item
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String dialogItem[] = {"Save" , "Delete" , "Edit"};


        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                //fixme : lấy 1 thuộc tính trong class của 1 Đối tượng trong Arraylist
//                String item = ((Android)mang.get(position)).getTenversion();
//                Toast.makeText(MainActivity.this, ""+ item, Toast.LENGTH_SHORT).show();

                builder.setItems(dialogItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        Toast.makeText(getApplicationContext(), dialogItem[item], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
                return true;
            }
        });

    }

    public void putData(){
        mang.add(new Android("Cupcake" , "Android 1.5" , R.drawable.icon_v15));
        mang.add(new Android("Donut" , "Android 1.6" , R.drawable.icon_v16));
        mang.add(new Android("Eclair" , "Android 2.0 - 2.1" , R.drawable.icon_v20));
        mang.add(new Android("Froyo" , "Android 2.2 – 2.2.3" , R.drawable.icon_v21));
        mang.add(new Android("Gingerbread" , "Android 2.3 – 2.3.7" , R.drawable.icon_v23));
        mang.add(new Android("Honeycomb" , "Android 3.0 – 3.2.6" , R.drawable.icon_v3x));
        mang.add(new Android("Ice Cream Sandwich" , "Android 4.0 – 4.0.4" , R.drawable.icon_v40));
        mang.add(new Android("Jelly Bean" , "Android 4.1 – 4.3.1" , R.drawable.icon_v41));
        mang.add(new Android("KitKat" , "Android 4.4 – 4.4.4" , R.drawable.icon_v44));
        mang.add(new Android("Lollipop" , "Android 5.0 – 5.1.1" , R.drawable.icon_v50));
        mang.add(new Android("Marshmallow" , "Android 6.0 – 6.0.1" , R.drawable.icon_v60));
        mang.add(new Android("Nougat" , "Android 7.0" , R.drawable.icon_v70));

    }


    // tạo menu hiện thị trên Context , context sử dụng ở đây là item list
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId() == R.id.listView){
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu_item_list , menu);
        }

    }
/*   chưa sử dụng được context menu
    // sự kiện cho từng item trong context
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo item_adapter = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        lv.getItemIdAtPosition(item_adapter.position);
        switch (item.getItemId()){
            case R.id.item_add:
                Toast.makeText(MainActivity.this, "ADD vào Item", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_delete:
                Toast.makeText(MainActivity.this, "DELETE vào Item", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_edit:
                Toast.makeText(MainActivity.this, "EDIT vào Item", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    // tạo menu trên thanh tadbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

*/

}
