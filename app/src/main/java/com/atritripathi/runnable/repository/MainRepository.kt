package com.atritripathi.runnable.repository

import com.atritripathi.runnable.db.Run
import com.atritripathi.runnable.db.RunDao
import com.atritripathi.runnable.other.Constants
import com.atritripathi.runnable.other.Constants.AVG_SPEED_IN_KMPH
import com.atritripathi.runnable.other.Constants.CALORIES_BURNED
import com.atritripathi.runnable.other.Constants.DATE_TIMESTAMP
import com.atritripathi.runnable.other.Constants.DISTANCE_IN_METERS
import com.atritripathi.runnable.other.Constants.TIME_IN_MILLIS
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedBy(DATE_TIMESTAMP)

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedBy(DISTANCE_IN_METERS)

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedBy(TIME_IN_MILLIS)

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedBy(AVG_SPEED_IN_KMPH)

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedBy(CALORIES_BURNED)

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}