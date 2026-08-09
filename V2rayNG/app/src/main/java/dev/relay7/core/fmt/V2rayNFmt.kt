package dev.relay7.core.fmt

import dev.relay7.core.AppConfig
import dev.relay7.core.dto.V2rayNShareItem
import dev.relay7.core.dto.entities.ProfileItem
import dev.relay7.core.util.JsonUtil
import dev.relay7.core.util.LogUtil
import dev.relay7.core.util.Utils

object V2rayNFmt : FmtBase() {
    fun parse(str: String): ProfileItem? {
        try {
            val jsonBase64Payload = str.substringAfterLast('/')
            val jsonPayload = Utils.decode(jsonBase64Payload)
            val v2rayNShareItem = JsonUtil.fromJson(jsonPayload, V2rayNShareItem::class.java)
            return v2rayNShareItem?.toProfileItem()
        } catch (e: Exception) {
            LogUtil.e(AppConfig.TAG, "Failed to parse V2rayN format", e)
        }
        return null
    }
}