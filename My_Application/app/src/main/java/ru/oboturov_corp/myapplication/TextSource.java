package ru.oboturov_corp.myapplication;

import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class TextSource {

    private String mText;
    private Set<String> mSubscribers = new HashSet<>();

    public void setText(String text) {
        mText = text;
        notifySubscribers(text);
    }

    public void subscribe(String o) {
        if (!mSubscribers.contains(o)) {
            mSubscribers.add(o);
        } else {
            Log.d("LOG", o + " already subscribed");
        }
    }

    public void unsubscribe(String o) {
        if (mSubscribers.contains(o)) {
            mSubscribers.remove(o);
        } else {
            Log.d("LOG", o + " don't subscribed");
        }
    }

    private void notifySubscribers(String text) {
        for (String o : mSubscribers) {
            Log.d("LOG", o + " : " + text);
        }
    }
}