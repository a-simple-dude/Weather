package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "temp_table")
public final data class TempModelDB(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "temp") val temp: Double,
    @ColumnInfo(name = "feels_like") val feelsLike: Double,
    @ColumnInfo(name = "temp_min") val tempMin: Double,
    @ColumnInfo(name = "temp_max") val tempMax: Double,
    @ColumnInfo(name = "pressure") val pressure: Long,
    @ColumnInfo(name = "humidity") val humidity: Long,
    @ColumnInfo(name = "sea_level") val seaLevel: Long,
    @ColumnInfo(name = "grnd_level") val grndLevel: Long,
)
