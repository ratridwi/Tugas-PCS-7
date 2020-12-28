package com.appkucing.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val provinsi: String = "",
    val kasusPosi: String = "",
    val kasusSemb: String = "",
    val kasusMeni: String = ""
) : Parcelable
