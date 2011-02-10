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
import android.widget.Button;

public class Hello extends Activity {
    
    private static final int DIALOG_ONE = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button)findViewById(R.id.button_one);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                showDialog(DIALOG_ONE);
            }
        });
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.eight:
            showDialog(DIALOG_ONE);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }    
    
    protected Dialog onCreateDialog(int id) {
        Dialog dialog;
        switch(id) {
        case DIALOG_ONE:
            dialog = createAlertDialog();
            break;
        default:
            dialog = null;
        }
        return dialog;
    }    
    
	@SuppressWarnings("unused")
	private static void walk() {
    	System.out.println("walk");
    }
    
    private Dialog createAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
               .setCancelable(false)
               .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        finish();
                   }
               })
               .setNegativeButton("No", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                   }
               });
        return builder.create();
    }
}

