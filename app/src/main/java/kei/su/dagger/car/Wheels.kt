package kei.su.dagger.car


class Wheels constructor(rims: Rims, tires: Tires){
    private var rims: Rims
    private var tires: Tires

    init {
        this.rims = rims
        this.tires = tires
    }
}