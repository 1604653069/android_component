package com.hong.module_work.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hong.module_work.FragmentWork;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugWorkMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", FragmentWork.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
