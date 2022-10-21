package com.example.bslist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bslist.database.shoppinglist.ShoppingDao
import com.example.bslist.database.shoppinglist.ShoppingItem
import com.example.bslist.database.trip.Trip
import com.example.bslist.database.trip.TripDao


/**
 * @author : Mingaleev D
 * @data : 20/10/2022
 */
@Database(entities = [ShoppingItem::class, Trip::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

   abstract fun shoppingDao(): ShoppingDao
   abstract fun tripDao(): TripDao

   companion object {
      @Volatile
      private var INSTANCE: AppDatabase? = null

      fun getDatabase(context: Context): AppDatabase {
         return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
               context,
               AppDatabase::class.java,
               "app_database"
            )
               .build()
            INSTANCE = instance
            instance
         }
      }
   }
}
