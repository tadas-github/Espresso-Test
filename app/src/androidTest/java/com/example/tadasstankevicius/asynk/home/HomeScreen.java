package com.example.tadasstankevicius.asynk.home;

import com.example.tadasstankevicius.asynk.R;
import com.example.tadasstankevicius.asynk.base.BaseScreen;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class HomeScreen extends BaseScreen<HomeScreen> {

    public HomeScreen() {
        super(HomeScreen.class);
    }

    public HomeScreen runTimerFor(String seconds) {
        onView(withId(R.id.in_time)).perform(typeText(seconds));   // find text view, enter num of seconds
        onView(withId(R.id.btn_run)).perform(click());   // find run button and press it
        return self;
    }
}
