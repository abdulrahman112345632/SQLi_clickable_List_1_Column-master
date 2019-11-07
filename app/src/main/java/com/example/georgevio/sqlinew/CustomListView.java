package com.example.georgevio.sqlinew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends ArrayAdapter<Worker> {
    private LayoutInflater mInflater;
    private ArrayList<Worker> workers;
    private int mViewResourceId;

    public CustomListView(Context context, int textViewResourceId, ArrayList<Worker> workers) {
        super(context, textViewResourceId, workers);
        this.workers = workers;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        Worker worker = workers.get(position);

        if (worker != null) {
            TextView Name = (TextView) convertView.findViewById(R.id.FirstText);
            TextView phone = (TextView) convertView.findViewById(R.id.SecondText);
            TextView emile = (TextView) convertView.findViewById(R.id.ThirdText);
            TextView place = (TextView) convertView.findViewById(R.id.FouthText);

            if (Name != null) {
                Name.setText(worker.getWorkerName());
            }
            if (phone != null) {
                phone.setText((worker.getWorkerPhone()));
            }

            if (emile != null) {
                emile.setText((worker.getWorkerEmail()));
            }
            if (place != null) {
                place.setText((worker.getWorekerPlace()));
            }
        }

        return convertView;
    }
}