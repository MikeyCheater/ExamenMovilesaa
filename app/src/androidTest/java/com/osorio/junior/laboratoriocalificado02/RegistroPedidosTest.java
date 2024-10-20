package com.osorio.junior.laboratoriocalificado02;

import android.content.Intent;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class RegistroPedidosTest {

    @Rule
    public ActivityScenarioRule<RegistroPedidosActivity> activityScenarioRule = new ActivityScenarioRule<>(RegistroPedidosActivity.class);

    @Test
    public void testRegistrarPedido() {
        onView(withId(R.id.nombreClienteEditText)).perform(typeText("Juan Perez"));
        onView(withId(R.id.numeroClienteEditText)).perform(typeText("987654321"));
        onView(withId(R.id.productosEditText)).perform(typeText("Laptop"));
        onView(withId(R.id.ciudadEditText)).perform(typeText("Lima"));
        onView(withId(R.id.direccionEditText)).perform(typeText("Av. Lima 123"));
        onView(withId(R.id.registrarButton)).perform(click());

        Intent intent = new Intent(activityScenarioRule.getScenario().getResult().getPackage(), PedidoActivity.class);
        ActivityScenario.launch(intent);
    }
}
