package com.seekho.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by Ritik on: 09/04/25
 */


data class ErrorModel(
    @SerializedName("status")
    @Expose
    var status: Int,
    @SerializedName("type")
    @Expose
    var type: Int,

    @SerializedName("message")
    @Expose
    var message: String,

    @SerializedName("error")
    @Expose
    var error: String
)