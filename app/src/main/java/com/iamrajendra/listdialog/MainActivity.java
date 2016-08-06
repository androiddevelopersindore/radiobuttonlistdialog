package com.iamrajendra.listdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.iamrajendra.listdialog.dialog.ListDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButton_openDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mButton_openDialog = (Button)findViewById(R.id.activity_main_simple_b);
        mButton_openDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ListDialog   listDialog = new ListDialog();
        listDialog.show(getSupportFragmentManager(),"");
    }
}
