package kei.su.dagger.di

import dagger.Module
import dagger.Provides
import kei.su.dagger.car.Driver
import kei.su.dagger.car.Rims
import kei.su.dagger.car.Tires
import kei.su.dagger.car.Wheels
import javax.inject.Singleton

@Module
class DriverModule {

    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}
