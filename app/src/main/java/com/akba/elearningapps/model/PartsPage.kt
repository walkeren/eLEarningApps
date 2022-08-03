package com.akba.elearningapps.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PartsPage(
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("type")
    val type: String? = null
) : Parcelable