package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cloud_table")
public final data class CloudsDB(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "all") val all: Long,
)
