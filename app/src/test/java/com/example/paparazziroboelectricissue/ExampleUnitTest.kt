package com.example.paparazziroboelectricissue

import androidx.compose.material3.Text
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
        // ...see docs for more options
    )

    @Test
    fun addition_isCorrect() {
        paparazzi.snapshot {
            Text("hello")
        }
    }
}