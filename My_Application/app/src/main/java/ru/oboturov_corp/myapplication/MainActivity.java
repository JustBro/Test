package ru.oboturov_corp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void sort(List<Integer> list) {

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 1) iterator.remove();
        }

    }

    public boolean check(String password) {

        Pattern pt = Pattern.compile("[a-zA-Z^//s]{5,}");
        Matcher m = pt.matcher(password);

        return m.matches();
    }

}
