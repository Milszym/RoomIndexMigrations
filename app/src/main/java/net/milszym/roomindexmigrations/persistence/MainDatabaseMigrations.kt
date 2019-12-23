package net.milszym.roomindexmigrations.persistence

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

object MainDatabaseMigrations {
    val MIGRATION_1_2 = object: Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            // no migration specified
        }
    }

    val MIGRATIONS = arrayOf(
        MIGRATION_1_2
    )
}