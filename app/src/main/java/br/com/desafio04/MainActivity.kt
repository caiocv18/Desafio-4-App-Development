package br.com.desafio04

import android.icu.text.DateFormat
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var listView : ListView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itens : ArrayList<Item> = ArrayList()
        val dataHoraAtual = Date()
        val data = SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual)
        itens.add(Item("Notebook", 1600.00, "Brasília", data))
        itens.add(Item("Computador", 2500.00,"Rio de Janeiro", data))
        itens.add(Item("Carro", 72000.00,"Porto Alegre", data))

        val arrayImagens = arrayOf(R.drawable.notebook, R.drawable.computador, R.drawable.carro)

        val adapter = CustomAdapter(this, itens, arrayImagens)
        listView = findViewById(R.id.id_list_view_activity_main)
        listView.adapter = adapter
    }
}