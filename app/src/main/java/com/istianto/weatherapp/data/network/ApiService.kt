package com.istianto.weatherapp.data.network

import com.istianto.weatherapp.BuildConfig.API_KEY
import com.istianto.weatherapp.data.response.ForecastWeatherResponse
import com.istianto.weatherapp.data.response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    fun weatherByCity(
        @Query("q") location: String,
        @Query("appid") apiKey: String = API_KEY
    ) : Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCity(
        @Query("q") location: String,
        @Query("appid") apiKey: String = API_KEY
    ) : Call<ForecastWeatherResponse>

    @GET("weather")
    fun weatherByCurrentLocation(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String = API_KEY
    ) : Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCurrentLocation(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String = API_KEY
    ) : Call<ForecastWeatherResponse>
}