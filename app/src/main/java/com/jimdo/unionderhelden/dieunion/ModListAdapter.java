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

public class ModListAdapter extends BaseAdapter {

    Context context;
    ArrayList<Mod> data;
    private static LayoutInflater inflater = null;

    public ModListAdapter(Context context, ArrayList<Mod> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
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
            vi = inflater.inflate(R.layout.mod_list_view, null);

        //Primärwert
        TextView txtPrimary = (TextView) vi.findViewById(R.id.primaryTextView);
        txtPrimary.setText(data.get(position).PrimaryAttribut.replace("Health", "Gesundheit")
                .replace("Speed", "Tempo")
                .replace("Potency", "Stärke")
                .replace("Tenacity", "Zähigkeit")
                .replace("Protection", "Schutz")
                .replace("Offense", "Angriff")
                .replace("Defense", "Abwehr")
                .replace("Critical Chance", "Krit. Chance")
                .replace("Critical Avoidance", "Krit. Ausweichen")
                .replace("Critical Damage", "Krit. Schaden")
                .replace("Accuracy", "Effektivität"));

        //Sekundärwerte
        TextView txtSekundary = (TextView) vi.findViewById(R.id.sekundaryTextView);
        String Anzeige = "";
        for(int z = 0 ; z < data.get(position).Attributes.size() ; z++){
                Anzeige += data.get(position).Attributes.get(z) + "\n";
        }
        txtSekundary.setText(Anzeige.replace("Health", "Gesundheit")
                .replace("Speed", "Tempo")
                .replace("Potency", "Effektivität")
                .replace("Tenacity", "Zähigkeit")
                .replace("Protection", "Schutz")
                .replace("Offense", "Angriff")
                .replace("Defense", "Abwehr")
                .replace("Critical Chance", "Krit. Chance")
                .replace("Critical Avoidance", "Krit. Ausweichen")
                .replace("Critical Damage", "Krit. Schaden")
                .replace("Accuracy", "Genauigkeit"));

        //Bild
        ImageView modImage = (ImageView) vi.findViewById(R.id.modImage);

        String Modname = data.get(position).Name;
        if(Modname.contains("Health")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_1_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_1_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_1_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_1_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_1_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_1_6);
            }

        }else if(Modname.contains("Offense")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_2_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_2_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_2_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_2_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_2_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_2_6);
            }

        }else if(Modname.contains("Defense")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_3_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_3_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_3_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_3_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_3_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_3_6);
            }

        }else if(Modname.contains("Speed")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_4_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_4_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_4_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_4_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_4_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_4_6);
            }

        }else if(Modname.contains("Crit Chance")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_5_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_5_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_5_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_5_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_5_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_5_6);
            }

        }else if(Modname.contains("Crit Damage")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_6_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_6_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_6_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_6_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_6_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_6_6);
            }

        }else if(Modname.contains("Potency")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_7_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_7_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_7_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_7_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_7_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_7_6);
            }

        }else if(Modname.contains("Tenacity")){
            if(Modname.contains("Transmitter")){
                modImage.setImageResource(R.drawable.statmodmystery_8_1);
            }else if(Modname.contains("Receiver")){
                modImage.setImageResource(R.drawable.statmodmystery_8_2);
            }else if(Modname.contains("Processor")){
                modImage.setImageResource(R.drawable.statmodmystery_8_3);
            }else if(Modname.contains("Holo-Array")){
                modImage.setImageResource(R.drawable.statmodmystery_8_4);
            }else if(Modname.contains("Data-Bus")){
                modImage.setImageResource(R.drawable.statmodmystery_8_5);
            }else if(Modname.contains("Multiplexer")){
                modImage.setImageResource(R.drawable.statmodmystery_8_6);
            }

        }

        return vi;
    }

}
