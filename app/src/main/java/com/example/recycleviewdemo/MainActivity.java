package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import com.example.recycleviewdemo.adapter.MainAdapter;
import com.example.recycleviewdemo.base.multiple.BaseMultipleBean;
import com.example.recycleviewdemo.bean.AlbumBean;
import com.example.recycleviewdemo.bean.NewsBean;
import com.example.recycleviewdemo.bean.UserBean;
import com.example.recycleviewdemo.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private List<BaseMultipleBean> mMessages = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.mRecyclerView.setHasFixedSize(true);
        binding.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainAdapter(mMessages);
        binding.mRecyclerView.setAdapter(adapter);
        add();

        binding.mButton.setOnClickListener(view -> {
            for (int i = 0; i < 100; i++) {
                add();
            }
        });
    }

    private void add(){
        String imgUrl1 = "https://t7.baidu.com/it/u=825057118,3516313570&fm=193&f=GIF";
        String imgUrl2 = "https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1521617426&di=d6537bb0ef71984e4a1d14e4b18ba169&src=http://img1d.xgo-img.com.cn/pics/789/788784.jpg";
        String imgUrl3 = "https://t7.baidu.com/it/u=3124693600,356058981&fm=193&f=GIF";
        String imgUrl4 = "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3304438517,4002119472&fm=11&gp=0.jpg";

        String content1="新冠病毒新增";
        String content2="截至1月26日16时，全国累计报告确诊病例100292例，现有确诊病例2887例，境外输入4624例；海外现有确诊病例27449177";
        String content3="春娇志明";
        String content4="《志明与春娇》是一部导演彭浩翔执导的香港爱情电影，由彭浩翔、麦曦茵编剧，杨千嬅、余文乐主演，于2010年3月25日上映。影片讲述了香港禁烟的环境下，两个吸烟男女张志明（余文乐饰）与余春娇（杨千嬅饰）在后巷展开的爱情故事。";
        String content5="吉林通化“道歉”后，物资配送仍未解决，求助热线无人接听";

        mMessages.add(new NewsBean(content1,content2,imgUrl4));
        mMessages.add(new NewsBean(content5,content4,imgUrl2));
        List<String> images=new ArrayList<>();
        images.add(imgUrl1);
        images.add(imgUrl3);
        images.add(imgUrl2);
        mMessages.add(new AlbumBean(images));
        mMessages.add(new UserBean(content3,imgUrl2,content4));
        mMessages.add(new NewsBean(content5,content1,imgUrl2));
        mMessages.add(new NewsBean(content1,content2,imgUrl4));
        List<String> images2=new ArrayList<>();
        images.add(imgUrl3);
        images.add(imgUrl2);
        images.add(imgUrl1);
        images.add(imgUrl3);
        images.add(imgUrl2);
        images.add(imgUrl3);
        images.add(imgUrl2);
        mMessages.add(new AlbumBean(images2));
        mMessages.add(new NewsBean(content2,content5,imgUrl1));

        adapter.setNewData(mMessages);
    }
}