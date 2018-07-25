package com.denieall.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment {

    TextView top_tv, bottom_tv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);

        top_tv = view.findViewById(R.id.top_tv);
        bottom_tv = view.findViewById(R.id.bottom_tv);

        return view;
    }

    public void setText(String top, String bottom) {

        top_tv.setText(top);
        bottom_tv.setText(bottom);

    }
}

