package com.example.helloworld;

import java.util.Random;

import android.net.Uri;
import android.os.Bundle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Esci extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button conferma,indietro;
	TextView oreRie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.uscita);
        final Bundle bundle1 = this.getIntent().getExtras();  
        final AlertDialog txtStraor = new AlertDialog.Builder(this).create();  
        txtStraor.setCancelable(false); // This blocks the 'BACK' button  
        txtStraor.setMessage("Straordinario");  
        txtStraor.setButton("Autorizzato", new DialogInterface.OnClickListener() {  
            @Override  
            public void onClick(DialogInterface dialog, int which) {  
                dialog.dismiss();   
            	Intent form_intent = new Intent("com.example.helloworld.MainActivity");
				startActivity(form_intent);
				finish();
            }
            
        });  
        final AlertDialog txtOra = new AlertDialog.Builder(this).create();  
        txtOra.setCancelable(false); // This blocks the 'BACK' button  
        txtOra.setMessage("Sei uscito alle ore  "+bundle1.getString("ora")); 
         txtOra.setButton2("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
				
			}
		});
         txtOra.show();
        txtStraor.setButton2("Non autorizzato", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
					Intent form_intent = new Intent("com.example.helloworld.MainActivity");
					startActivity(form_intent);
					finish();
			}
		});
        
        final AlertDialog txtPrima = new AlertDialog.Builder(this).create();  
        txtPrima.setCancelable(false); // This blocks the 'BACK' button  
        txtPrima.setMessage("Orario di lavoro inferiore a 8 ore");  
        txtPrima.setButton("Uscita anticipata(Permesso)", new DialogInterface.OnClickListener() {  
            @Override  
            public void onClick(DialogInterface dialog, int which) {  
                dialog.dismiss();   
            	Intent form_intent = new Intent("com.example.helloworld.MainActivity");
				startActivity(form_intent);
				finish();
            }
            
        });  
        txtPrima.setButton2("Uscita orario di lavoro", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
					Intent form_intent = new Intent("com.example.helloworld.MainActivity");
					startActivity(form_intent);
					finish();
			}
		});
     
        	conferma= (Button) findViewById(R.id.btnConfus);
        	indietro= (Button) findViewById(R.id.idIndietro1);
        	oreRie = (TextView) findViewById(R.id.textView1);
        
conferma.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					
					
				
					txtStraor.show();
					txtPrima.show();
					
					// TODO Auto-generated method stub
				
					
				}
			});

indietro.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Bundle bundle = bundle1;
		Intent form_intent = new Intent(getApplicationContext(), pg2.class);
		form_intent.putExtras(bundle);
		startActivity(form_intent);
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

