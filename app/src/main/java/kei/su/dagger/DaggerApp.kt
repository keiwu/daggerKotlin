package kei.su.dagger

import android.app.Application
import kei.su.dagger.di.ActivityComponent
import kei.su.dagger.di.AppComponent
import kei.su.dagger.di.DaggerAppComponent
//import kei.su.dagger.di.DaggerCarComponent

/**
 * retain the driver in application level
 */
class DaggerApp : Application() {

    private lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return component
    }

}