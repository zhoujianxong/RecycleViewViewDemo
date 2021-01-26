package com.example.recycleviewdemo.adapter;

import android.app.Activity;

import androidx.annotation.Nullable;
import com.example.recycleviewdemo.adapter.provider.AlbumProvider;
import com.example.recycleviewdemo.adapter.provider.NewsProvider;
import com.example.recycleviewdemo.adapter.provider.UserProvider;
import com.example.recycleviewdemo.base.multiple.BaseMultipleBean;
import com.example.recycleviewdemo.base.multiple.VMBaseMultipleItemRvAdapter;
import com.example.recycleviewdemo.bean.AlbumBean;
import com.example.recycleviewdemo.bean.NewsBean;
import com.example.recycleviewdemo.bean.UserBean;
import java.util.List;

/**
 * @author ChayChan
 * @description: 消息列表的adapter
 * @date 2018/3/21  14:40
 */

public class MainAdapter extends VMBaseMultipleItemRvAdapter {
    public static final int TYPE_NEWS = 0;
    public static final int TYPE_ALBUM = 1;
    public static final int TYPE_USER = 2;


    @Override
    public void init() {
        //初始化一些变量   getViewType  registerItemProvider  都能用
    }

    public MainAdapter(@Nullable List<BaseMultipleBean> data) {
        super(data);
    }

    @Override
    protected int getViewType(BaseMultipleBean message) {
        //返回对应的viewType
        if (message instanceof NewsBean) {
            return TYPE_NEWS;
        } else if (message instanceof AlbumBean) {
            return TYPE_ALBUM;
        } else if (message instanceof UserBean) {
            return TYPE_USER;
        }
        return TYPE_NEWS;
    }


    @Override
    public void registerItemProvider() {
        //注册相关的条目provider
        mProviderDelegate.registerProvider(new AlbumProvider(mContext));
        mProviderDelegate.registerProvider(new NewsProvider());
        mProviderDelegate.registerProvider(new UserProvider());
    }

}
