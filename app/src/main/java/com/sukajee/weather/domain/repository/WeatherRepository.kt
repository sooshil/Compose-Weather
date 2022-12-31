package com.sukajee.weather.domain.repository

import com.sukajee.weather.domain.util.Resource
import com.sukajee.weather.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo>
}