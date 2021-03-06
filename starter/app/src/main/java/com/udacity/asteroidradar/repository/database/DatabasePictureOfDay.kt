package com.udacity.asteroidradar.repository.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.udacity.asteroidradar.repository.api.PictureOfDay

@Entity
data class DatabasePictureOfDay (
        @PrimaryKey(autoGenerate = false)
        var id: Long,
        @ColumnInfo(name = "media_type")
        val mediaType: String,
        val title: String,
        val url: String
)

fun DatabasePictureOfDay.asDomainModel(): PictureOfDay {
    return PictureOfDay(mediaType, title, url)
}