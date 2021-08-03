package com.test.androidbasics.simple.repository


open class SimpleRepositoryImpl : SimpleRepository {
    override val text: String = "SimpleRepository text"

}

interface SimpleRepository {
    val text: String
}