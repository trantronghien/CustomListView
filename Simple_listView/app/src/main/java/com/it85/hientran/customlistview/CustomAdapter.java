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
public class CustomAdapter extends ArrayAdapter<Object_Adapter> {


    // màn hình
    Context manhinh;
    ArrayList<Object_Adapter> mang = new ArrayList<Object_Adapter>();

    public CustomAdapter(Context context, int resource, List<Object_Adapter> objects) {
        super(context, resource, objects);
        this.manhinh = context;
        this.mang = new ArrayList<Object_Adapter>(objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView ;
        ViewHoder anhxa = new ViewHoder();  // dùng ViewHoder để tránh hiện tượng giật lag

        if(v == null){
            LayoutInflater inflater = (LayoutInflater) manhinh.getSystemService(Context.LAYOUT_INFLATER_SERVICE);   // đọc code từ file XML đổ sang cho view
            v = inflater.inflate(R.layout.activity_item_list , null);
            anhxa.txtxtenversion = (TextView)v.findViewById(R.id.textViewten);
            anhxa.txtvversion = (TextView)v.findViewById(R.id.textViewversion);
            anhxa.imahinh = (ImageView)v.findViewById(R.id.imageViewhinh);
            v.setTag(anhxa);
        }
        else{
            anhxa = (ViewHoder)convertView.getTag();
        }

        Object_Adapter ob = mang.get(position);

            anhxa.txtxtenversion.setText(ob.getTenversion());
            anhxa.txtvversion.setText(ob.getVersion());
            anhxa.imahinh.setImageResource(ob.getHinh());

        return v;
    }

    static class ViewHoder{
        TextView txtxtenversion;
        TextView txtvversion;
        ImageView imahinh;
    }
}
