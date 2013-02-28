package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	
	@Override
	protected void onCreate(Bundle TravisLoveBacon) {
		// TODO Auto-generated method stub
		super.onCreate(TravisLoveBacon);
		setContentView(R.layout.splash);
	
		Thread timer = new Thread(){
			public void run()
			{
				try
				{
					sleep(10000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent startPage = new Intent("com.example.helloworld.MainActivity");
					startActivity(startPage);
				}
			}
		};
		timer.start();
	}

	
	

}
