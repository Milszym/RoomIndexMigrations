package net.milszym.roomindexmigrations.persistence.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import net.milszym.roomindexmigrations.persistence.entity.DumplingsEntity.Companion.DUMPLINGS_TABLE_NAME

@Entity(
    tableName = DUMPLINGS_TABLE_NAME
)
data class DumplingsEntity(
    @PrimaryKey val id: String,
    val name: String
) {
    companion object {
        const val DUMPLINGS_TABLE_NAME = "dumplings"
    }
}