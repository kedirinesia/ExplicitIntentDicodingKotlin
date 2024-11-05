package com.example.explicitintent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class person (
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
): Parcelable