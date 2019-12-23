package net.milszym.roomindexmigrations.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import net.milszym.roomindexmigrations.persistence.entity.DumplingsEntity

@Database(
    entities = [
        DumplingsEntity::class
    ],
    version = 2,
    exportSchema = true
)
abstract class MainDatabase : RoomDatabase() {
    companion object {
        const val MAIN_DATABASE_NAME = "MainDatabase"
    }
}