package database.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import database.WeatherDataDB

interface WeatherDataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: WeatherDataDB)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMultiple(data: List<WeatherDataDB>)

    @Delete
    fun delete(data: WeatherDataDB)

    @Update
    fun updateWeather(data: WeatherDataDB)

    @Query("DELETE FROM weather_data")
    fun deleteAllWeatherData()

    @Query("SELECT * FROM weather_data")
    fun getAllWeatherData(): List<WeatherDataDB>

    @Query("SELECT * FROM weather_data WHERE weather_id = :id LIMIT 1")
    fun getWeatherDataById(id: Long): WeatherDataDB?

    @Query("SELECT * FROM weather_data WHERE city_name = :name")
    fun getWeatherDataByCityName(name: String): List<WeatherDataDB>
}
