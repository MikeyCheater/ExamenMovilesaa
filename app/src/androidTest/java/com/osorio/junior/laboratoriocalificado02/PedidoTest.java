package com.osorio.junior.laboratoriocalificado02;

import android.content.Intent;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class PedidoTest {

    @Rule
    public ActivityScenarioRule<PedidoActivity> activityScenarioRule = new ActivityScenarioRule<>(PedidoActivity.class);

    @Test
    public void testMostrarDatosPedido() {
        Intent intent = new Intent();
        intent.putExtra("nombreCliente", "Juan Perez");
        intent.putExtra("numeroCliente", "987654321");
        intent.putExtra("productos", "Laptop");
        intent.putExtra("ubicacion", "Lima, Av. Lima 123");
        ActivityScenario.launch(intent);

        onView(withId(R.id.nombreClienteTextView)).check(matches(withText("Juan Perez")));
        onView(withId(R.id.numeroClienteTextView)).check(matches(withText("987654321")));
        onView(withId(R.id.productosTextView)).check(matches(withText("Laptop")));
        onView(withId(R.id.ubicacionTextView)).check(matches(withText("Lima, Av. Lima 123")));
    }
}
