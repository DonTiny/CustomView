package com.example.administrator.radarmapdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadarMapView radarMapView;
    private RadarMapData radarMapData;
    private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radarMapData=new RadarMapData();
        setView();
        initData();
        start.setOnClickListener(this);

    }

    private void initData() {
        radarMapData.setCount(6);
        radarMapData.setMainPaintColor(Color.BLUE);
        radarMapData.setTitles(new String[]{"进攻","团战", "资源" , "防守","辅助" , "生存"});
        radarMapData.setValuse(new Double[]{25.0,67.8,55.4,89.0,36.9,70.0});
        radarMapData.setTextSize(30);
        radarMapView.setData(radarMapData);
    }

    private void setView() {
        radarMapView=findViewById(R.id.radar_map);
        start=findViewById(R.id.btn_start);
    }

    @Override
    public void onClick(View view) {
        radarMapView.start();
    }
}
