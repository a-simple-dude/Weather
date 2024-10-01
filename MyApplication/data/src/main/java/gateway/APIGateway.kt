package gateway

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import service.WeatherServiceApi

object APIGateway {

    private const val BASE_URL = "https://api.openweathermap.org/"
    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val retrofit by lazy {
        val httpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(ApiKeyInterceptor(""))
            .build()

        Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherServiceApi by lazy {
        retrofit.create(WeatherServiceApi::class.java)
    }
}