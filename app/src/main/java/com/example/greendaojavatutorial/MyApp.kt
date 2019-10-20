package com.example.greendaojavatutorial

import android.app.Application
import com.example.greendaojavatutorial.database.DaoMaster
import com.example.greendaojavatutorial.database.DaoSession

//import com.example.greendaojavatutorial.GeneratedGreenDao.DaoMaster
//import com.example.greendaojavatutorial.GeneratedGreenDao.DaoSession

/**
 * Created by Franz Andel on 2019-08-18.
 * Android Engineer
 */

class MyApp : Application() {

    private lateinit var daoSession: DaoSession

    companion object {
        private lateinit var mInstance : MyApp

        @Synchronized
        fun getInstance(): MyApp {
            return mInstance
        }
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this

        val helper = DaoMaster.DevOpenHelper(this, "example-db")

        val db = helper.writableDb

        daoSession = DaoMaster(db).newSession()
    }

    fun getDaoSession() : DaoSession {
        return daoSession
    }
}