package com.example.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class pg2 extends Activity {
	protected static final int PICK_CONTACT_REQUEST = 0;
	Button entra,esci;
	WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.pagina2);
        {
        	// inizio database
        	final Context con = getApplicationContext();
        
        	String test = "stringa di prova";

        
        

        	 webView1 = (WebView) findViewById(R.id.webView1);  
             //Attivo il supporto javascript  
            // webView1.getSettings().setJavaScriptEnabled(true);  
             //Carico la pagina desiderata  
             webView1.loadUrl("http://compiere2.dave-lan/rfidroid/statoPresenze.html");  	
           
      	   

        	
        	    
        	

        	
        	  /* TextView productsTv=(TextView)findViewById(R.id.textView1);
              productsTv.setTypeface(Typeface.createFromAsset(getAssets(),"kberry.ttf"));  
               //caricamento di un font esterno, piazzato nella cartella assets
               
              ListView productsLv=(ListView)findViewById(R.id.listView1);
               
               MyDatabase db=new MyDatabase(getApplicationContext());
               db.open();  //apriamo il db
               
               
               if(db.fetchProducts().getCount()==0){//inserimento dati, solo se il db è vuoto
               
                       db.insertProduct("Telefono", 400);
                       db.insertProduct("Scarpe", 100);
                       db.insertProduct("PC", 500);
                       db.insertProduct("Pane", 2);
                       db.insertProduct("Patente guida", 100); //lol
               
               }
               
               

               Cursor c=db.fetchProducts(); // query
               startManagingCursor(c);


               
               
               SimpleCursorAdapter adapter=new SimpleCursorAdapter( //semplice adapter per i cursor
                               this, 
                               R.layout.splash, //il layout di ogni riga/prodotto 
                               c, 
                               new String[]{MyDatabase.ProductsMetaData.PRODUCT_NAME_KEY,MyDatabase.ProductsMetaData.PRODUCT_PRICE_KEY},//questi colonne 
                               new int[]{R.id.nameTv,R.id.priceTv});//in queste views
               
              

               
               
               productsLv.setAdapter(adapter); //la listview ha questo adapter
               
               
               //qui vediamo invece come reperire i dati e usarli, in questo caso li stampiamo in una textview
               
               int nameCol=c.getColumnIndex(MyDatabase.ProductsMetaData.PRODUCT_NAME_KEY);  //indici delle colonne
               int priceCol=c.getColumnIndex(MyDatabase.ProductsMetaData.PRODUCT_PRICE_KEY);       
               
               if(c.moveToFirst()){  //se va alla prima entry, il cursore non è vuoto
                       do {
                                       
                               productsTv.append("Product Name:"+c.getString(nameCol)+", Price:"+c.getInt(priceCol)+"\n"); //estrazione dei dati dalla entry del cursor
                                               
                               } while (c.moveToNext());//iteriamo al prossimo elemento
               }
               
               db.close();*/
               
        	//fine prova data bese
        	 entra = (Button) findViewById(R.id.identra);
        	 esci = (Button) findViewById(R.id.idesci);
        	
        	 final TextView idcodice = (TextView) findViewById(R.id.textView1);   
        	
        	 final Bundle bundle = this.getIntent().getExtras();    
        	idcodice.setText("BUONGIORNO          "+bundle.getString("name"));
        	
		entra.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent form_intent = new Intent(getApplicationContext(), Entra.class);
				form_intent.putExtras(bundle);
				startActivity(form_intent);
				finish();
				/*
				Intent form_intent = new Intent("com.example.helloworld.Entra");
				
				startActivity(form_intent);*/
				
			}
		});
		
esci.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 
				Intent form_intent = new Intent(getApplicationContext(), Esci.class);
				form_intent.putExtras(bundle);
				startActivity(form_intent);
				finish();
				/*Intent form_intent = new Intent("com.example.helloworld.Esci");
				
				startActivity(form_intent);*/
				
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
