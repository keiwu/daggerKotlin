package kei.su.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {

    //Use Binds instead of Provides because it is more concise;
    //Dagger can optimize the code when using Binds more than Provides or static Provides
    //Dagger never creates an implementation of the class when using Binds; it just instantiate the PetroEngine directly.
    //So, whenever you need to bind an implementation to an interface, eg, when you want and Engine and you need a PetroEngine,
    //you should use bind instead of provide.

    //Binds takes a single argument, which is the implementation(PetroEngine) of the interface(Engine) defined
    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}