package dev.relay7.core.dto

data class OutboundTrafficStat(
    val tag: String,
    val direction: String,
    val value: Long,
)