package com.sukajee.weather.util

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}