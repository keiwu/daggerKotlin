package kei.su.dagger.car

import android.util.Log
import javax.inject.Inject

//Since Engine is an interface, but PetroEngine implements Engine,
//then we can do constructor injection on PetroEngine
class DieselEngine @Inject constructor(): Engine {
    private val TAG = "Car"


    override fun start() {
        Log.d(TAG, "Diesel Engine started..")
    }
}