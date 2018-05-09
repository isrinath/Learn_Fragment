package com.codesara.learnfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class DemoProgressbar  extends AppCompatActivity {
    @BindView(R.id.tvProgressVal)
    TextView tvProgressVal;
    @BindView(R.id.btnTest)
    Button btnTest;
    @BindView(R.id.pbHorizontal)
    ProgressBar pbHorizontal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar_demo);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnTest)
    public void onClick(View view) {
        Log.d(MainActivity.LOG_TAG,"onClick btnTest");
        int stepVal = 20;

        int currStepVal = pbHorizontal.getProgress();
        Log.d(MainActivity.LOG_TAG,"currStepVal "+currStepVal);
        int nextStepVal = currStepVal+stepVal;
        if(nextStepVal<=100){
            pbHorizontal.setProgress(nextStepVal);
        }


    }

}
