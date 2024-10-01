package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wind_table")
data class WindDB(
    @PrimaryKey(autoGenerate = true) val id: Long = 0, // Primary key with auto-generation
    @ColumnInfo(name = "speed") val speed: Double,
    @ColumnInfo(name = "deg") val deg: Long,
    @ColumnInfo(name = "gust") val gust: Double,
)
