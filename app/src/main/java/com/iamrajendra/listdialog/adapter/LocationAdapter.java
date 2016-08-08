package com.iamrajendra.listdialog.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iamrajendra.listdialog.R;
import com.iamrajendra.listdialog.models.Places;
import com.koushikdutta.ion.Ion;

import java.util.List;

/**
 * Created by rajendraverma on 06-08-2016.
 */
public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.PlaceHolder> {
    private Activity mActivity;
    private Context mContext;
    private List<Places> mlist_Places;

    public LocationAdapter(Activity mActivity, Context mContext, List<Places> mlist_Places) {
        this.mActivity = mActivity;
        this.mContext = mContext;
        this.mlist_Places = mlist_Places;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater  layoutInflater = mActivity.getLayoutInflater();


        return new PlaceHolder(layoutInflater.inflate(R.layout.location_adapter,null));
    }

    @Override
    public void onBindViewHolder(PlaceHolder holder, int position) {
      holder.textView_place.setText(mlist_Places.get(position).name);

        Ion.with(mContext)
                .load(mlist_Places.get(position).icon)
                .withBitmap()

                .intoImageView(holder.imageView_place);
    }

    @Override
    public int getItemCount() {
        return mlist_Places.size()
                ;
    }

    public class PlaceHolder extends RecyclerView.ViewHolder {
    private ImageView imageView_place;
        private TextView textView_place;
        public PlaceHolder(View itemView)
        {
            super(itemView);
            imageView_place = (ImageView) itemView.findViewById(R.id.location_pic_iv);
            textView_place = (TextView) itemView.findViewById(R.id.location_name_tv);
        }
    }



}
