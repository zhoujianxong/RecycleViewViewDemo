package com.example.recycleviewdemo.base.multiple;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public abstract class VMBaseItemProvider<T,VDB extends ViewDataBinding> extends BaseItemProvider<T, BaseViewHolder> {

    @Override
    public void convert(BaseViewHolder helper, T data, int position) {
        bindingConvert(DataBindingUtil.bind(helper.itemView),data,helper.getAbsoluteAdapterPosition());
    }

    /**
     * 带绑定 DataBinding 转换
     * @param vdb
     * @param data
     * @param position
     */
    public abstract void bindingConvert(VDB vdb, T data, int position);
}
