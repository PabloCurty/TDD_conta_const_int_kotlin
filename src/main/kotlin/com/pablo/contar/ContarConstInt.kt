package com.pablo.contar

import java.lang.reflect.Field
import java.lang.reflect.Modifier
import java.math.BigInteger

class ContarConstInt {

    val integerTypes = listOf(Int::class.java, Int::class.javaPrimitiveType,
                              Long::class.java, Long::class.javaPrimitiveType,
                              Short::class.java, Short::class.javaPrimitiveType,
                              Byte::class.java, Byte::class.javaPrimitiveType,
                              BigInteger::class.java, BigInteger::class.javaPrimitiveType
                            )


    fun contar(clazz: Class<*>): Int {
        val fields = clazz.declaredFields.asList()
        var count = 0
        for (field in fields){
            if(isIntegerField(field)){
                println("Int Constant: $field")
                count ++
            }

        }
        return count
    }

    private fun isIntegerField(field: Field): Boolean =
        integerTypes.contains(field.type)
                || Modifier.isStatic(field.modifiers)
                || Modifier.isFinal(field.modifiers)
}
