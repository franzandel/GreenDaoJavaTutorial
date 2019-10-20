package com.example.greendaojavatutorial

import com.example.greendaojavatutorial.database.User
import com.example.greendaojavatutorial.database.UserDao

//import com.example.greendaojavatutorial.GeneratedGreenDao.UserDao

/**
 * Created by Franz Andel on 2019-08-18.
 * Android Engineer
 */

class Repository {

    private var userDao: UserDao
    private lateinit var list: List<User>

    val getAllData: List<User>
        get() {
            list = userDao.loadAll()

            return list
        }

    init {
        val daoSession = MyApp.getInstance().getDaoSession()
        userDao = daoSession.userDao
    }

    fun updateData(user: User) {
        userDao.update(user)
    }


    fun deleteData(id: Long) {
        userDao.deleteByKey(id)
    }


    fun addData(user: User) {
        userDao.insert(user)
    }

}
