package com.example.l.learninglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Util.MylistviewAdapter;
import model.News;

public class MainActivity extends AppCompatActivity {
    private List<News> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.mylistview);
        init();
        MylistviewAdapter mylistviewAdapter=new MylistviewAdapter(this,data);
        listView.setAdapter(mylistviewAdapter);
    }
    public void init(){
        data=new ArrayList<News>();
        News news=new News(R.drawable.cloue,"新闻标题","新闻内容");
        for(int i=0;i<50;i++){
            data.add(news);
        }
    }
}
