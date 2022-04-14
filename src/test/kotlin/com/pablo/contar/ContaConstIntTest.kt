package com.pablo.contar

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ContaConstIntTest {

    private val contarConstInt: ContarConstInt = ContarConstInt()

    @Test
    fun contaIntFinalTest(){
        Assertions.assertEquals(2, contarConstInt.contar(Class1::class.java))
    }
}

internal class Class1{
    val CONST1 = 1
    val CONST2 = 2
}