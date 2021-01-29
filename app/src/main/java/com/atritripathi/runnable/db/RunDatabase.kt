package com.atritripathi.runnable.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class RunDatabase: RoomDatabase() {
     abstract fun getRunDao(): RunDao
}