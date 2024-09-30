package com.example.data.models

public final data class WeatherData(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: TempModel,
    val visibility: Long,
    val wind: Wind,
    val rain: Rain,
    val clouds: Clouds,
    val dt: Long,
    val sys: Sys,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long,
)
