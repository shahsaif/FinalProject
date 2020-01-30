package com.example.finalproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.Models.PromotingModel;
import com.example.finalproject.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<PromotingModel> mData;

    public RecyclerViewAdapter(Context mContext, List<PromotingModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_promotion,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        PromotingModel model = mData.get(position);

        holder.fbName.setText(model.getName());
        holder.fbPrice.setText("$"+model.getPrice());

        holder.facebook_image.setImageResource(model.getPhoto());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView facebook_image;
        private TextView fbName;
        private TextView fbPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            facebook_image = (ImageView) itemView.findViewById(R.id.img_facebook);
            fbName = (TextView) itemView.findViewById(R.id.fb_icon_name);
            fbPrice = (TextView) itemView.findViewById(R.id.fb_price_textview);
        }
    }

}
