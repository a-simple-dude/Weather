package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_table")
data class WeatherDB(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "main") val main: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "icon") val icon: String,
)
