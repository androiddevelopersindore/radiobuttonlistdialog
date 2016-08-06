package com.iamrajendra.listdialog.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.iamrajendra.listdialog.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajendraverma on 04-08-2016.
 */
public class ListDialog extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater layoutInflater  = getActivity().getLayoutInflater();
        View view =layoutInflater.inflate(R.layout.list_dialog_fragment,null);
        ListView listView = (ListView)view.findViewById(R.id.list_dialog_fragment_title_lv);

        AlertDialog.Builder builder  = new AlertDialog.Builder(getActivity());
        List<String> stringList = new ArrayList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.select_dialog_singlechoice,stringList);
listView.setAdapter(stringArrayAdapter);

        builder.setView(view).setTitle("Option List").setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        return builder.create();
    }
}
