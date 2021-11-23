package com.example.bottom_navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * This Fragment represents a certain part of the UI or the behaviour in the MainActivity.
 * It shows the user a simple text to tell them which Fragment is currently displayed.
 *
 * Layout File: fragment_add.xml
 */
public class AddFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add, container, false);

        return view;
    }
}
