package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Esci extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button conferma,indietro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.uscita);
        
        	conferma= (Button) findViewById(R.id.btnConfus);
        	indietro= (Button) findViewById(R.id.idIndietro1);
conferma.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent form_intent = new Intent("com.example.helloworld.MainActivity");
					startActivity(form_intent);
					finish();
					
				}
			});

indietro.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		finish();
	}
});


    };
  
				
				
			
		
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
  
    
}

