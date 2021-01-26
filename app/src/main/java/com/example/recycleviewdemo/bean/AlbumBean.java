package com.example.recycleviewdemo.bean;

import com.example.recycleviewdemo.base.multiple.BaseMultipleBean;

import java.util.List;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class AlbumBean extends BaseMultipleBean {
    public AlbumBean(List<String> urls) {
        this.urls = urls;
    }

    private List<String> urls;

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
