package com.example.recycleviewdemo.adapter.provider;

import com.bumptech.glide.Glide;
import com.example.recycleviewdemo.R;
import com.example.recycleviewdemo.adapter.MainAdapter;
import com.example.recycleviewdemo.base.multiple.VMBaseItemProvider;
import com.example.recycleviewdemo.bean.UserBean;
import com.example.recycleviewdemo.databinding.ItemUserBinding;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class UserProvider extends VMBaseItemProvider<UserBean, ItemUserBinding> {
    @Override
    public void bindingConvert(ItemUserBinding itemUserBinding, UserBean data, int position) {

        Glide.with(mContext).load(data.getAvatar()).into(itemUserBinding.mAvatar);
        itemUserBinding.mName.setText(data.getName());
        itemUserBinding.mContent.setText(data.getContent());
    }

    @Override
    public int viewType() {
        return MainAdapter.TYPE_USER;
    }

    @Override
    public int layout() {
        return R.layout.item_user;
    }
}
