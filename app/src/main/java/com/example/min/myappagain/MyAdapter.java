package com.example.min.myappagain;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.min.myappagain.Response.ResponseBean;

import java.util.List;

/**
 * RecyclerView适配器
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Frag1Fragment context;
    private List<ResponseBean> mDataList;

    public MyAdapter(List<ResponseBean> list, Frag1Fragment context) {
        this.mDataList = list;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        // 返回数据集合大小
        return mDataList == null ? 0 : mDataList.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //获取这个TextView

        TextView tv = holder.mTvTitle;
        ImageView mIv1 = holder.mIvImage1;
        ImageView mIv2 = holder.mIvImage2;
        ImageView mIv3 = holder.mIvImage3;

        tv.setText(mDataList.get(position).getTitle());
        Glide.with(context).load(mDataList.get(position).getImages_url().get(0)).into(mIv1);
        Glide.with(context).load(mDataList.get(position).getImages_url().get(1)).into(mIv2);
        Glide.with(context).load(mDataList.get(position).getImages_url().get(2)).into(mIv3);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTvTitle;
        private ImageView mIvImage1;
        private ImageView mIvImage2;
        private ImageView mIvImage3;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvTitle = itemView.findViewById(R.id.item_tv);
            mIvImage1 = itemView.findViewById(R.id.imageView1);
            mIvImage2 = itemView.findViewById(R.id.imageView2);
            mIvImage3 = itemView.findViewById(R.id.imageView3);
        }


    }


}
