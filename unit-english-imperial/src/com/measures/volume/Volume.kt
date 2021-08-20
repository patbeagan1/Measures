package com.measures.volume

private val ImperialFluidOunce.conversion get() = Liter(value * 28.4130625 * 1000)
private val ImperialGill.conversion get() = ImperialFluidOunce(value * 5.0)
private val ImperialPint.conversion get() = ImperialFluidOunce(value * 20.0)
private val ImperialQuart.conversion get() = ImperialFluidOunce(value * 40.0)
private val ImperialGallon.conversion get() = ImperialFluidOunce(value * 160.0)

fun UnitVolume<*>.toImperialFluidOunce() = toLiters().toUnit(ImperialFluidOunce(1.0))
fun UnitVolume<*>.toImperialGill() = toLiters().toUnit(ImperialGill(1.0))
fun UnitVolume<*>.toImperialPint() = toLiters().toUnit(ImperialPint(1.0))
fun UnitVolume<*>.toImperialQuart() = toLiters().toUnit(ImperialQuart(1.0))
fun UnitVolume<*>.toImperialGallon() = toLiters().toUnit(ImperialGallon(1.0))

@JvmInline
value class ImperialFluidOunce(override val value: Double) : UnitVolume<ImperialFluidOunce> {
    override fun asType(d: Double) = ImperialFluidOunce(d)
    override fun toLiters() = conversion.toLiters()
}

@JvmInline
value class ImperialGill(override val value: Double) : UnitVolume<ImperialGill> {
    override fun asType(d: Double) = ImperialGill(d)
    override fun toLiters() = conversion.toLiters()
}

@JvmInline
value class ImperialPint(override val value: Double) : UnitVolume<ImperialPint> {
    override fun asType(d: Double) = ImperialPint(d)
    override fun toLiters() = conversion.toLiters()
}

@JvmInline
value class ImperialQuart(override val value: Double) : UnitVolume<ImperialQuart> {
    override fun asType(d: Double) = ImperialQuart(d)
    override fun toLiters() = conversion.toLiters()
}

@JvmInline
value class ImperialGallon(override val value: Double) : UnitVolume<ImperialGallon> {
    override fun asType(d: Double) = ImperialGallon(d)
    override fun toLiters() = conversion.toLiters()
}

