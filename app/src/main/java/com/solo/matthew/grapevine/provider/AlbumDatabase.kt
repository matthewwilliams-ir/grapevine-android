package com.solo.matthew.grapevine.provider

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * @author Matthew Williams
 */
class AlbumDatabase(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "album.db"
    }

    private val createSQL = "CREATE TABLE " + AlbumEntry.TABLE_NAME + " (" +
            AlbumEntry.ID + " INTEGER PRIMARY KEY," +
            AlbumEntry.COLUMN_NAME_TITLE + " TEXT," +
            AlbumEntry.COLUMN_NAME_RELEASE_DATE + " DATE," +
            AlbumEntry.COLUMN_NAME_CONFIRMED + " INTEGER," +
            AlbumEntry.COLUMN_NAME_TOTAL + " INTEGER" + ")"

    private val deleteSQL = "DROP TABLE IF EXISTS " + AlbumEntry.TABLE_NAME

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(createSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(deleteSQL)
        onCreate(db)
    }
}