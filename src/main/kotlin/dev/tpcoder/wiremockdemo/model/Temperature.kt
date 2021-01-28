package dev.tpcoder.wiremockdemo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Temperature(
        val temp: Double,
        val pressure: Int,
        val humidity: Int,
        @JsonProperty("temp_min") val tempMin: Long,
        @JsonProperty("temp_max") val tempMax: Long)
