package com.codesara.learnfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG ="Learn_Fragment";
    @BindView(R.id.btnAdd)
    Button btnAdd;
    @BindView(R.id.btnDelete)
    Button btnDelete;
    @BindView(R.id.btnNew)
    Button btnNew;
    private FragmentSample fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // FragmentManager fragmentManager = getSupportFragmentManager();
       // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();



       // fragmentTransaction.add(R.id.fragSample,fragment);

       // fragmentTransaction.commit();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnAdd)
    public void onClick(View view) {
        Log.d(MainActivity.LOG_TAG,"onClick Add");
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragment = new FragmentSample();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragSample,fragment);

        fragmentTransaction.commit();

    }

    @OnClick(R.id.btnDelete)
    public void onClickDelete(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Log.d(MainActivity.LOG_TAG,"onClick Delete");
        fragmentTransaction.detach(fragment);
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btnNew)
    public void onClickNew(View view) {
        Intent intent = new Intent(this, DemoProgressbar.class);
        startActivity(intent);
    }
}
