package com.yuibox.HelloAndroid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Integer [] mIds;
    
    public ImageAdapter(Context c, Integer [] mThumbIds) {
        mContext = c;
        mIds= mThumbIds;
    }

    public int getCount() {
        return mIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            /**imageView.setLayoutParams(new GridView.LayoutParams(85, 85));**/ /**SETS pixs to 85x85*/
            imageView.setAdjustViewBounds(true); 
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mIds[position]);
        return imageView;
    }
    
    

}