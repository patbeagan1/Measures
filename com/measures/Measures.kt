package com.measures

interface DoubleBase<T> {
    val value: Double
    fun asType(d: Double): T
}

interface UnitTypedFull<S, T : DoubleBase<S>> : DoubleBase<T> {
    operator fun plus(other: T) = asType(this.value + other.value)
    operator fun minus(other: T) = asType(this.value - other.value)
    operator fun times(other: Double) = asType(this.value * other)
    operator fun div(other: Double) = asType(this.value / other)
}

object Consts {
    const val SEPTILLION = 10E24
    const val SEXTILLION = 10E21
    const val QUINTILLION = 10E18
    const val QUADRILLION = 10E15
    const val TRILLION = 10E12
    const val BILLION = 10E9
    const val MILLION = 10E6
    const val THOUSAND = 10E3
    const val HUNDRED = 10E2
    const val TEN = 10E1
    const val TENTH = 1E-1
    const val HUNDREDTH = 1E-2
    const val THOUSANDTH = 1E-3
    const val MILLIONTH = 1E-6
    const val BILLIONTH = 1E-9
    const val TRILLIONTH = 1E-12
    const val QUADRILLIONTH = 1E-15
    const val QUINTILLIONTH = 1E-18
    const val SEXTILLIONTH = 1E-21
    const val SEPTILLIONTH = 1E-24

    // greek
    const val YOTTA = SEPTILLION
    const val ZETTA = SEXTILLION
    const val EXA = QUINTILLION
    const val PETA = QUADRILLION
    const val TERA = TRILLION
    const val GIGA = BILLION
    const val MEGA = MILLION
    const val KILO = THOUSAND
    const val HECTO = HUNDRED
    const val DEKA = TEN
    const val DECI = TENTH
    const val CENTI = HUNDREDTH
    const val MILLI = THOUSANDTH
    const val MICRO = MILLIONTH
    const val NANO = BILLIONTH
    const val PICO = TRILLIONTH
    const val FEMTO = QUADRILLIONTH
    const val ATTO = QUINTILLIONTH
    const val ZEPTO = SEXTILLIONTH
    const val YOCTO = SEPTILLIONTH
}