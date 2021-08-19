package com.measures.volume.fluid

import com.measures.volume.Liters
import com.measures.volume.UnitVolume

fun Liters.asMinim() = toUnit(Minim(1.0))
fun UnitVolume<*>.toMinim() = toLiters().asMinim()

fun Liters.asUSFluidDram() = toUnit(USFluidDram(1.0))
fun UnitVolume<*>.toUSFluidDram() = toLiters().asUSFluidDram()

fun Liters.asTeaspoon() = toUnit(Teaspoon(1.0))
fun UnitVolume<*>.toTeaspoon() = toLiters().asTeaspoon()

fun Liters.asTablespoon() = toUnit(Tablespoon(1.0))
fun UnitVolume<*>.toTablespoon() = toLiters().asTablespoon()

fun Liters.asUSFluidOunce() = toUnit(USFluidOunce(1.0))
fun UnitVolume<*>.toUSFluidOunce() = toLiters().asUSFluidOunce()

fun Liters.asUSShot() = toUnit(USShot(1.0))
fun UnitVolume<*>.toUSShot() = toLiters().asUSShot()

fun Liters.asUSGill() = toUnit(USGill(1.0))
fun UnitVolume<*>.toUSGill() = toLiters().asUSGill()

fun Liters.asUSCup() = toUnit(USCup(1.0))
fun UnitVolume<*>.toUSCup() = toLiters().asUSCup()

fun Liters.asUSFluidPint() = toUnit(USFluidPint(1.0))
fun UnitVolume<*>.toUSFluidPint() = toLiters().asUSFluidPint()

fun Liters.asUSFluidQuart() = toUnit(USFluidQuart(1.0))
fun UnitVolume<*>.toUSFluidQuart() = toLiters().asUSFluidQuart()

fun Liters.asUSFluidPottle() = toUnit(USFluidPottle(1.0))
fun UnitVolume<*>.toUSFluidPottle() = toLiters().asUSFluidPottle()

fun Liters.asUSFluidGallon() = toUnit(USFluidGallon(1.0))
fun UnitVolume<*>.toUSFluidGallon() = toLiters().asUSFluidGallon()

fun Liters.asBarrelFluid() = toUnit(BarrelFluid(1.0))
fun UnitVolume<*>.toBarrelFluid() = toLiters().asBarrelFluid()

fun Liters.asBarrelOil() = toUnit(BarrelOil(1.0))
fun UnitVolume<*>.toBarrelOil() = toLiters().asBarrelOil()

fun Liters.asHogshead() = toUnit(Hogshead(1.0))
fun UnitVolume<*>.toHogshead() = toLiters().asHogshead()