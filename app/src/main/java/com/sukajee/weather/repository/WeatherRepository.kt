package com.sukajee.weather.repository

import com.sukajee.weather.util.Resource
import com.sukajee.weather.data.model.WeatherResponse

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherResponse>
}