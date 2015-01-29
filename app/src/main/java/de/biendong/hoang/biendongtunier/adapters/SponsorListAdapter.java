package de.biendong.hoang.biendongtunier.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.androidquery.AQuery;

import java.util.List;
import java.util.zip.Inflater;

import de.biendong.hoang.biendongtunier.R;
import de.biendong.hoang.biendongtunier.models.PlayerModel;
import de.biendong.hoang.biendongtunier.models.SponsorModel;

/**
 * Created by hoang on 25.11.14.
 */
public class SponsorListAdapter extends ArrayAdapter{

    private Context context;
    private int layout;
    private List<SponsorModel> sponsorsList;

    public SponsorListAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.sponsorsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
        }
        ImageView imgView = (ImageView) convertView.findViewById(R.id.sponsorImgView);
        AQuery aq = new AQuery(imgView);
        aq.progress(R.id.progress).image(sponsorsList.get(position).getImgUrl(), true, true, 200, 0, null, AQuery.FADE_IN, 9.0f / 16.0f);
        return convertView;
    }
}
