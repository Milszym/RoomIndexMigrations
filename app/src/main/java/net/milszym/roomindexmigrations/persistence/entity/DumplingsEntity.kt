package net.milszym.roomindexmigrations.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import net.milszym.roomindexmigrations.persistence.entity.DumplingsEntity.Companion.DUMPLINGS_NAME_COLUMN_NAME
import net.milszym.roomindexmigrations.persistence.entity.DumplingsEntity.Companion.DUMPLINGS_TABLE_NAME

@Entity(
    tableName = DUMPLINGS_TABLE_NAME,
    indices = [
        Index(DUMPLINGS_NAME_COLUMN_NAME)
    ]
)
data class DumplingsEntity(
    @PrimaryKey val id: String,
    @ColumnInfo(name = DUMPLINGS_NAME_COLUMN_NAME) val name: String
) {
    companion object {
        const val DUMPLINGS_TABLE_NAME = "dumplings"
        const val DUMPLINGS_NAME_COLUMN_NAME = "name"
    }
}