package com.example.recycleviewdemo.base.multiple;

import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;

import java.util.List;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public abstract class VMBaseMultipleItemRvAdapter extends MultipleItemRvAdapter<BaseMultipleBean, BaseViewHolder>  {

    public VMBaseMultipleItemRvAdapter(@Nullable List<BaseMultipleBean> data) {
        super(data);
        init();
        finishInitialize();
    }

    /**
     * 如果构造函数具有其他参数，则需要在调用finishInitialize（）之前将其分配并分配给全局变量
     * 此getViewType（）和registerItemProvider（）方法可以获取传递过来的值
     * 可能由于getViewType（）到一些业务逻辑，您需要传递一个值来判断，返回相应的viewType
     * RegisterItemProvider（）可以将值传递给ItemProvider
     */
    public abstract void init();
}
