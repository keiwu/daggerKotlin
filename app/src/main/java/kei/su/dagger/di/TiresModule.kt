package kei.su.dagger.di

import dagger.Module
import dagger.Provides
import kei.su.dagger.car.Tires

@Module
class TiresModule {

    @Provides
    fun providesTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }
}