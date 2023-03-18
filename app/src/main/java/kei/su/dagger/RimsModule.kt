package kei.su.dagger

import dagger.Module
import dagger.Provides

@Module
class RimsModule {
    @Provides
    fun providesRims(): Rims {
        return Rims()
    }
}