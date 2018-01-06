package com.jimdo.unionderhelden.dieunion;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Alle on 16.11.2017.
 */

public class TWGebiteFragment extends Fragment implements View.OnClickListener {

    public GildenInfos gildenInfos;
    public MainPage mainpage;
    public TWGebiet twGebiet;

    public void SetArguments(GildenInfos gildenInfos,MainPage mainpage,TWGebiet twGebiet){
        this.gildenInfos = gildenInfos;
        this.mainpage = mainpage;
        this.twGebiet = twGebiet;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tw_gebite_page,
                container, false);

        Spinner spinMember = view.findViewById(R.id.twMemberSpinner);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getBaseContext(),android.R.layout.simple_spinner_item, gildenInfos.getMemberListe());
        spinMember.setAdapter(adapter);

        Button btTWGebieteZurueck = view.findViewById(R.id.twButtonTeamzurueck);
        btTWGebieteZurueck.setOnClickListener(this);

        Button btTWGebieteHinzu = view.findViewById(R.id.twButtonTeamHinzu);
        btTWGebieteHinzu.setOnClickListener(this);

        TextView twGebietsName = view.findViewById(R.id.gebietsNameTextView);
        twGebietsName.setText(twGebiet.GebietsName);

        TextView twGebietTeamAnzahl = view.findViewById(R.id.TeamsGesTxtView);
        twGebietTeamAnzahl.setText("" + twGebiet.teams.size());

        //ALLE Charaktere in der Liste
        ListView listGebietTeamsView = view.findViewById(R.id.gebietsListView);
        listGebietTeamsView.setAdapter(new GebieteTeamListAdapter(getActivity().getBaseContext(), twGebiet.teams));

        listGebietTeamsView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>adapter,View v, int position, long l){
                mainpage.currentTWTeamToDelete = (TWTeam) adapter.getItemAtPosition(position);
                //
                new AlertDialog.Builder(getActivity().getBaseContext())
                        .setTitle("Wirklich?")
                        .setMessage("Team von " + mainpage.currentTWTeamToDelete.charaktere.get(0).besitzer + " löschen?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int whichButton) {
                                TWGebiet currentGebite = TWGebiteFragment.this.mainpage.currentTwGebiet;
                                currentGebite.teams.remove(TWGebiteFragment.this.mainpage.currentTWTeamToDelete);
                                TWGebiteFragment.this.mainpage.twPlanSpeichern();
                                ListView charSelectorListView = getActivity().findViewById(R.id.gebietsListView);
                                ((BaseAdapter) charSelectorListView.getAdapter()).notifyDataSetChanged();
                                Toast.makeText(getActivity().getBaseContext(), "Gelöscht!", Toast.LENGTH_SHORT).show();
                            }})
                        .setNegativeButton(android.R.string.no, null).show();
                //

            }
        });

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v == getActivity().findViewById(R.id.twButtonTeamzurueck)){
            mainpage.showTWUi();
        } else if(v == getActivity().findViewById(R.id.twButtonTeamHinzu)){
            if(mainpage.currentTwGebiet.teams.size() < 17) {
                Spinner spinMember = getActivity().findViewById(R.id.twMemberSpinner);
                MemberListe member = (MemberListe) spinMember.getSelectedItem();
                mainpage.showTWCharSelectorUI(member);
            }else{
                Toast.makeText(getActivity().getBaseContext(), "Es gehen Maximal 17 Teams!", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
