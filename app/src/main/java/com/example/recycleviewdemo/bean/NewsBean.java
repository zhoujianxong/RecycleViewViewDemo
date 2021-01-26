package com.example.recycleviewdemo.bean;

import com.example.recycleviewdemo.base.multiple.BaseMultipleBean;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class NewsBean extends BaseMultipleBean {

    public NewsBean(String title, String content, String url) {
        this.title = title;
        this.content = content;
        this.url = url;
    }

    private String title;
    private String content;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
