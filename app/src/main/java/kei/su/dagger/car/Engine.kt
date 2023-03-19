package kei.su.dagger.car

/**
 * when Engine is an interface instead of a class, we can not use @Provide.
 * Instead, we can implements this interface and use @Binds to provide the Engine implemented.
 * This we can swap the PetroEngine or DieselEngine easily for testing and code performance
 */
interface Engine {
    fun start()
}