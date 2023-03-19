package kei.su.dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

//Since Engine is an interface, but PetroEngine implements Engine,
//then we can do constructor injection on PetroEngine
class PetroEngine @Inject constructor(@Named("horse power") hp: Int, @Named("engine capacity") capacity: Int): Engine {
    private val TAG = "Car"

    private val horsePower = hp
    private val capacity = capacity


    override fun start() {
        Log.d(TAG, "Petro Engine started.. Horsepower: $horsePower ... Engine Capacity: $capacity")
    }
}