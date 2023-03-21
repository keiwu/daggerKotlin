package kei.su.dagger.di

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import kei.su.dagger.MainActivity
import kei.su.dagger.car.Car
import javax.inject.Named

/**
 * add the modules in the CarComponent since Car needs Wheels and WheelsModule provides the Wheels necessary to construct the car
 *
 * We can swap the DieselEngineModule::class with PetroEngineModule:class easily or other type of engine for testing
 */
@PerActivity
@Subcomponent(modules = [WheelsModule::class, RimsModule::class, TiresModule::class, PetroEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    //inject the fields marked with @Inject in the MainActivity
    //used when we cannot construct the instance using constructor like MainActivity
    fun inject(mainActivity: MainActivity)

    //alternative to Subcomponent.Builder, but they can not exist at the sametime/
    // benefit of this factory is the compile time benefit because it detects if horsepower or engine capacity must be exist
    // whereas builder is runtime.
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horse power")hp: Int,
                   @BindsInstance @Named("engine capacity") capacity: Int): ActivityComponent
    }
}