package kei.su.dagger.di

import dagger.Module
import dagger.Provides
import kei.su.dagger.car.Rims

@Module
class RimsModule {
    @Provides
    fun providesRims(): Rims {
        return Rims()
    }
}