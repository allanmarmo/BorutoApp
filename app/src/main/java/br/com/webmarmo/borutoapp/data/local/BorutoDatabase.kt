package br.com.webmarmo.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.webmarmo.borutoapp.data.local.dao.DatabaseConverter
import br.com.webmarmo.borutoapp.data.local.dao.HeroDao
import br.com.webmarmo.borutoapp.data.local.dao.HeroRemoteKeyDao
import br.com.webmarmo.borutoapp.domain.model.Hero
import br.com.webmarmo.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}