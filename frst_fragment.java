package com.example.samsung.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samsung on 16-Mar-17.
 */

public class frst_fragment extends Fragment {

    @Nullable
    View myView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.log_out,container,false);
        return myView;

    }
}
