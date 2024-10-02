package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_data")
public final data class WeatherDataDB(
    @PrimaryKey
    @ColumnInfo(name = "weather_id")
    val id: Long,
    @ColumnInfo(name = "coord")
    val coord: CoordDB,
    @ColumnInfo(name = "weather_list")
    val weather: List<WeatherDB>,
    @ColumnInfo(name = "base_info")
    val base: String,
    @ColumnInfo(name = "temp_main")
    val main: TempModelDB,
    @ColumnInfo(name = "visibility")
    val visibility: Long,
    @ColumnInfo(name = "wind_info")
    val wind: WindDB,
    @ColumnInfo(name = "rain_info")
    val rain: RainDB?,
    @ColumnInfo(name = "cloud_info")
    val clouds: CloudsDB,
    @ColumnInfo(name = "timestamp")
    val dt: Long,
    @ColumnInfo(name = "system_info")
    val sys: SysDB,
    @ColumnInfo(name = "timezone_offset")
    val timezone: Long,
    @ColumnInfo(name = "city_name")
    val name: String,
    @ColumnInfo(name = "status_code")
    val cod: Long,
)
