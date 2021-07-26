package com.test.androidbasics.simple.repository

import org.koin.dsl.module

val repositoryKoinModule = module {
    single<SimpleRepository> { SimpleRepositoryImpl() }
}