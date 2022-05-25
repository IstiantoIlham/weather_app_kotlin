package com.istianto.weatherapp.utils

import java.math.RoundingMode

object HelperFunction {

    fun formatDegree(temperature: Double?) : String {
        val maxTemp = temperature as Double
        val temperatureToCelsius = maxTemp - 273.0
        val formatDegree = temperatureToCelsius.toBigDecimal().setScale(2, RoundingMode.CEILING).toDouble()
        return "$formatDegree ºC"
    }
}