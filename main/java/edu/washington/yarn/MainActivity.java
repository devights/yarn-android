package edu.washington.yarn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<Thread> image_details = getListData();
		final ListView lv1 = (ListView) findViewById(R.id.custom_list);
		lv1.setAdapter(new ThreadListAdapter(this, image_details));
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				Object o = lv1.getItemAtPosition(position);
				Thread newsData = (Thread) o;
				Toast.makeText(MainActivity.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
			}

		});

	}

	private ArrayList<Thread> getListData() {
		ArrayList<Thread> results = new ArrayList<Thread>();



		Thread newsData = new Thread();
		newsData.setThreadTitle("Conversations");
		newsData.setThreadSubject("Stuff and things");
		newsData.setID(1);
		results.add(newsData);

		newsData = new Thread();
		newsData.setThreadTitle("Critical things");
		newsData.setThreadSubject("Important conversations about things that don't matter");
		newsData.setID(2);
		results.add(newsData);

		newsData = new Thread();
		newsData.setThreadTitle("My test thread ");
		newsData.setThreadSubject("");
		newsData.setID(3);
		results.add(newsData);

		newsData = new Thread();
		newsData.setThreadTitle("Emergency Thread");
		newsData.setThreadSubject("This is just a test of the emergency broadcasting system");
		newsData.setID(4);
		results.add(newsData);
		return results;
	}
}
