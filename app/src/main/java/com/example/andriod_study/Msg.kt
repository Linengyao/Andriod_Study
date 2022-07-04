package com.example.andriod_study

class Msg(val content:String, val type:Int) {
    companion object{
        const val TYPE_RECV = 0
        const val TYPE_SENT = 1
    }
}