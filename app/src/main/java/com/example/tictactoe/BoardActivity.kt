package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
    }

    fun onBackMain(view: View) {
        onBackPressed()
    }
    var player = 1
    fun playGame(view: View) {
        val player1Name = intent.getStringExtra(FIRST_PLAYER_NAME)
        val player2Name = intent.getStringExtra(SECOND_PLAYER_NAME)
        var cellList = arrayOf(cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9)
        for (i in cellList.indices){
            if (cellList[i].tag == view.tag){
                if (player == 1){
                    cellList[i].text = "X"
                    cellList[i].isEnabled= false
                    player = 2
                    playersBanner.text= "$player1Name's turn"
                }else{
                    cellList[i].text="O"
                    cellList[i].isEnabled =false
                    player=1
                    playersBanner.text= "$player2Name's turn"
                }
            }
        }
    }

}