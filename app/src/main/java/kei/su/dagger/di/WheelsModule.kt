package kei.su.dagger.di

import dagger.Module
import dagger.Provides
import kei.su.dagger.car.Rims
import kei.su.dagger.car.Tires
import kei.su.dagger.car.Wheels

/**
 * When we don't own the class and thus we can not modify the code to do constructor injection, we can use Module.
 * Module provides the option to get the necessary object using dependency injection when we don't own the class.
 * We name the class to be the object we want to get subfix with Module: ie : WheelsModule
 *
 * We annotate the function with @Provides and then specify the return type to be the type we want to get:
 * for example: providesWheels(rims: Rims, tires: Tires) returns Wheels type.
 */
@Module
class WheelsModule {
    /**
     * rims and tires are from the providesRims() and providesTires()
     */
    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}