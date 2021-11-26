package br.com.desafio04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var listView : ListView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itens : ArrayList<Item> = ArrayList()
        val carro = Item()
        val prato = Item()
        val chuveiro = Item()
        carro.title = "Carro"
        carro.place = "Brasília"
        prato.title = "Prato"
        prato.place = "Londres"
        chuveiro.title = "Chuveiro"
        chuveiro.place = "São Paulo"
        itens.add(carro)
        itens.add(prato)
        itens.add(chuveiro)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itens)
        listView = findViewById(R.id.id_list_view_activity_main)
        listView.adapter = adapter
    }
}