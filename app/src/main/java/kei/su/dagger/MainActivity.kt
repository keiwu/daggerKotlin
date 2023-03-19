package kei.su.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kei.su.dagger.car.Car
import kei.su.dagger.di.DieselEngineModule
import kei.su.dagger.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car   //field injection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.builder()
                .horsePoser(150)
                .engineCapacity(1400)
                .build()

        component.inject(this)

        car.drive()
    }
}