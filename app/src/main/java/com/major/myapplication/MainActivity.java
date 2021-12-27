package com.major.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.baidu.tts.auth.AuthInfo;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "tag_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        {"a":"MIX","b":{"a":"221","c":10},"c":{"a":911,"b":"/storage/emulated/0/res/tts.dat","c":"110"},"leftValidDays":3,"mixSuccess":false,"notifyMessage":"ok","offlineResult":{"$ref":"$.c"},"offlineSuccess":true,"onlineResult":{"$ref":"$.b"},"onlineSuccess":true,"success":true,"ttsEnum":"MIX"}
         */
        String infoStr = "{\"a\":\"MIX\",\"b\":{\"a\":\"221\",\"c\":10},\"c\":{\"a\":911,\"b\":\"/storage/emulated/0/res/tts.dat\",\"c\":\"110\"},\"leftValidDays\":3,\"mixSuccess\":false,\"notifyMessage\":\"ok\",\"offlineResult\":{\"$ref\":\"$.c\"},\"offlineSuccess\":true,\"onlineResult\":{\"$ref\":\"$.b\"},\"onlineSuccess\":true,\"success\":true,\"ttsEnum\":\"MIX\"}";
        Log.i(TAG,"  source " + infoStr);
        // 模拟对象
        AuthInfo info = JSON.parseObject(infoStr, AuthInfo.class);

        Log.i(TAG, "fastjson " + JSON.toJSONString(info));
        String s = new Gson().toJson(info);
        Log.i(TAG, "    gson " + s);
    }
}