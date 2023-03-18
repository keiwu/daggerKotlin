package kei.su.dagger

import dagger.Module
import dagger.Provides

@Module
class TiresModule {

    @Provides
    fun providesTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }
}