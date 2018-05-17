package dev413.listado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 26/04/2018.
 */

public class CardAdapt extends BaseAdapter
{
    public ArrayList<Card> data;
    public Context context;
    public ArrayList<String> images;

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i; //We can create another field in Card.java like a primary key.
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater link = LayoutInflater.from(context);

        View v = link.inflate(R.layout.card, null);

        TextView tvn = (TextView) v.findViewById(R.id.textName);
        tvn.setText(data.get(i).getNombre());

        tvn = (TextView) v.findViewById(R.id.textAge);
        tvn.setText(data.get(i).getEdad());

        tvn = (TextView) v.findViewById(R.id.textDescription);
        tvn.setText(data.get(i).getDescripcion());

        ImageView img = (ImageView) v.findViewById(R.id.imagePhoto);
        Picasso.with(context).load(images.get(i)).into(img);

        return v;
    }
}
