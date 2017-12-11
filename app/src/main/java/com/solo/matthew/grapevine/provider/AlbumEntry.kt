package com.solo.matthew.grapevine.provider

import android.content.ContentResolver
import android.net.Uri
import android.provider.BaseColumns

/**
 * @author Matthew Williams
 */
class AlbumEntry : BaseColumns {

    companion object {
        val CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/vnd.grapevine.albums"
        val CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/vnd.grapevine.album"
        val CONTENT_URI : Uri = AlbumContract.BASE_CONTENT_URI.buildUpon().appendPath(AlbumContract.PATH_ALBUMS).build()

        val TABLE_NAME = "album"
        val ID = "_id"
        val COLUMN_NAME_TITLE = "title"
        val COLUMN_NAME_RELEASE_DATE = "release_date"
        val COLUMN_NAME_CONFIRMED = "confirmed"
        val COLUMN_NAME_TOTAL = "total"
    }

}