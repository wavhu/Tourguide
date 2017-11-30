package com.example.codetribe.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by code tribe on 2017/08/17.
 */
public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {



    Context context;

    List<Tour> tourList;

    public ContentAdapter(Context context, List<Tour> tourList) {
        this.context = context;
        this.tourList = tourList;
    }
    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_layout,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContentAdapter.ViewHolder holder, int position) {
        final Tour tour=tourList.get(position);
        holder.tvName.setText(tour.getName());
        holder.tvDesc.setText(tour.getDescription());
        holder.image.setImageResource(tour.getImage());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Main3Activity.class);
                intent.putExtra("name",tour);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView card;
        TextView tvName,tvDesc;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName= (TextView) itemView.findViewById(R.id.txt1);
            tvDesc= (TextView) itemView.findViewById(R.id.textView);
            card= (CardView)itemView.findViewById(R.id.card);
            image= (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
