package com.example.usuario.menu.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usuario.menu.R;
import com.example.usuario.menu.data.Items;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 25/05/2015.
 */
public class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Items> itemses = new ArrayList<>();

    public MyAdapter(ArrayList<Items> itemsArrayList){
        if(!itemses.isEmpty())
            itemses.clear();
        this.itemses=itemsArrayList;
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        public ImageView image;
        public TextView name;


        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.imagenItem1);
            name = (TextView) itemView.findViewById(R.id.txtnameItem1);



        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }




    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
       Items items = itemses.get(i);
       viewHolder.name.setText(items.getName());
    //    int imagen = viewHolder.image.getResources().getIdentifier(items.getUrlImagen(), null, viewHolder.itemView.getContext().getPackageName());
     //   Drawable img = viewHolder.image.getResources().getDrawable(imagen);
     //   viewHolder.image.setImageDrawable(img);

        Picasso.with(viewHolder.image.getContext()).load(items.getUrlImagen()).into(viewHolder.image);

            }

    @Override
    public int getItemCount() {
        return itemses.size();
    }
}
