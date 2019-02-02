package com.example.min.myappagain;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Frag2Fragment extends Fragment {
    private View frag2Layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        frag2Layout = inflater.inflate(R.layout.frag2, container, false);
        AsyncGetData asyncGetData = new AsyncGetData();
        asyncGetData.execute();
        return frag2Layout;
    }

    public class AsyncGetData extends AsyncTask<Void, Void ,String>{
        @Override
        protected String doInBackground(Void... voids) {
            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://192.168.1.5:8888/index1.html")
                    .get()
                    .build();
            Response response = null;
            try{
                response = okHttpClient.newCall(request).execute();
            }catch (IOException e) {
                e.printStackTrace();
            }
            if(response != null && response.isSuccessful()){
                assert response.body() != null;
                try {
                    return response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            //super.onPostExecute(s);
            TextView textView = frag2Layout.findViewById(R.id.textView);
            textView.setText(s);
        }
    }

}
