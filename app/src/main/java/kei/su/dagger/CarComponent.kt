package kei.su.dagger

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}