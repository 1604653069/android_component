package com.hong.module_home.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hong.module_home.FragmentHome;
import com.hong.module_home.R;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugHomeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", FragmentHome.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
