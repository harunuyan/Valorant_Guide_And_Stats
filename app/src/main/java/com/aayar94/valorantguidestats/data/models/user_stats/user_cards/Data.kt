package com.aayar94.valorantguidestats.data.models.user_stats.user_cards

data class Data(
    val account_level: Int,
    val card: Card,
    val last_update: String,
    val last_update_raw: Int,
    val name: String,
    val puuid: String,
    val region: String,
    val tag: String
)