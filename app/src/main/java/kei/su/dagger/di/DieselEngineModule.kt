package kei.su.dagger.di

import dagger.Module
import dagger.Provides
import kei.su.dagger.car.DieselEngine
import kei.su.dagger.car.Engine

@Module
class DieselEngineModule constructor(hp: Int) {
    private var horsePower = hp

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    //Use Binds instead of Provides because it is more concise;
    //Dagger can optimize the code when using Binds more than Provides or static Provides
    //Dagger never creates an implementation of the class when using Binds; it just instantiate the PetroEngine directly.
    //So, whenever you need to bind an implementation to an interface, eg, when you want and Engine and you need a PetroEngine,
    //you should use bind instead of provide.

    //Binds takes a single argument, which is the implementation(PetroEngine) of the interface(Engine) defined
    //We can not use @Binds now because we don't have @Inject constructor now
    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}