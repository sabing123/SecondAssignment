package com.sabin.secondassignment.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sabin.secondassignment.R;

public class GalleryFragment extends Fragment implements View.OnClickListener {


    private Button btnradius;
    private EditText etradius;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        etradius = view.findViewById(R.id.etradius);
        btnradius  = view.findViewById(R.id.btnradiuscalculate);

        btnradius.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {


        float radius = Float.parseFloat(etradius.getText().toString());

        float result = (22*radius*radius)/7;

        Toast.makeText(getActivity(),"Area of Circle is " + result, Toast.LENGTH_SHORT).show();


    }
}