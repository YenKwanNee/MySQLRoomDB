package com.example.mysqlroomdb.data

import androidx.room.Dao
import androidx.room.Insert


//Dao = Data Access Operations

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p : Product)


}