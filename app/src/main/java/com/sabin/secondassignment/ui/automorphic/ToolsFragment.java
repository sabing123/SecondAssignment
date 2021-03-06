package com.sabin.secondassignment.ui.automorphic;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sabin.secondassignment.R;

public class ToolsFragment extends Fragment implements View.OnClickListener {

    private ToolsViewModel toolsViewModel;

    private Button btncheckauto;
    private EditText auto1;
    private TextView result;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tools, container, false);

        auto1 = view.findViewById(R.id.autonumber);
        btncheckauto = view.findViewById(R.id.btnauto);
        result = view.findViewById(R.id.AR);


        btncheckauto.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(auto1.getText())){
            auto1.setError("Please enter Number");
            auto1.requestFocus();
            return;
        }

        int anumber,showresult;

        anumber = Integer.parseInt(auto1.getText().toString());

        automorphic auto = new automorphic();
        {

            showresult = auto.auto(anumber);

            if(showresult == anumber)
            {
                result.setText(Integer.toString(anumber) + " is not a Automorphic Number");
            }

            else
            {
                result.setText(Integer.toString(anumber) + " is a Automorphic Number");
            }


        }


    }
}