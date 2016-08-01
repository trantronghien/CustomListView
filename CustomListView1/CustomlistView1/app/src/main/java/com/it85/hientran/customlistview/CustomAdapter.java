package com.it85.hientran.customlistview;

import android.content.Context;
import android.media.Image;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hientran on 3/22/2016.
 */
public class CustomAdapter extends ArrayAdapter<Android> {


    // màn hình
    Context manhinh;
    ArrayList<Android> mang = new ArrayList<Android>();

    public CustomAdapter(Context context, int resource, List<Android> objects) {
        super(context, resource, objects);
        this.manhinh = context;
        this.mang = new ArrayList<Android>(objects);
    }
    // get set Arraylist


    public ArrayList<Android> getMang() {
        return mang;
    }

    public void setMang(ArrayList<Android> mang) {
        this.mang = mang;
    }

    @Override
    public int getCount() {
        return mang.size();
    }

    @Override
    public Android getItem(int position) {
        return mang.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView ;
//        ViewHoder viewhoder = new ViewHoder();
//
//        if(v == null){
//            LayoutInflater inflater = (LayoutInflater) manhinh.getSystemService(Context.LAYOUT_INFLATER_SERVICE);   // đọc code từ file XML đổ sang cho view
//            v = inflater.inflate(R.layout.activity_item_list , null);
//            viewhoder.txtxtenversion = (TextView)v.findViewById(R.id.textViewten);
//            viewhoder.txtvversion = (TextView)v.findViewById(R.id.textViewversion);
//            viewhoder.imahinh = (ImageView)v.findViewById(R.id.imageViewhinh);
//            v.setTag(viewhoder);
//        }
//        else{
//            viewhoder = (ViewHoder)v.getTag();
//        }
//        Android android = mang.get(position);
//        viewhoder.txtxtenversion.setText(android.getTenversion());
//        viewhoder.txtvversion.setText(android.getVersion());
//        viewhoder.imahinh.setImageResource(android.getHinh());
        if(v == null){
            LayoutInflater inflater = (LayoutInflater) manhinh.getSystemService(Context.LAYOUT_INFLATER_SERVICE);   // đọc code từ file XML đổ sang cho view
            v = inflater.inflate(R.layout.activity_item_list , null , true);
            TextView txtxtenversion = (TextView)v.findViewById(R.id.textViewten);
            TextView txtvversion = (TextView)v.findViewById(R.id.textViewversion);
            ImageView imahinh = (ImageView)v.findViewById(R.id.imageViewhinh);
            Android android = mang.get(position);
            txtxtenversion.setText(android.getTenversion());
            txtvversion.setText(android.getVersion());
            imahinh.setImageResource(android.getHinh());
           // v.setTag(inflater);
        }
//        else{
//            v.getTag();
//        }
        return v;
    }


    // tránh cho listView không bi giật lag
//    static class ViewHoder{
//        TextView txtxtenversion;
//        TextView txtvversion;
//        ImageView imahinh;
//    }
}
