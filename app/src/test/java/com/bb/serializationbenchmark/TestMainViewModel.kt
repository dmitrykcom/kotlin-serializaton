package com.bb.serializationbenchmark

import android.os.Build
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class TestMainViewModel {

    @ExperimentalTime
    @Test
    fun testKotlin() {
        val viewModel = MainViewModel()
        val jsonString = viewModel.prepareJsonString(loadJSONFromAsset(), 150)
        var kotlinTimeDecode = measureTime { viewModel.toObjectKotlin(jsonString) }.inMilliseconds
        println(kotlinTimeDecode)
    }

    @ExperimentalTime
    @Test
    fun testGson() {
        val viewModel = MainViewModel()
        val jsonString = viewModel.prepareJsonString(loadJSONFromAsset(), 150)
        val gsonTimeDecode = measureTime { viewModel.toObjectGson(jsonString) }.inMilliseconds
        println(gsonTimeDecode)
    }

    private fun loadJSONFromAsset(): String? {
        var json: String? = null
        json = try {
            val inputStream: InputStream =
                RuntimeEnvironment.application.assets.open("large-file.json")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charset.defaultCharset())
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }

}