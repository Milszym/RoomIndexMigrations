package net.milszym.roomindexmigrations.persistence

import androidx.room.testing.MigrationTestHelper
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import net.milszym.roomindexmigrations.persistence.MainDatabaseMigrations.MIGRATION_1_2
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainDatabaseMigrationsTest {
    private val dbName = "migration-test"

    @get:Rule
    val helper = MigrationTestHelper(
        InstrumentationRegistry.getInstrumentation(),
        MainDatabase::class.java.canonicalName,
        FrameworkSQLiteOpenHelperFactory()
    )

    @Test
    fun migrate_1_2() {
        helper.createDatabase(dbName, 1)

        val dbAfterMigration = helper.runMigrationsAndValidate(dbName, 2, true, MIGRATION_1_2)
        assert(dbAfterMigration.isDatabaseIntegrityOk)
    }
}