package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {


        val cliente = Cliente("Lucas")
        val cartao = Cartao("5245354345")

        return  Conta(
            "1220245-5",
            "0606",
            "R$ 1.850,00",
            "R$ 3.000,00",
            cliente,
            cartao
        )


    }
}