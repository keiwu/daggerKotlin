package kei.su.dagger.car

import javax.inject.Inject
import javax.inject.Singleton

class Driver constructor(driverName: String){
    //assume we don't own this class, so we have to use @Provide
    var name = driverName

}