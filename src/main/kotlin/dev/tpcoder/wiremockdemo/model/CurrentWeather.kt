package dev.tpcoder.wiremockdemo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CurrentWeather(@JsonProperty("main") var details: Temperature)

