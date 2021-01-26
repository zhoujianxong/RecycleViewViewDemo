package com.example.recycleviewdemo.adapter.provider;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.recycleviewdemo.R;
import com.example.recycleviewdemo.adapter.MainAdapter;
import com.example.recycleviewdemo.base.multiple.VMBaseItemProvider;
import com.example.recycleviewdemo.bean.AlbumBean;
import com.example.recycleviewdemo.databinding.ItemAlbumBinding;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class AlbumProvider extends VMBaseItemProvider<AlbumBean, ItemAlbumBinding> {

    public AlbumProvider(Context context) {
        mContext = context;
    }

    @Override
    public void bindingConvert(ItemAlbumBinding itemAlbumBinding, AlbumBean data, int position) {
        itemAlbumBinding.mLinearLayout.removeAllViews();
        for (int i = 0; i < data.getUrls().size(); i++) {
            ImageView imageView=new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
            imageView.setPadding(10,10,10,10);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Glide.with(mContext).load(data.getUrls().get(i)).into(imageView);
            itemAlbumBinding.mLinearLayout.addView(imageView);
        }
    }

    @Override
    public int viewType() {
        return MainAdapter.TYPE_ALBUM;
    }

    @Override
    public int layout() {
        return R.layout.item_album;
    }
}
