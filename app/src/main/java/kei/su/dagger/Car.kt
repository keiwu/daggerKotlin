package kei.su.dagger

import android.util.Log
import javax.inject.Inject

// constructor injection
class Car @Inject constructor(wheels: Wheels) {
    private val TAG = "Car"

    @Inject lateinit var engine: Engine
    private var wheels: Wheels

    init {
        this.wheels = wheels
    }

    @Inject
    fun tuneEngine(){
        engine.tuneEngine(this)
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
        Log.d(TAG, "driving car.....")
    }
}