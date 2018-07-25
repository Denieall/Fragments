package com.denieall.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private EditText topText, bottomText;

    // To make sure MainActivity have createQuote Method
    public interface TopSectionListener {
        public void createQuote(String top, String bottom);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        final Button button = view.findViewById(R.id.button);
        topText = view.findViewById(R.id.top_text_input);
        bottomText = view.findViewById(R.id.bottom_text_input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });

        return view;
    }

    public void buttonClicked(View view) {
        MainActivity ma = (MainActivity)  getActivity();
        ma.createQuote(topText.getText().toString(), bottomText.getText().toString());
    }
}
