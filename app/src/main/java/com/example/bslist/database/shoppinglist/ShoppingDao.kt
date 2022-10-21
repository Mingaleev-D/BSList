package com.example.bslist.database.shoppinglist

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import java.util.*

/**
 * @author : Mingaleev D
 * @data : 20/10/2022
 */
@Dao
interface ShoppingDao {
   @Query("SELECT * FROM ShoppingItem WHERE tripId = :tripId ")
   fun getShoppingItemByTripId(tripId: UUID): Flow<List<ShoppingItem>>

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   fun insert(item: ShoppingItem)

   @Delete
   fun deleteItem(item: ShoppingItem)
}