package com.example.recycleviewdemo.bean;

import com.example.recycleviewdemo.base.multiple.BaseMultipleBean;

/**
 * @Description:
 * @Author: zjx
 * @CreateDate: 2021/1/26 0026
 */
public class UserBean extends BaseMultipleBean {
    private String name;
    private String avatar;
    private String content;

    public UserBean(String name, String avatar, String content) {
        this.name = name;
        this.avatar = avatar;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
