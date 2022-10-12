package smir.shitab14.unittestingdemo

import android.content.Context
import android.widget.Toast

/**
 * Created by Shitab Mir on 12 October, 2022.
 * HungryNaki (Technology), Daraz Bangladesh Limited, Alibaba Group
 * mushfiq.islam@hungrynaki.com | shitabmir@gmail.com
 **/
class ReturnsSomethingRequiresContext(private val context: Context) {

    fun returnsAToast(msg: String): Toast {
        return Toast.makeText(context, msg, Toast.LENGTH_LONG)
    }

    fun retrunsAString(msg: String): String {
        return msg
    }

}