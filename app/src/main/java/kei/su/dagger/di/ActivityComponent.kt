package kei.su.dagger.di

import dagger.BindsInstance
import dagger.Component
import kei.su.dagger.MainActivity
import kei.su.dagger.car.Car
import javax.inject.Named

/**
 * add the modules in the CarComponent since Car needs Wheels and WheelsModule provides the Wheels necessary to construct the car
 *
 * We can swap the DieselEngineModule::class with PetroEngineModule:class easily or other type of engine for testing
 */
@PerActivity
@Component (dependencies = [AppComponent::class], modules = [WheelsModule::class, RimsModule::class, TiresModule::class, PetroEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    //inject the fields marked with @Inject in the MainActivity
    //used when we cannot construct the instance using constructor like MainActivity
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horse power")hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") capacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}