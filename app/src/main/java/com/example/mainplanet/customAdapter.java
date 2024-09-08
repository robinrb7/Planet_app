package com.example.mainplanet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArraylist;
    Context context;

    public customAdapter( ArrayList<Planet> arraylist, Context context) {
        super(context,R.layout.item_list_view );
        this.planetArraylist = arraylist;
        this.context = context;
    }
    private static class myViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet  = getItem(position);
         myViewHolder holder;
         final View result;
         if(convertView==null){
             holder = new myViewHolder();
             LayoutInflater inflater = LayoutInflater.from(getContext());
             convertView = inflater.inflate(
                     R.layout.item_list_view,
                     parent,
                     false
             );
             holder.planetName=(TextView) convertView.findViewById(R.id.textView);
             holder.moonCount=(TextView) convertView.findViewById(R.id.textView2);
             holder.planetImage=(ImageView) convertView.findViewById(R.id.imageView);
             result=convertView;

             convertView.setTag(holder);
         }
         else{
             holder = (myViewHolder) convertView.getTag();
             result = convertView;
         }
         holder.planetName.setText(planet.getPlanetName());
         holder.moonCount.setText(planet.getMoonCount());
         holder.planetImage.setImageResource(planet.getPlanetImage());

         return result;
    }
}
