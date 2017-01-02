package ru.oboturov_corp.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FColor extends Fragment {

    public static final String KEY_COLOR = "color";

    public static FColor newInstance(int color) {
        FColor FColor = new FColor();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_COLOR, color);
        FColor.setArguments(bundle);
        return FColor;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_color, container, false);
        view.setBackgroundColor(getArguments().getInt(KEY_COLOR));

        return view;
    }
}
