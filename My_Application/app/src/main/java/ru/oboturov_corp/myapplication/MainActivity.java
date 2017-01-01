package ru.oboturov_corp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean isEqualse(String a, String b) {

        boolean result;

        if ((a == null && b != null) || (b == null && a != null)) {
            result = false;
        } else {
            result = (a == null && b == null) || a.equals(b);
        }

        return result;
    }

}
