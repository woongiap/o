package com.ngiap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View.OnClickListener;
import android.app.Dialog;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Button;

public class Page2 extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Button button = (Button)findViewById(R.id.button_one);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
		System.err.println("click on page 2");
		finish();                
            }
        });
    }
}

