package com.zpl.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.zpl.testapp.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void ls1_SendMessage(View view) {
    	Intent intent = new Intent(this, Ls1DisplayMessageActivity.class);
    	
    	EditText editText = (EditText)findViewById(R.id.ls1_edit_message);
    	String msg = editText.getText().toString();
    	Log.i("Ls1Main", msg);
    	intent.putExtra(EXTRA_MESSAGE, msg);
    	startActivity(intent);
    }
    
}
