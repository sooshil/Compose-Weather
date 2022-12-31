package com.sukajee.weather.di

import com.sukajee.weather.data.location.DefaultLocationTracker
import com.sukajee.weather.data.repository.WeatherRepositoryImpl
import com.sukajee.weather.domain.location.LocationTracker
import com.sukajee.weather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}