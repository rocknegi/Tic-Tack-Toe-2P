package com.zzmachine.rocknegi.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reset(view:View){
        button1.text=""
        button2.text=""
        button3.text=""
        button4.text=""
        button5.text=""
        button6.text=""
        button7.text=""
        button8.text=""
        button9.text=""
        button1.setBackgroundColor(Color.WHITE)
        button2.setBackgroundColor(Color.WHITE)
        button3.setBackgroundColor(Color.WHITE)
        button4.setBackgroundColor(Color.WHITE)
        button5.setBackgroundColor(Color.WHITE)
        button6.setBackgroundColor(Color.WHITE)
        button7.setBackgroundColor(Color.WHITE)
        button8.setBackgroundColor(Color.WHITE)
        button9.setBackgroundColor(Color.WHITE)

    }



     fun onClickEvent(view: View) {
        val buttonSelected = view as Button
        var selectId = 0
        when (buttonSelected.id) {
            R.id.button1 -> selectId = 1
            R.id.button2 -> selectId = 2
            R.id.button3 -> selectId = 3
            R.id.button4 -> selectId = 4
            R.id.button5 -> selectId = 5
            R.id.button6 -> selectId = 6
            R.id.button7 -> selectId = 7
            R.id.button8 -> selectId = 8
            R.id.button9 -> selectId = 9

        }
       // Toast.makeText(this, "ID:" + selectId, Toast.LENGTH_LONG).show()
        playGame(selectId,buttonSelected)

    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer=1
    fun playGame(selectId:Int,buttonSelected:Button){

        if (activePlayer==1){
            buttonSelected.text="X"

            buttonSelected.setBackgroundColor(Color.GREEN)
            player1.add(selectId)
            activePlayer=2
        }
        else{
            buttonSelected.text="O"
            buttonSelected.setBackgroundColor(Color.RED)
            player2.add(selectId)
            activePlayer=1
        }


        buttonSelected.isEnabled=false
        checkWinner()

    }

    fun checkWinner(){
        var winner =-1


        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3))
            winner=1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7))
            winner=1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9))
            winner=1
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7))
            winner=1
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9))
            winner=1
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8))
            winner=1
        if(player1.contains(7)&&player1.contains(5)&&player1.contains(3))
            winner=1
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9))
            winner=1



        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3))
            winner=2
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7))
            winner=2
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9))
            winner=2
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7))
            winner=2
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9))
            winner=2
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8))
            winner=2
        if(player2.contains(7)&&player2.contains(5)&&player2.contains(3))
            winner=2
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9))
            winner=2

        if(winner==1)
            Toast.makeText(this,"player 1 won the game",Toast.LENGTH_SHORT).show()

        if(winner==2)
            Toast.makeText(this,"player 2 won the game",Toast.LENGTH_SHORT).show()


    }



}

























