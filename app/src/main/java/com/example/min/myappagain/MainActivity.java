package com.example.min.myappagain;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Frag1Fragment frag1Fragment;
    private Frag2Fragment frag2Fragment;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        fragmentManager = getFragmentManager();
        setTabSelection(0);
    }



    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:
                setTabSelection(0);
                break;
            case R.id.button2:
                setTabSelection(1);
                break;
            default:
                break;
        }
    }

    private void setTabSelection(int index){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(frag1Fragment != null){
            transaction.hide(frag1Fragment);
        }
        if(frag2Fragment != null){
            transaction.hide(frag2Fragment);
        }
        switch (index){
            case 0:
                if(frag1Fragment == null){
                    frag1Fragment = new Frag1Fragment();
                    transaction.add(R.id.content, frag1Fragment);
                }
                else{
                    transaction.show(frag1Fragment);
                }
                break;
            case 1:
                if(frag2Fragment == null){
                    frag2Fragment = new Frag2Fragment();
                    transaction.add(R.id.content, frag2Fragment);
                }
                else{
                    transaction.show(frag2Fragment);
                }
                break;
            default:
                break;
        }
        transaction.commit();
    }


}
