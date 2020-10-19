package com.bb.serializationbenchmark

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.bb.serializationbenchmark.data.Program
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.*

class MainViewModel {

    fun prepareJsonString(jsonString: String?, size: Int = 1): String {

        val gson = Gson()
        val itemType = object : TypeToken<List<Program>>() {}.type
        val itemList = gson.fromJson<List<Program>>(jsonString, itemType)

        val finalList = mutableListOf<Program>().apply {
            repeat(size) { this.add(itemList[0]) }
        }
        return gson.toJson(finalList)
    }


    fun toObjectKotlin(jsonString: String): List<Program> {
        return Json.decodeFromString(ListSerializer(Program.serializer()), jsonString)
    }

    fun toObjectGson(jsonString: String): List<Program> {
        val gson = Gson()
        val itemType = object : TypeToken<List<Program>>() {}.type
        return gson.fromJson(jsonString, itemType)
    }

    fun toStringKotlin(data: List<Program>): String {
        return Json.encodeToString(ListSerializer(Program.serializer()), data)
    }

    fun toStringGson(data: List<Program>): String {
        return Gson().toJson(data)
    }

}