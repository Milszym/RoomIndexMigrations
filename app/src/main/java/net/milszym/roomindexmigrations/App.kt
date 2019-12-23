package net.milszym.roomindexmigrations

import android.app.Application
import androidx.room.Room
import net.milszym.roomindexmigrations.persistence.MainDatabase
import net.milszym.roomindexmigrations.persistence.MainDatabase.Companion.MAIN_DATABASE_NAME
import net.milszym.roomindexmigrations.persistence.entity.DumplingsEntity.Companion.DUMPLINGS_TABLE_NAME

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        initializeRoom()
    }

    private fun initializeRoom() {
        val database = Room.databaseBuilder(
            this,
            MainDatabase::class.java,
            MAIN_DATABASE_NAME
        ).allowMainThreadQueries().build()

        database.query("INSERT INTO $DUMPLINGS_TABLE_NAME (?, ?)", arrayOf("1", "Dumplings With Skwarki"))
    }
}