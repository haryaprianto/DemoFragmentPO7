package com.example.a16022596.demofragmentpo7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {

    Button btnAddText2;
    TextView tvFrag2;


    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        tvFrag2 = (TextView) view.findViewById(R.id.tvFrag1);
        btnAddText2 = (Button) view.findViewById(R.id.btnAddTextFrag2);

        btnAddText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag2.getText().toString() + "\n" + "New Data";
                tvFrag2.setText(data);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
