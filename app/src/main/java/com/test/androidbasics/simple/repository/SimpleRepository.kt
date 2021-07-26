package com.test.androidbasics.simple.repository


class SimpleRepositoryImpl : SimpleRepository {
    override val text: String = "SimpleRepository text"

}

interface SimpleRepository {
    val text: String
}