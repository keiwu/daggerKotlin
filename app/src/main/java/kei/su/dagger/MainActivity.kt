package kei.su.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kei.su.dagger.car.Car
import kei.su.dagger.car.DieselEngine
import kei.su.dagger.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car1: Car   //field injection
    @Inject lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = (application as DaggerApp).getAppComponent()
                .getActivityComponentFactory().create(150, 1400)

        component.inject(this)

        car1.drive()
        car2.drive()
    }
}