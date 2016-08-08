package com.iamrajendra.listdialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.iamrajendra.listdialog.models.ServerResponse;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton_openDialog;
    private String Tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//        gson_practice();



    }

    private void gson_practice() {
    final Gson gson  = new Gson();
        Ion.with(this).load("https://api.myjson.com/bins/1j1ix").asString().setCallback(new FutureCallback<String>() {
            @Override
            public void onCompleted(Exception e, String result) {
                if(e!=null)
                {
                    Log.e(Tag,"gson_practice exception"+e);
                    return;
                }
                ServerResponse response = gson.fromJson(result, ServerResponse.class);
                Log.i(Tag,""+response.messgae);


            }
        });



    }

    private void init() {
        mButton_openDialog = (Button) findViewById(R.id.activity_main_simple_b);
        mButton_openDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     Intent intent = new Intent(this,NearBYLocationActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }



}