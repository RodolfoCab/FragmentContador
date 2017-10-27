package com.example.roxanacabmartnez.fragmentcontador;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Roxana Cab Martínez on 27/10/2017.
 */

public class FragmentContador extends Fragment {
    private final String KEY_CONTEO = "inicio";
    private EditText mContador;
    private Button mBotoncontar,mBotonreiniciar;
    int inicio=0;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contador, container, false);
        

        return v;
    }
}

