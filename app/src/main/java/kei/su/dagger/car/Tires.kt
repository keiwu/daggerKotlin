package kei.su.dagger.car

import android.util.Log

class Tires {
    companion object {
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}