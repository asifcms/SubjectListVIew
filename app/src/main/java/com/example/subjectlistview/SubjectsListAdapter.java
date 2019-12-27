package com.example.subjectlistview;

import android.content.Context;
import android.service.autofill.TextValueSanitizer;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class SubjectsListAdapter extends ArrayAdapter<Subjects>

{
      private  static final String TAG ="SubjectsListAdapter";
      private Context mContext;
      int mResource;
    private TextView tvsub1,tvsub2;

    public SubjectsListAdapter(Context context, int resource, ArrayList<Subjects> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        String Subjects = getItem(position).getSubjects();
        String Division = getItem(position).getDivision();
        Subjects subjects = new Subjects(Subjects,Division);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);
        TextView tvsub1 = (TextView) convertView.findViewById(R.id.tvsub1);
        TextView tvsource1 = (TextView) convertView.findViewById(R.id.tvsource1);
        tvsub1.setText(Subjects);
        tvsource1.setText(Division);
        return convertView;

    }
}
