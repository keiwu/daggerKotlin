package kei.su.dagger.car

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(hp: Int) {
    private var horsePower = hp

    //Use Binds instead of Provides because it is more concise;
    //Dagger can optimize the code when using Binds more than Provides or static Provides
    //Dagger never creates an implementation of the class when using Binds; it just instantiate the PetroEngine directly.
    //So, whenever you need to bind an implementation to an interface, eg, when you want and Engine and you need a PetroEngine,
    //you should use bind instead of provide.

    //Binds takes a single argument, which is the implementation(PetroEngine) of the interface(Engine) defined
    //We can not use @Binds now because we don't have @Inject constructor now
    @Provides
    fun provideEngine(): Engine{
        return DieselEngine(horsePower)
    }
}