package edu.washington.yarn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreadListAdapter extends BaseAdapter {

	private ArrayList<ThreadList> listData;

	private LayoutInflater layoutInflater;

	public ThreadListAdapter(Context context, ArrayList<ThreadList> listData) {
		this.listData = listData;
		layoutInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.list_row_layout, null);
			holder = new ViewHolder();
			holder.threadTitleView = (TextView) convertView.findViewById(R.id.thread_title);
			holder.threadSubjectView = (TextView) convertView.findViewById(R.id.thread_subject);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.threadTitleView.setText(listData.get(position).getThreadTitle());
		holder.threadSubjectView.setText(listData.get(position).getThreadSubject());

		return convertView;
	}

	static class ViewHolder {
		TextView threadTitleView;
		TextView threadSubjectView;
	}

}
