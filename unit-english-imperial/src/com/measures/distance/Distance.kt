package com.measures.distance

private val ImperialThou.conversion get() = ImperialFoot(value / 12000.0)
private val ImperialBarleycorn.conversion get() = ImperialFoot(value / 36.0)
private val ImperialInch.conversion get() = ImperialFoot(value / 12.0)
private val ImperialHand.conversion get() = ImperialFoot(value / 3.0)
private val ImperialFoot.conversion get() = Meters(value * 0.3048)
private val ImperialYard.conversion get() = ImperialFoot(value * 3.0)
private val ImperialChain.conversion get() = ImperialFoot(value * 66.0)
private val ImperialFurlong.conversion get() = ImperialFoot(value * 660.0)
private val ImperialMile.conversion get() = ImperialFoot(value * 5280)
private val ImperialLeague.conversion get() = ImperialFoot(value * 15840)

fun UnitDistance<*>.toImperialThou() = toMeters().toUnit(ImperialThou(1.0))
fun UnitDistance<*>.toImperialBarleycorn() = toMeters().toUnit(ImperialBarleycorn(1.0))
fun UnitDistance<*>.toImperialInch() = toMeters().toUnit(ImperialInch(1.0))
fun UnitDistance<*>.toImperialHand() = toMeters().toUnit(ImperialHand(1.0))
fun UnitDistance<*>.toImperialFoot() = toMeters().toUnit(ImperialFoot(1.0))
fun UnitDistance<*>.toImperialYard() = toMeters().toUnit(ImperialYard(1.0))
fun UnitDistance<*>.toImperialChain() = toMeters().toUnit(ImperialChain(1.0))
fun UnitDistance<*>.toImperialFurlong() = toMeters().toUnit(ImperialFurlong(1.0))
fun UnitDistance<*>.toImperialMile() = toMeters().toUnit(ImperialMile(1.0))
fun UnitDistance<*>.toImperialLeague() = toMeters().toUnit(ImperialLeague(1.0))

@JvmInline
value class ImperialThou(override val value: Double) : UnitDistance<ImperialThou> {
    override fun asType(d: Double) = ImperialThou(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialBarleycorn(override val value: Double) : UnitDistance<ImperialBarleycorn> {
    override fun asType(d: Double) = ImperialBarleycorn(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialInch(override val value: Double) : UnitDistance<ImperialInch> {
    override fun asType(d: Double) = ImperialInch(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialHand(override val value: Double) : UnitDistance<ImperialHand> {
    override fun asType(d: Double) = ImperialHand(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialFoot(override val value: Double) : UnitDistance<ImperialFoot> {
    override fun asType(d: Double) = ImperialFoot(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialYard(override val value: Double) : UnitDistance<ImperialYard> {
    override fun asType(d: Double) = ImperialYard(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialChain(override val value: Double) : UnitDistance<ImperialChain> {
    override fun asType(d: Double) = ImperialChain(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialFurlong(override val value: Double) : UnitDistance<ImperialFurlong> {
    override fun asType(d: Double) = ImperialFurlong(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialMile(override val value: Double) : UnitDistance<ImperialMile> {
    override fun asType(d: Double) = ImperialMile(d)
    override fun toMeters() = conversion.toMeters()
}

@JvmInline
value class ImperialLeague(override val value: Double) : UnitDistance<ImperialLeague> {
    override fun asType(d: Double) = ImperialLeague(d)
    override fun toMeters() = conversion.toMeters()
}

