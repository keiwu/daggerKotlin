package kei.su.dagger.di

import dagger.Component
import kei.su.dagger.car.Driver
import javax.inject.Singleton

@Singleton
@Component (modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory{
        fun create(driverModule: DriverModule): AppComponent
    }

}