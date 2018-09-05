package com.boston.ui_input_controls;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CourseAdapter extends ArrayAdapter<String> {

    private Context context;
    private int itemLayoutResource;
    private ArrayList<String> course = new ArrayList<>();

    public CourseAdapter(@NonNull Context context, int resource, @NonNull List<String> course) {
        super(context, resource, course);

        this.context = context;
        this.itemLayoutResource = resource;
        this.course.addAll(course);
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return this.course.get(position);
    }

    @Override
    public int getCount() {
        return this.course.size();
    }

    @Override
    public int getPosition(@Nullable String item) {
        return this.course.indexOf(item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String course = getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View courseItemLayout = inflater.inflate(itemLayoutResource, parent, false);


        TextView courseTextView = courseItemLayout.findViewById(R.id.name_textView);
        courseTextView.setText(course);

        return courseItemLayout;
    }
}