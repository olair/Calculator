package com.olair.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.olair.calculator.base.BaseActivity;
import com.olair.calculator.panel.PanelFragment;
import com.olair.calculator.util.ActivityUtils;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar = findViewById(R.id.act_main_toolbar);
        setSupportActionBar(toolbar);

        PanelFragment panelFragment =
                (PanelFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (panelFragment == null) {
            // Create the fragment
            panelFragment = PanelFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), panelFragment, R.id.contentFrame);
        }
    }


}
