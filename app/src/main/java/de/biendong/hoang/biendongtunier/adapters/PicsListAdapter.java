package de.biendong.hoang.biendongtunier.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.List;

import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.models.PicModel;

/**
 * Created by hoang on 25.11.14.
 */
public class PicsListAdapter extends ArrayAdapter<PicModel>{

    private Context context;
    private int layout;
    private List<PicModel> picsList;

    public PicsListAdapter(Context context, int resource, List<PicModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.picsList = objects;
    }

    private class ViewHolder{
        TextView titleTextView;
        TextView dateTextView;
        ImageView imgView;
        TextView desTextView;

        public ViewHolder(View base){
            titleTextView = (TextView) base.findViewById(R.id.picsTitleTextView);
            dateTextView = (TextView) base.findViewById(R.id.picsDateTextView);
            imgView = (ImageView)base.findViewById(R.id.picsImgView);
            desTextView = (TextView) base.findViewById(R.id.picsDesTextView);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        AQuery aq;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.titleTextView.setText(picsList.get(position).getTitle());
        holder.dateTextView.setText(picsList.get(position).getDate());
        aq = new AQuery(holder.imgView);
        aq.progress(R.id.progress).image(picsList.get(position).getImgUrl(), true, true, 200, 0, null, AQuery.FADE_IN, 9.0f / 16.0f);
        holder.desTextView.setText(picsList.get(position).getDescription());
        return convertView;
    }
}
