package kei.su.dagger

import dagger.Component

/**
 * add the modules in the CarComponent since Car needs Wheels and WheelsModule provides the Wheels necessary to construct the car
 */
@Component (modules = [WheelsModule::class, RimsModule::class, TiresModule::class])
interface CarComponent {
    fun getCar(): Car

    //inject the fields marked with @Inject in the MainActivity
    //used when we cannot construct the instance using constructor like MainActivity
    fun inject(mainActivity: MainActivity)
}