package com.example.helloworld;

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


public class Entra extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button conferma,indietro,canc;
	TextView app1,app2,app3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrata);
        final Bundle bundle1 = this.getIntent().getExtras(); 
        conferma= (Button) findViewById(R.id.idTornahome);
        indietro= (Button) findViewById(R.id.indietro1);
        canc= (Button) findViewById(R.id.button2);
        app1= (TextView) findViewById(R.id.textView2);
        app2= (TextView) findViewById(R.id.textView3);
        app3= (TextView) findViewById(R.id.textView4);
        
        final AlertDialog txtOra = new AlertDialog.Builder(this).create();  
        txtOra.setCancelable(false); // This blocks the 'BACK' button  
        txtOra.setMessage("Sei entrato alle ore  "+bundle1.getString("ora")); 
         txtOra.setButton2("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
				
			}
		});
         txtOra.show();
        final AlertDialog txtPrima = new AlertDialog.Builder(this).create();  
        txtPrima.setCancelable(false); // This blocks the 'BACK' button  
        txtPrima.setMessage("Cancellare appuntamenti");  
        final AlertDialog txtNoapp = new AlertDialog.Builder(this).create();  
        txtNoapp.setCancelable(false); // This blocks the 'BACK' button  
        txtNoapp.setMessage("Non ci sono appuntamenti per oggi");  
        txtNoapp.setButton2("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
				
			}
		});
        txtPrima.setButton("Conferma", new DialogInterface.OnClickListener() {  
            @Override  
            public void onClick(DialogInterface dialog, int which) {  
                dialog.dismiss();   
            	app1.setText("");
				app2.setText("");
				app3.setText("");
            }
            
        });  
        txtPrima.setButton2("Annulla", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				 dialog.dismiss();   
				
			}
		});
   	 
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
					if(app1.getText()=="" && app2.getText()=="" && app3.getText()=="")
						txtNoapp.show();
					else
					// TODO Auto-generated method stub
				txtPrima.show();
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
					
		//prova git
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
  
    
}

