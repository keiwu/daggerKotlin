package kei.su.dagger.di

import dagger.BindsInstance
import dagger.Component
import kei.su.dagger.MainActivity
import kei.su.dagger.car.Car
import javax.inject.Named
import javax.inject.Singleton

/**
 * add the modules in the CarComponent since Car needs Wheels and WheelsModule provides the Wheels necessary to construct the car
 *
 * We can swap the DieselEngineModule::class with PetroEngineModule:class easily or other type of engine for testing
 */
@Singleton
@Component (modules = [WheelsModule::class, RimsModule::class, TiresModule::class, PetroEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    //inject the fields marked with @Inject in the MainActivity
    //used when we cannot construct the instance using constructor like MainActivity
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePoser(@Named("horse power")hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") capacity: Int): Builder

        fun build(): CarComponent
    }
}