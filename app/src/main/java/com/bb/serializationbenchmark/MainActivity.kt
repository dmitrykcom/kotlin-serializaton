package com.bb.serializationbenchmark

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


class MainActivity : AppCompatActivity() {
    @ExperimentalTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = MainViewModel()

        val jsonString = viewModel.prepareJsonString(loadJSONFromAsset(), 40)
        var time = 0.0
        for (i in 0..50) {
            time += measureTime { viewModel.toObjectKotlin(jsonString) }.inMilliseconds
        }
        val medTimeKotlin = time / 50

        time = 0.0

        for (i in 0..50) {
            time += measureTime { viewModel.toObjectGson(jsonString) }.inMilliseconds
        }

        val medTimeGson = time / 50

        println("+_+_ Kotlin: $medTimeKotlin, GSON: $medTimeGson")




//        val gsonTimeDecode = measureTime { viewModel.toObjectGson(jsonString) }
//        val kotlinTimeDecode = measureTime { data = viewModel.toObjectKotlin(jsonString) }
//        val gsonTimeEncode = measureTime { viewModel.toStringGson(data) }
//        val kotlinTimeEncode = measureTime { viewModel.toStringKotlin(data) }
    }

    private fun loadJSONFromAsset(): String? {
        var json: String? = null
        json = try {
            val inputStream: InputStream = assets.open("large-file.json")
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