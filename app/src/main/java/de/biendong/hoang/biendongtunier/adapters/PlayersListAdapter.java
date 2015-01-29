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
import de.biendong.hoang.biendongtunier.models.PlayerModel;

/**
 * Created by hoang on 25.11.14.
 */
public class PlayersListAdapter extends ArrayAdapter {

    private Context context;
    private int layout;
    private List<PlayerModel> playersList;

    public PlayersListAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.playersList = objects;
    }

    private class ViewHolder {
        TextView nameTextView;
        ImageView imgView;
        TextView numberTextView;

        public ViewHolder(View base) {
            nameTextView = (TextView) base.findViewById(R.id.playerNameTextView);
            imgView = (ImageView) base.findViewById(R.id.playerImgView);
            numberTextView = (TextView) base.findViewById(R.id.playerNumberTextView);
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
        holder.nameTextView.setText(playersList.get(position).getName());
        aq = new AQuery(holder.imgView);
        aq.progress(R.id.progress).image(playersList.get(position).getImgUrl(), true, true, 200, 0, null, AQuery.FADE_IN, 9.0f / 16.0f);
        holder.numberTextView.setText(Integer.toString(playersList.get(position).getNumber()));
        return convertView;
    }
}
