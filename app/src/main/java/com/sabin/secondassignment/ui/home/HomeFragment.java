package com.sabin.secondassignment.ui.home;

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

public class HomeFragment extends Fragment implements View.OnClickListener {

    private EditText num;
    private Button btnPR;
    private TextView PR;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        num = view.findViewById(R.id.pnum);
        btnPR= view.findViewById(R.id.btnPR);
        PR = view.findViewById(R.id.PR);

        btnPR.setOnClickListener(this);
    return view;

        }

    @Override
    public void onClick(View v) {
        int pnumber,showresult;

        pnumber = Integer.parseInt(num.getText().toString());

        palindrome palinnumber = new palindrome();
        {

            showresult = palinnumber.back(pnumber);

            if(showresult == pnumber)
            {
                PR.setText(Integer.toString(pnumber) + " is a Palindrome Number");
            }

            else
            {
                PR.setText(Integer.toString(pnumber) + " is not a Palindrome Number");
            }

        }

    }
}

