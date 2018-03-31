package com.example.tadasstankevicius.asynk.home;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.tadasstankevicius.asynk.MainActivity;
import com.example.tadasstankevicius.asynk.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.example.tadasstankevicius.asynk.assertion.Assertion.itemVisible;
import static com.example.tadasstankevicius.asynk.screens.Screens.onHomeScreen;
import static org.junit.Assert.assertTrue;

// @LargeTest = UI @MediumTest = Integration @SmallTest = Unit

@LargeTest  // We annotate all UI tests with @LargeTest
@RunWith(AndroidJUnit4.class) // We set a runner class which we will use to run our tests
public class HomeScreenTest {

    @Rule   // We set a an activity rule, this will ensure that we launch the MainActivity first.
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test // Here we write our tests, There is a chance of NoMatchingViewException so we call throws
    public void shouldGetAndDisplayResults() throws Exception {
        onHomeScreen().runTimerFor("3");  // We simulate a call that takes 3 seconds
        assertTrue(itemVisible(R.id.tv_result)); // Assert that we got the results back
    }

}
