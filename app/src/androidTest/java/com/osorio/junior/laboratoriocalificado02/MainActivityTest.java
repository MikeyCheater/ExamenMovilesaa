package com.osorio.junior.laboratoriocalificado02;

import android.content.Intent;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testAbrirRegistroPedidos() {
        onView(withId(R.id.openRegistroPedidosButton)).perform(click());
        Intent intent = new Intent(activityRule.getScenario().getResult().getPackage(), RegistroPedidosActivity.class);
        ActivityScenario.launch(intent);
    }
}
