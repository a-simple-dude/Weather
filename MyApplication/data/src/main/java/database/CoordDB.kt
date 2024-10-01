package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coord_db")
public final data class CoordDB(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "lon") val lon: Double,
    @ColumnInfo(name = "lat") val lat: Double,
)
