package com.example.hw06_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        TabHost.TabSpec tabSpecdog=tabHost.newTabSpec("dog").setIndicator("강아지");
        tabSpecdog.setContent(R.id.강아지);
        tabHost.addTab(tabSpecdog);
        TabHost.TabSpec tabSpeccat=tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpeccat.setContent(R.id.고양이);
        tabHost.addTab(tabSpeccat);
        TabHost.TabSpec tabSpecrab=tabHost.newTabSpec("rab").setIndicator("토끼");
        tabSpecrab.setContent(R.id.토끼);
        tabHost.addTab(tabSpecrab);
        TabHost.TabSpec tabSpeclion=tabHost.newTabSpec("lion").setIndicator("사자");
        tabSpeclion.setContent(R.id.말);
        tabHost.addTab(tabSpeclion);
        tabHost.setCurrentTab(0);
    }
}