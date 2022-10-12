package smir.shitab14.unittestingdemo

import android.content.Context
import android.widget.Toast
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.assertion.ViewAssertions.matches
import com.google.android.material.internal.ContextUtils.getActivity
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


/**
 * Created by Shitab Mir on 12 October, 2022.
 * HungryNaki (Technology), Daraz Bangladesh Limited, Alibaba Group
 * mushfiq.islam@hungrynaki.com | shitabmir@gmail.com
 */
@RunWith(RobolectricTestRunner::class)
class ShitabWritesTests {

    lateinit var applicationProviderContext: Context

    @Before
    fun setUp() {
        applicationProviderContext = ApplicationProvider.getApplicationContext()

        returnsSomethingRequiresContextObject = ReturnsSomethingRequiresContext(applicationProviderContext)
        returnsSomethingObject = ReturnsSomething
    }

    @After
    fun tearDown() {
    }

    private lateinit var returnsSomethingObject: ReturnsSomething
    /**
        This Checks the function 'variantIsDebug()' 'ReturnsSomething' Object
     */
    @Test
    fun checkVariantIsDebug() {
        val result = returnsSomethingObject.variantIsDebug()
        kotlin.assert(result) // WORKS
//        com.google.common.truth.Truth.assertThat(result).isTrue() // WORKS
    }

    lateinit var returnsSomethingRequiresContextObject: ReturnsSomethingRequiresContext
    @Test
    fun getToastFromReturnsSomething() {
        val toastResult: Toast = returnsSomethingRequiresContextObject.returnsAToast("From Test")
//        showToastWithEspresso()
        com.google.common.truth.Truth.assertThat(toastResult.duration).isEqualTo(
            Toast.makeText(applicationProviderContext, "From Test", Toast.LENGTH_LONG).duration
        )
//        toastResult.show()
    }

    private fun showToastWithEspresso() {
        androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withText("From Test"))
            .inRoot(androidx.test.espresso.matcher.RootMatchers.withDecorView(org.hamcrest.Matchers.not(org.hamcrest.Matchers.`is`(getActivity(applicationProviderContext)?.window?.decorView))))
            .check(matches(androidx.test.espresso.matcher.ViewMatchers.isDisplayed()))

    }

}