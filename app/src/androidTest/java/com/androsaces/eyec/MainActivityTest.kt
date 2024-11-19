package com.androsaces.eyec

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Test

class MainActivityTest {
    @Test
    fun buttonDisplaysCorrectText() {
        val button: ViewInteraction = Espresso.onView(ViewMatchers.withId(R.id.countdownButton))
        button.check(ViewAssertions.matches(ViewMatchers.withText("14 days remaining")))
    }
}