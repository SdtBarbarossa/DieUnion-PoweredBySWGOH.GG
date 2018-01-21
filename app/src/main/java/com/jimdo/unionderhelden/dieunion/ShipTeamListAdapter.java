package com.jimdo.unionderhelden.dieunion;

import android.content.Context;
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

public class ShipTeamListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ArrayList<Ship>> data;
    private static LayoutInflater inflater = null;

    public ShipTeamListAdapter(Context context, ArrayList<ArrayList<Ship>> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        Collections.sort(data, new shipTeamComparator());
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
            vi = inflater.inflate(R.layout.ship_team_list_view, null);

        ArrayList<Ship> nowTeam = data.get(position);

        //Besitzer
        TextView txtBesitzer = (TextView) vi.findViewById(R.id.teamBesitzer);
        String besitzer = nowTeam.get(0).besitzer;
        txtBesitzer.setText(besitzer);

        //Power
        int powerall = 0;
        for(Ship ship : data.get(position)){
            powerall+=ship.power;
        }
        TextView txtPower = (TextView) vi.findViewById(R.id.powerui);
        txtPower.setText("" + powerall);

        //Shiffe

        View nowChar = null;

        //GroßkampfSchiff
        View shipCapitalView = (View) vi.findViewById(R.id.capitalShip);
        //Hauptflotte
        View shipMain1View = (View) vi.findViewById(R.id.shipMain1);
        View shipMain2View = (View) vi.findViewById(R.id.shipMain2);
        View shipMain3View = (View) vi.findViewById(R.id.shipMain3);
        View shipMain4View = (View) vi.findViewById(R.id.shipMain4);
        View shipMain5View = (View) vi.findViewById(R.id.shipMain5);
        //SupportFlotte
        View shipSupport1View = (View) vi.findViewById(R.id.shipsupport1);
        View shipSupport2View = (View) vi.findViewById(R.id.shipsupport2);
        View shipSupport3View = (View) vi.findViewById(R.id.shipsupport3);
        View shipSupport4View = (View) vi.findViewById(R.id.shipsupport4);

        for(int a = 0; a < 10 ; a++){

            switch(a) {
                case 0:
                    nowChar = shipCapitalView;
                    break;
                case 1:
                    nowChar = shipMain1View;
                    break;
                case 2:
                    nowChar = shipMain2View;
                    break;
                case 3:
                    nowChar = shipMain3View;
                    break;
                case 4:
                    nowChar = shipMain4View;
                    break;
                case 5:
                    nowChar = shipMain5View;
                    break;
                case 6:
                    nowChar = shipSupport1View;
                    break;
                case 7:
                    nowChar = shipSupport2View;
                    break;
                case 8:
                    nowChar = shipSupport3View;
                    break;
                case 9:
                    nowChar = shipSupport4View;
                    break;
                default:
                    break;
            }

            TextView txtlvl = (TextView) nowChar.findViewById(R.id.lvl);
            TextView txtperfektheit = (TextView) nowChar.findViewById(R.id.perfektheit1);
            ImageView shipImage = (ImageView) nowChar.findViewById(R.id.shipImage1);

            ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar11));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar21));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar31));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar41));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar51));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar61));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar71));

            if(a >= nowTeam.size()){
                txtlvl.setText("0");
                txtperfektheit.setText("0");
                for(int i = 0; i < imageStarList.size() ; i++) {
                  imageStarList.get(i).setImageResource(R.drawable.nostar);
                }
                shipImage.setImageResource(R.drawable.wallpaper);
            }else {

                txtlvl.setText(data.get(position).get(a).getLevel().toString());
                txtperfektheit.setText(data.get(position).get(a).getPerfekt().toString());

                if(data.get(position).get(a).shipImageID() != 0)
                    shipImage.setImageResource(data.get(position).get(a).shipImageID());

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
