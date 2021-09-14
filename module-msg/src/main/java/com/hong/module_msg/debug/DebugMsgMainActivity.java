package com.hong.module_msg.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hong.module_msg.FragmentMsg;
import com.hong.module_msg.R;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugMsgMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", FragmentMsg.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
