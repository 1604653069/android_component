package com.hong.module_user.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hong.module_user.FragmentUser;

import me.goldze.mvvmhabit.base.ContainerActivity;

public class DebugUserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", FragmentUser.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
