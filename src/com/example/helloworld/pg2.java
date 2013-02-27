package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pg2 extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button entra,esci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina2);
        {
        	 entra = (Button) findViewById(R.id.identra);
        	 esci = (Button) findViewById(R.id.idesci);
        	 final TextView idcodice = (TextView) findViewById(R.id.textView1);   
        	
        	 Bundle bundle = this.getIntent().getExtras();    
        	idcodice.setText("BUONGIORNO          "+bundle.getString("name"));
        	
		entra.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent form_intent = new Intent("com.example.helloworld.Entra");
				
				startActivity(form_intent);
				
			}
		});
		
esci.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 
				Intent form_intent = new Intent("com.example.helloworld.Esci");
				
				startActivity(form_intent);
				
			}
			
		});



    }
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
  
    
}
