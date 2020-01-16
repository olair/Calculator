package com.olair.calculator.panel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.olair.calculator.R;

/**
 * Create by oLair on 2020/1/11.
 */
public class PanelFragment extends Fragment {

    public static PanelFragment newInstance() {
        PanelFragment fragment = new PanelFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panel, container, false);
        return view;
    }

}
