package com.example.all_inone_app;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NewsFragment extends Fragment {
	ListView list;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.newslayout, container, false);

	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		list =(ListView) getActivity().findViewById(R.id.list);
		ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.news_section, android.R.layout.simple_list_item_1); 
		list.setAdapter(adapter);
	}
}
