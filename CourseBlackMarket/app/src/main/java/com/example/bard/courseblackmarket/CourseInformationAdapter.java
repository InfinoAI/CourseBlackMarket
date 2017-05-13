package com.example.bard.courseblackmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CourseInformationAdapter extends ArrayAdapter<CourseInformation>
{
    private int resourceID;
    public CourseInformationAdapter(Context context, int textViewResourceId, List<CourseInformation>
            objects)
    {
        super(context, textViewResourceId, objects);
        resourceID = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        CourseInformation courseInfo = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(courseInfo.getName());
        TextView time = (TextView) view.findViewById(R.id.time);
        time.setText(courseInfo.getTime());
        TextView teacher = (TextView) view.findViewById(R.id.teacher);
        teacher.setText(courseInfo.getTeacher());
        TextView credit = (TextView) view.findViewById(R.id.credit);
        credit.setText(courseInfo.getCredit() + "");
        //ImageView image = (ImageView) view.findViewById(R.id.plus);
        //image.setImageResource(R.drawable.plus);
        return view;
    }
}
