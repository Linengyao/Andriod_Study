package com.example.andriod_study

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedPreferencesBtn : Button = findViewById(R.id.SharedPreferencesBtn)
        sharedPreferencesBtn.setOnClickListener{

            var intent  = Intent(this,SharedPreferencesActivity::class.java)
            startActivity(intent)
        }



//        initMsg() //初始化消息
//        val layoutManager = LinearLayoutManager(this)
//        var recycler : RecyclerView = findViewById(R.id.recycler1)
//        recycler.layoutManager = layoutManager
//        adapter = MsgAdapter(msgList)
//        recycler.adapter = adapter
//
//
//        var sendButton : Button = findViewById(R.id.sendButton)
//        var sendEditText: EditText = findViewById(R.id.sendEditText)
//        sendButton.setOnClickListener{
//            val content = sendEditText.text.toString()
//            content?.let() {
//                val msg = Msg(content, Msg.TYPE_SENT)
//                msgList.add(msg)
//                adapter?.notifyItemInserted(msgList.size - 1)
//                recycler.scrollToPosition(msgList.size - 1)
//                sendEditText.setText("")
//            }
//        }

    }




//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.add_item-> {
//                this.finish() //退出当前页面
//                android.os.Process.killProcess(android.os.Process.myPid())  //销毁进程
//            }
//            R.id.remove_item->Toast.makeText(this, "You Clicked Remove", Toast.LENGTH_SHORT)
//                .show()
//        }
//        return super.onOptionsItemSelected(item)
//    }

//    private val msgList = ArrayList<Msg>()
//    private  var adapter:MsgAdapter ?= null
//    private fun initMsg(){
//        val msg1 = Msg("Hello guy.", Msg.TYPE_RECV)
//        msgList.add(msg1)
//        val msg2 = Msg("Hello. Who is that?", Msg.TYPE_SENT)
//        msgList.add(msg2)
//        val msg3 = Msg("This is Tom. Nice talking to you. ", Msg.TYPE_RECV)
//        msgList.add(msg3)
//    }
}