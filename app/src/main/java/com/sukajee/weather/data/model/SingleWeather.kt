package com.sukajee.weather.data.model

import com.sukajee.weather.data.WeatherType
import java.time.LocalDateTime

data class SingleWeather(
    val time: Int,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
