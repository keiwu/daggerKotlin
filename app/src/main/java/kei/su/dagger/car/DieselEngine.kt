package kei.su.dagger.car

import android.util.Log

//Since Engine is an interface, but PetroEngine implements Engine,
//then we can do constructor injection on PetroEngine
//Let's say we don't know the horsePower before hand and we need to pass this horsePower
//at run time.  (Before we have the values at compile time, this time we don't have horsePower
//at compile time).  We have to pass the horsePower at run time when we are building the component.
//Since dagger can not instantiate this constructor directly, we can remove the @Inject annotation.
//Because we have now call the constructor and pass the horsePower
class DieselEngine constructor(hp: Int): Engine {
    private val TAG = "Car"

    private var horsePower: Int = hp


    override fun start() {
        Log.d(TAG, "Diesel Engine started..  Horse power: $horsePower")
    }
}