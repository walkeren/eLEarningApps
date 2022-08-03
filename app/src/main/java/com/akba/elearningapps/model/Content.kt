package com.akba.elearningapps.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Content(
    @SerializedName("id_content")
    val idContent: Int? = null,
    @SerializedName("pages")
    val pages: List<Page>? = null
) : Parcelable