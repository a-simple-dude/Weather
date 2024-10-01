package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rain_table")
public final data class RainDB(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "the1H") val the1H: Double,
)
