package com.example.mycryptoapp.data.network.model

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

data class CoinInfoJsonContainerDto (
    @SerializedName("RAW")
    val coinPriceInfoJsonObject: JsonObject? = null
)
