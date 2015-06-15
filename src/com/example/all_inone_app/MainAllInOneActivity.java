package com.example.all_inone_app;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainAllInOneActivity extends ActionBarActivity {
	
	
	NewsFragment nef = new NewsFragment();
	WeatherFragment wft = new WeatherFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_all_in_one);
		 
		android.app.FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.main_layout, nef,"News Section");
		transaction.add(R.id.main_layout, wft,"Weather Sectiion");
		transaction.commit();
		//Toast.makeText(this, "the list view is created", Toast.LENGTH_LONG);
	}
	

	
}
