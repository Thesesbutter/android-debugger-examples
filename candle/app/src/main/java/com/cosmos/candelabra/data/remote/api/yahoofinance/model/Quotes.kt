package com.cosmos.candelabra.data.remote.api.yahoofinance.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Quotes(
    @Json(name = "quoteResponse")
    val quoteResponse: QuoteResponse
)
