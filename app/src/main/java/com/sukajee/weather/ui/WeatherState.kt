package com.sukajee.weather.ui

import com.sukajee.weather.data.Hourly
import com.sukajee.weather.data.model.SingleWeather


data class WeatherState(
    val hourly: Hourly? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
