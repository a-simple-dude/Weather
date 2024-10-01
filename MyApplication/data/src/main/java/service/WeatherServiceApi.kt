package service

import retrofit2.http.Query

interface WeatherServiceApi {
    suspend fun <T> getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("exclude") exclude: String = "minutely,alerts",
    ): T
}
