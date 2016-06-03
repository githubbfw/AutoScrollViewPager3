package com.wangj.autoscrollviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.wangj.autoscrollviewpagers.AutoViewPagers;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> urlList = new ArrayList<>();
    private List<Integer> resList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoViewPagers mUrlSlider = (AutoViewPagers) findViewById(R.id.vp_url_slider);
        AutoViewPagers mResSlider = (AutoViewPagers) findViewById(R.id.vp_res_slider);

        resList.add(R.mipmap.timg);
        resList.add(R.mipmap.timg1);
        resList.add(R.mipmap.timg2);

        urlList.add("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1464970848&di=fc69c6414ed9d843e3e59ced34cb1c7e&src=http://img5.duitang.com/uploads/item/201304/20/20130420200244_R8x8L.jpeg");
        urlList.add("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1464970848&di=fc69c6414ed9d843e3e59ced34cb1c7e&src=http://img5.duitang.com/uploads/item/201304/20/20130420200244_R8x8L.jpeg");
        urlList.add("https://www.baidu.com/img/bd_logo1.png");
        urlList.add("http://images.17173.com/2015/news/2015/09/22/2015cpb0922gif02.gif");
        urlList.add("http://images.17173.com/2015/news/2015/09/22/2015cpb0922gif02.gif");

        mUrlSlider.setIndicatorColor(Color.BLUE,Color.YELLOW);//设置指示器颜色

        mUrlSlider.setIndicatorLocation(LinearLayout.TEXT_ALIGNMENT_CENTER,
                LinearLayout.TEXT_ALIGNMENT_CENTER);//设置指示器位置

        mResSlider.setIndicatorLocation(RelativeLayout.CENTER_HORIZONTAL,
                RelativeLayout.ALIGN_PARENT_BOTTOM);//设置指示器位置

        mUrlSlider.setViewUrls(urlList);

        mResSlider.setViewRes(resList);
    }
}
