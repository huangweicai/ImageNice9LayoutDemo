package com.example.nice9layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DragListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ListAdapter mListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mListAdapter = new ListAdapter(this, getData());
        mRecyclerView.setAdapter(mListAdapter);
    }

    private List<DemoEntity> getData() {
        List<DemoEntity> demoEntities = new ArrayList<>();
        for (int i = images.length; i > 0; i--) {//9
            List<String> picStrings = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                picStrings.add(images[j]);
            }
            demoEntities.add(new DemoEntity(picStrings));
        }
        return demoEntities;
    }

    private String[] images = new String[]{
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024420832&di=5aa012750e828d3ef0c3f789a36e2347&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2015%2F204%2F30%2F5ED1I1R45I1R.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024420832&di=7a5226ba75156eb2d270e7b79bdb3707&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2015%2F204%2F26%2F71H003OBEC6I.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024420831&di=78e6711286a797838ba659d3ffb71b50&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2015%2F204%2F25%2FWC9015475YJ9.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421112&di=ca179c35d92159b0f3d692f334b1021d&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160101.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421112&di=3522c0c7f522369c0840012bc3886fa4&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160102-50.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421111&di=83f6400e4644b91db81047e4b67be8d4&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160120-50.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421111&di=216984c5a5163891965c499cb020322a&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160126-50.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421110&di=0cd844d61e951abe5249aa9c660d37c5&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160135.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498024421108&di=86bf19c2d8d47beaf5cad6797c4da4eb&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F140506%2F1-140506160300.jpg",
    };

}
