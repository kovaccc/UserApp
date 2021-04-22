package com.example.userapp.data.api

import com.example.userapp.data.model.User
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    fun getUsers(): Single<List<User>>


    // By city name api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    //TODO add units query if you want Celsius
    @GET("data/2.5/weather")
    suspend fun searchWeather(
            @Query("q") city: String,
            @Query("appid") appId: String = API_KEY
    ): List<User>

    companion object {
        private const val BASE_URL = "http://api.openweathermap.org/"

        fun create(): WeatherService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .build()

            return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(WeatherService::class.java)
        }
    }

}