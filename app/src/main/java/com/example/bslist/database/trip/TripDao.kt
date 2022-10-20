package com.example.bslist.database.trip

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * @author : Mingaleev D
 * @data : 20/10/2022
 */
@Dao
interface TripDao {

   @Query("SELECT * FROM trip")
   fun getAll(): Flow<List<Trip>>

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   fun insert(trip: Trip)

   @Delete
   fun deleteTrip(trip: Trip)
}