package kei.su.dagger

import android.util.Log
import javax.inject.Inject


class Engine {
    private val TAG = "Car"
    @Inject
    constructor(){
        Log.d(TAG, "Engine initialized....")
    }

    fun tuneEngine(car: Car){
        Log.d(TAG, "tunning engine.....")
    }
}