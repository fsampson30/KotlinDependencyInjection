package com.sampson.kotlindependencyinjection

import java.util.*

class ApplicationContainer {
    val numberRepository: NumberRepository = NumberRepositoryImpl(Random())
}