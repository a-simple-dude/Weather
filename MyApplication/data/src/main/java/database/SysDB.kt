package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sys_table")
public final data class SysDB(
    @ColumnInfo("type") val type: Long,
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "sunrise") val sunrise: Long,
    @ColumnInfo(name = "sunset") val sunset: Long,
)
