package com.sabin.secondassignment.ui.AreaOfCircle;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

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

        if(TextUtils.isEmpty(etradius.getText())){
            etradius.setError("Please enter Radius");
            etradius.requestFocus();
            return;
        }

        float radius = Float.parseFloat(etradius.getText().toString());

        float result = (22*radius*radius)/7;

        Toast.makeText(getActivity(),"Area of Circle is " + result, Toast.LENGTH_SHORT).show();


    }
}