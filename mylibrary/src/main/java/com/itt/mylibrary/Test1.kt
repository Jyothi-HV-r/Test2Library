package com.itt.mylibrary

import android.util.Log
import com.google.gson.Gson

open class Test1 : Test() {
    var x = Test1().name

    fun getNumber(): Int {
        var gson = Gson().toJson(Test1())
        Log.d("test", gson)
        return 12
    }


}