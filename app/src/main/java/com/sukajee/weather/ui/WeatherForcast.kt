package com.sukajee.weather.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukajee.weather.data.model.SingleWeather
import com.sukajee.weather.data.toSingleWeather
import java.util.*

@Composable
fun WeatherForecast(
    state: WeatherState,
    modifier: Modifier = Modifier
) {

    val hourOfDay by remember {
        mutableStateOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY))
    }

    val hourlyWeatherList = mutableListOf<SingleWeather>()

    state.hourly?.let { data ->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Today",
                fontSize = 20.sp,
                color = Color.White
            )
            Spacer(modifier = modifier.height(16.dp))
            LazyRow(content = {

                (hourOfDay until (hourOfDay + 24)).forEach {
                    hourlyWeatherList.add(data.toSingleWeather(it))
                }
                items(hourlyWeatherList) { weatherData ->
                    HourlyWeatherDisplay(
                        weatherData = weatherData,
                        modifier = modifier
                            .height(100.dp)
                            .padding(horizontal = 16.dp)
                    )
                }
            })
        }
    }
}