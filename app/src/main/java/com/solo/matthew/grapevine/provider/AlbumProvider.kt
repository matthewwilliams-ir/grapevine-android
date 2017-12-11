package com.solo.matthew.grapevine.provider

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri

/**
 * @author Matthew Williams
 */
class AlbumProvider : ContentProvider() {

    private var albumDatabase : AlbumDatabase? = null
    private val AUTHORITY = AlbumContract.CONTENT_AUTHORITY
    private val ROUTE_ENTRIES = 1
    private val ROUTE_ENTRIES_ID = 2

    private val uriMatcher : UriMatcher = UriMatcher(UriMatcher.NO_MATCH)

    override fun onCreate(): Boolean {
        albumDatabase = AlbumDatabase(context)
        uriMatcher.addURI(AUTHORITY, "albums", ROUTE_ENTRIES)
        uriMatcher.addURI(AUTHORITY, "albums/*", ROUTE_ENTRIES_ID)
        return true
    }

    override fun getType(uri: Uri?): String {
        val match = uriMatcher.match(uri)
        when (match) {
            ROUTE_ENTRIES -> return AlbumEntry.CONTENT_TYPE
            ROUTE_ENTRIES_ID -> return AlbumEntry.CONTENT_ITEM_TYPE
        }
        throw UnsupportedOperationException("Unknown uri: " + uri)
    }

    override fun query(uri: Uri?, projection: Array<out String>?, selection: String?,
                       selectionArgs: Array<out String>?, sortOrder: String?): Cursor {
        TODO("not implemented")
    }

    override fun insert(uri: Uri?, values: ContentValues?): Uri {
        TODO("not implemented")
    }

    override fun delete(uri: Uri?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented")
    }

    override fun update(uri: Uri?, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented")
    }

}