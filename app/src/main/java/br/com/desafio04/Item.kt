package br.com.desafio04

import android.icu.text.DateFormat
import android.media.Image

class Item() {
    //val image : Image = TODO()
    var title : String = "empty"
    var date : DateFormat = DateFormat.getDateInstance()
    var place : String = "anywhere"

    init {
        //this.image = image
    }
}