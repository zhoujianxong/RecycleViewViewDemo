package com.example.recycleviewdemo.adapter.provider;

import com.bumptech.glide.Glide;
import com.example.recycleviewdemo.R;
import com.example.recycleviewdemo.adapter.MainAdapter;
import com.example.recycleviewdemo.base.multiple.VMBaseItemProvider;
import com.example.recycleviewdemo.bean.NewsBean;
import com.example.recycleviewdemo.databinding.ItemNewsBinding;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class NewsProvider extends VMBaseItemProvider<NewsBean, ItemNewsBinding> {
    @Override
    public void bindingConvert(ItemNewsBinding binding, NewsBean data, int position) {
        Glide.with(mContext).load(data.getUrl()).into(binding.mImage);
        binding.mContent.setText(data.getContent());
        binding.mTitle.setText(data.getTitle());
    }

    @Override
    public int viewType() {
        return MainAdapter.TYPE_NEWS;
    }

    @Override
    public int layout() {
        return R.layout.item_news;
    }
}
