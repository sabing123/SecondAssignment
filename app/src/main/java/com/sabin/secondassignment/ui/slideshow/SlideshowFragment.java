package com.sabin.secondassignment.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sabin.secondassignment.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener{

    private Button btnswap;
    private EditText number1,number2;

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_slideshow, container, false);

        number1 = view.findViewById(R.id.swap1);
        number2 = view.findViewById(R.id.swap2);
        btnswap = view.findViewById(R.id.btnswap);
        btnswap.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        int num1, num2;

        num1 = Integer.parseInt(number1.getText().toString());
        num2 = Integer.parseInt(number2.getText().toString());

        number1.setText(Integer.toString(num2) );
        number2.setText(Integer.toString(num1) );

    }
}