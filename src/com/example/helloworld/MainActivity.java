package com.example.helloworld;

import java.io.InputStream;
import java.text.Normalizer.Form;

import android.R.bool;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	int p;
    Button next,entra,esci;
    TextView lbldave;
    AutoCompleteTextView codice;
    boolean ok;
    RelativeLayout stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         p=0;
      ok=true;
    
      lbldave= (TextView) findViewById(R.id.txtdave);
      codice = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
    	stop = (RelativeLayout) findViewById(R.id.idRLTEXT);
       
    
    codice.setOnKeyListener(new View.OnKeyListener() {
		
		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			// TODO Auto-generated method stub
		
			if(p==21)
			{
				Bundle bundle = new Bundle();
				bundle.putString("name", codice.getText().toString());
				
				//mio programma
				Intent form_intent = new Intent(getApplicationContext(), pg2.class);
				form_intent.putExtras(bundle);
				startActivity(form_intent);
				codice.removeTextChangedListener(null);
				stop.removeView(codice);
				codice.setOnTouchListener(new View.OnTouchListener() {

			        @Override
			        public boolean onTouch(View v, MotionEvent event) {
			                return true;
			        }
			});
				finish();
			
			}
	
		p++;
			return false;
		
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
