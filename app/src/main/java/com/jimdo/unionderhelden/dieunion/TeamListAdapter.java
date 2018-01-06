package com.jimdo.unionderhelden.dieunion;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

public class TeamListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ArrayList<Charakter>> data;
    private static LayoutInflater inflater = null;

    public TeamListAdapter(Context context, ArrayList<ArrayList<Charakter>> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        Collections.sort(data, new teamComparator());
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
            vi = inflater.inflate(R.layout.char_team_list_view, null);

        ArrayList<Charakter> nowTeam = data.get(position);

        //Besitzer
        TextView txtBesitzer = (TextView) vi.findViewById(R.id.teamBesitzer);
        String besitzer = nowTeam.get(0).Besitzer;
        txtBesitzer.setText(besitzer);

        View nowChar = null;

        View char1View = (View) vi.findViewById(R.id.char1);
        View char2View = (View) vi.findViewById(R.id.char2);
        View char3View = (View) vi.findViewById(R.id.char3);
        View char4View = (View) vi.findViewById(R.id.char4);
        View char5View = (View) vi.findViewById(R.id.char5);

        for(int a = 0; a < 5 ; a++){

            switch(a) {
                case 0:
                    nowChar = char1View;
                    break;
                case 1:
                    nowChar = char2View;
                    break;
                case 2:
                    nowChar = char3View;
                    break;
                case 3:
                    nowChar = char4View;
                    break;
                case 4:
                    nowChar = char5View;
                    break;
                default:
                    break;
            }

            TextView txtGear = (TextView) nowChar.findViewById(R.id.gear);
            TextView txtperfektheit = (TextView) nowChar.findViewById(R.id.perfektheit1);
            ImageView charImage = (ImageView) nowChar.findViewById(R.id.charImage1);
            ImageView gearImage = (ImageView) nowChar.findViewById(R.id.gearImage1);

            ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar11));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar21));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar31));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar41));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar51));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar61));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar71));

            if(a >= nowTeam.size()){
                txtGear.setText("0");
                txtperfektheit.setText("0");
                for(int i = 0; i < imageStarList.size() ; i++) {
                  imageStarList.get(i).setImageResource(R.drawable.nostar);
                }
                charImage.setImageResource(R.drawable.wallpaper);
            }else {

                txtGear.setText(data.get(position).get(a).getGear().toString());
                txtperfektheit.setText(data.get(position).get(a).getPerfekt().toString());

                if(data.get(position).get(a).gearImageID() != 0)
                    gearImage.setImageResource(data.get(position).get(a).gearImageID());

                if(data.get(position).get(a).charImageID() != 0)
                    charImage.setImageResource(data.get(position).get(a).charImageID());

                int stars = data.get(position).get(a).getSterne();

                for (int i = 0; i < imageStarList.size(); i++) {
                    if (i < stars) {
                        imageStarList.get(i).setImageResource(R.drawable.star);
                    } else {
                        imageStarList.get(i).setImageResource(R.drawable.nostar);
                    }
                }
            }

        }

        return vi;
    }

}
