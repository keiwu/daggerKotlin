package kei.su.dagger.car

import android.util.Log
import javax.inject.Inject

// constructor injection
class Car @Inject constructor(wheels: Wheels) {
    private val TAG = "Car"

    @Inject lateinit var engine: Engine
    @Inject lateinit var driver: Driver
    private var wheels: Wheels

    init {
        this.wheels = wheels
    }

    //method injection, used when you need the object (Car) to be passed as argument.
    //If you don't do this, the Car object will not be instantiated when this method is called.
    //The order of injection executions: Constructor injection is called first; then field injection and
    // then method injection.  In constructor injection, we don't need to explicityly call inject like the
    // one in MainActivity: component.inject(this); because we can do constructor injection;
    // whereas MainActiivty we can not do constructor injection so we have to call the injection method explicitly.
    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }



    fun drive(){
        engine.start()
        Log.d(TAG, "$driver driving car..... $this")
    }
}