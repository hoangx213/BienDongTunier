package de.biendong.hoang.biendongtunier.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.models.NewsModel;

/**
 * Created by hoang on 25.11.14.
 */
public class NewsListAdapter extends ArrayAdapter<NewsModel>{

    private Context context;
    private int layout;
    private List<NewsModel> newsList;

    public NewsListAdapter(Context context, int resource, List<NewsModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.newsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.newsTextView);
        textView.setText(newsList.get(position).getNews());
        TextView dateTextView = (TextView) convertView.findViewById(R.id.newsDateTextView);
        dateTextView.setText(newsList.get(position).getDate());
        return convertView;
    }
}
