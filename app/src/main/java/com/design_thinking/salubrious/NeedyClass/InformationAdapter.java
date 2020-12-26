package com.design_thinking.salubrious.NeedyClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.design_thinking.salubrious.R;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {
    Context context;
    ArrayList<Information> ItemList;

    public InformationAdapter( Context context, ArrayList<Information> ItemList) {
        super(context, 0,ItemList);
        this.context = context;
        this.ItemList = ItemList;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View view = convertView;
        if(view == null){//if view null then create new view
            view= LayoutInflater.from(context).inflate(R.layout.listview_shape,parent,false);//for creating view
        }

        Information item = ItemList.get(position);

        //finding listview shape component
        TextView subject = view.findViewById(R.id.subjectListViewShapeId);
        TextView date = view.findViewById(R.id.dateListViewShapeId);
        //return super.getView(position, convertView, parent);


        //setting listview shape component to arrryList
        subject.setText(item.getSubject());
        date.setText(item.getDateTime());

        return view;
    }
}
