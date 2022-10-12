package smir.shitab14.unittestingdemo

import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by Shitab Mir on 12 October, 2022.
 * HungryNaki (Technology), Daraz Bangladesh Limited, Alibaba Group
 * mushfiq.islam@hungrynaki.com | shitabmir@gmail.com
 */

class ShitabWritesTests {

    @Before
    fun setUp() {
        returnsSomethingObject = ReturnsSomething
    }

    @After
    fun tearDown() {
    }

    lateinit var returnsSomethingObject: ReturnsSomething
    /**
        This Checks the function 'variantIsDebug()' 'ReturnsSomething' Object
     */
    @Test
    fun checkVariantIsDebug() {
        val result = returnsSomethingObject.variantIsDebug()
        kotlin.assert(result) // Works
//        com.google.common.truth.Truth.assertThat(result).isTrue() // Works
    }

}