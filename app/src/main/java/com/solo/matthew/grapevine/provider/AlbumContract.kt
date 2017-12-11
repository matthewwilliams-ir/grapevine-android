package com.solo.matthew.grapevine.provider

import android.net.Uri

/**
 * @author Matthew Williams
 */

class AlbumContract() {

    companion object {
        const val CONTENT_AUTHORITY = "com.solo.matthew.grapevine"
        val BASE_CONTENT_URI : Uri = Uri.parse("content://" + CONTENT_AUTHORITY)
        const val PATH_ALBUMS = "albums"
    }

}