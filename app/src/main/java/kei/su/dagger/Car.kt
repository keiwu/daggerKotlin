package kei.su.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {
    private val TAG = "Car"

    private var engine: Engine
    private var wheels: Wheels

    init {
        this.engine = engine
        this.wheels = wheels
    }


    fun drive(){
        Log.d(TAG, "driving car.....")
    }
}