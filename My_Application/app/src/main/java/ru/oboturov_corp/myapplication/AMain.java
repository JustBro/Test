package ru.oboturov_corp.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class AMain extends AppCompatActivity {

    private int mColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

////        Задание 1 (Проверка строк на равенство)
//
//        Log.d("LOG", "a = null, b = null : " + String.valueOf(isEquals(null, null)));
//        Log.d("LOG", "a = null, b = s : " + String.valueOf(isEquals(null, "s")));
//        Log.d("LOG", "a = s, b = null : " + String.valueOf(isEquals("s", null)));
//        Log.d("LOG", "a = s, b = ss : " + String.valueOf(isEquals("s", "ss")));
//        Log.d("LOG", "a = s, b = s : " + String.valueOf(isEquals("s", "s")));
//
////        Задание 2 (Фильтрация нечетных значений)
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        filter(list);
//        for (Integer i : list) {
//            Log.d("LOG", String.valueOf(i));
//        }
//
////        Задание 3 (Проверка пароля)
//
//        String s = "asd5_*";
//        Log.d("LOG", s + " : " + String.valueOf(check(s)));
//        s = "1234/";
//        Log.d("LOG", s + " : " + String.valueOf(check(s)));
//
////        Задание 4 (Реализация паттерна - Наблюдатель)
//
//        TextSource textSource = new TextSource();
//        textSource.unsubscribe("Dog");
//        textSource.subscribe("Dog");
//        textSource.subscribe("Cat");
//        textSource.subscribe("Monkey");
//        textSource.subscribe("Monkey");
//        textSource.setText("new text");
//
////        Задание 5 (Фрагмен со случайным цветом)
//
//        FColor fColor;
//
//        if (savedInstanceState == null) {
//            int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN};
//            mColor = colors[Math.round((float) (Math.random() * 5))];
//            fColor = FColor.newInstance(mColor);
//        } else {
//            fColor = FColor.newInstance(savedInstanceState.getInt(FColor.KEY_COLOR));
//        }
//
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.container, fColor, "fragment_1").commit();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(FColor.KEY_COLOR, mColor);
        super.onSaveInstanceState(outState);
    }

    public boolean isEquals(String a, String b) {
        return !((a == null && b != null) || (b == null && a != null)) && (a == null || a.equals(b));
    }

    public void filter(List<Integer> list) {
        Iterator<Integer> i = list.iterator();

        while (i.hasNext()) {
            if(i.next() % 2 == 1) i.remove();
        }

    }

    public boolean check(String password) {
        return Pattern.compile("[\\w]{4,}[^\\w\\s]+[\\s]{0}").matcher(password).matches();
    }

}
