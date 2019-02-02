package com.example.min.myappagain;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Frag1Fragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    private Response response;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View frag1Layout = inflater.inflate(R.layout.frag1, container,false);
        mRecyclerView = frag1Layout.findViewById(R.id.frag1_recylerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false));
        initData();
        return frag1Layout;
    }

    private void initData(){
        Gson gson = new Gson();
        response = gson.fromJson(readDataFromFile(), Response.class);

        myAdapter = new MyAdapter(response.getResponse(),this);
        mRecyclerView.setAdapter(myAdapter);
    }

    private String readDataFromFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(
                    this.getActivity().getAssets().open("res_json.txt")));
            StringBuilder stringBuilder = new StringBuilder();
            String content;
            while((content = bufferedReader.readLine()) != null){
                stringBuilder.append(content);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
