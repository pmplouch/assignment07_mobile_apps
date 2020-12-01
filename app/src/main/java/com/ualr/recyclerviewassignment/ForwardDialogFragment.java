package com.ualr.recyclerviewassignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.textview.MaterialTextView;


public class ForwardDialogFragment extends Fragment
{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedViewModel model = ViewModelProvider(getActivity()).get(SharedViewModel.class);
        model.getSelected().observe(this, {item ->

            );
    }
}
