//This app demonstrates various ways of animating movement and color change
//Written by Aaron Gordon - September, 2016 - Kotlin March, 2018

package com.example.animations


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private var cb: ChalkBoard? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        cb = ChalkBoard(this)      //Attach ChalkBoard to the Activity
        backgroundLayout.addView(cb)
        fab.setOnClickListener {
            cb!!.wander()                    //when button clicked, do animation in ChalkBoard
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Set which animation to perform on next Button click
        val id = item.itemId

        when (id) {
            R.id.raw_animation -> {
                cb!!.setStyle(ChalkBoard.RAW)
                return true
            }
            R.id.obj_animation -> {
                cb!!.setStyle(ChalkBoard.ANIMATOR)
                return true
            }
            R.id.accelorate_animation -> {
                cb!!.setStyle(ChalkBoard.ACCELERATOR)
                return true
            }
            R.id.decelorate_animation -> {
                cb!!.setStyle(ChalkBoard.DECELERATE)
                return true
            }
            R.id.bounce_animation -> {
                cb!!.setStyle(ChalkBoard.BOUNCE)
                return true
            }
            R.id.rotate_animation -> {
                cb!!.setStyle(ChalkBoard.ROTATE)
                return true
            }
            R.id.moverotate_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_ROTATE)
                return true
            }
            R.id.color_animation -> {
                cb!!.setStyle(ChalkBoard.COLOR_ACC)
                return true
            }
            R.id.movecolor_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_RECOLOR)
                return true
            }
            R.id.moverotatecolor_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_ROTATE_RECOLOR)
                return true
            }
            R.id.action_settings -> {
            }
            else -> {
            }
        }

        return super.onOptionsItemSelected(item)
    }
}