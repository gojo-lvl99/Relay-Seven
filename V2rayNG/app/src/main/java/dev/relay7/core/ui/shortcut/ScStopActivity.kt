package dev.relay7.core.ui.shortcut

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import dev.relay7.core.core.CoreServiceManager
import dev.relay7.core.core.LauncherManager
import dev.relay7.core.ui.base.BaseComponentActivity

class ScStopActivity : BaseComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Composable
    override fun ScreenContent() {
        LaunchedEffect(Unit) {
            moveTaskToBack(true)
            if (CoreServiceManager.isRunning()) {
                LauncherManager.stopService(this@ScStopActivity)
            }
            finish()
        }
    }
}
