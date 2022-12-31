package com.sukajee.weather.data.repository

import com.sukajee.weather.data.mappers.toWeatherInfo
import com.sukajee.weather.data.remote.WeatherAPI
import com.sukajee.weather.domain.repository.WeatherRepository
import com.sukajee.weather.domain.util.Resource
import com.sukajee.weather.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lon = lon
                ).toWeatherInfo()
            )

        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}