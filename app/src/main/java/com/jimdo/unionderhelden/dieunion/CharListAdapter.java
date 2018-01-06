package com.jimdo.unionderhelden.dieunion;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alle on 15.11.2017.
 */

public class CharListAdapter extends BaseAdapter {

    Context context;
    ArrayList<Charakter> data;
    private static LayoutInflater inflater = null;

    public CharListAdapter(Context context, ArrayList<Charakter> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        Collections.sort(data, new charComparator());
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.char_list_view, null);

        //Besitzer
        TextView txtBesitzer = (TextView) vi.findViewById(R.id.Besitzer);
        txtBesitzer.setText(data.get(position).Besitzer);

        //Name
        TextView txtCharName = (TextView) vi.findViewById(R.id.charName);
        txtCharName.setText(data.get(position).getName());

        TextView txtGear = (TextView) vi.findViewById(R.id.gear);
        txtGear.setText(data.get(position).getGear().toString());

        TextView txtperfektheit = (TextView) vi.findViewById(R.id.perfektheit);
        txtperfektheit.setText(data.get(position).getPerfekt().toString());

        TextView txtPower = (TextView) vi.findViewById(R.id.powerTxtView);
        txtPower.setText(data.get(position).power.toString());

        ImageView charImage = (ImageView) vi.findViewById(R.id.charImage);
        ImageView gearImage = (ImageView) vi.findViewById(R.id.gearImage);

        if(data.get(position).gearImageID() != 0)
        gearImage.setImageResource(data.get(position).gearImageID());

        if(data.get(position).charImageID() != 0)
        charImage.setImageResource(data.get(position).charImageID());

        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar1));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar2));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar3));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar4));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar5));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar6));
        imageStarList.add((ImageView) vi.findViewById(R.id.nostar7));

        int stars = data.get(position).getSterne();

        for(int i = 0; i < imageStarList.size() ; i++) {
            if(i < stars) {
                imageStarList.get(i).setImageResource(R.drawable.star);
            }else{
                imageStarList.get(i).setImageResource(R.drawable.nostar);
            }
        }

        return vi;
    }

}
