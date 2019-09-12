package com.stanlo.researchgo;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stanlo.researchgo.R;

class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle, Integer[] imgid) {
        super(context, R.layout.selection_cardview, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;

        this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.selection_cardview, null,true);

        TextView titleText = rowView.findViewById(R.id.textView);
        ImageView imageView = rowView.findViewById(R.id.imageView);


        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);


        return rowView;

    }
}
