package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Entra extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button conferma,indietro,canc;
	TextView app1,app2,app3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrata);
        
        conferma= (Button) findViewById(R.id.idTornahome);
        indietro= (Button) findViewById(R.id.indietro1);
        canc= (Button) findViewById(R.id.button2);
        app1= (TextView) findViewById(R.id.textView2);
        app2= (TextView) findViewById(R.id.textView3);
        app3= (TextView) findViewById(R.id.textView4);
        	conferma.setOnClickListener(new View.OnClickListener() {
        		
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent form_intent = new Intent("com.example.helloworld.MainActivity");
					startActivity(form_intent);
					finish();
				}
			});
canc.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					app1.setText("");
					app2.setText("");
					app3.setText("");
				}
			});
        	indietro.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					finish();
				}
			});
					
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
  
    
}

