package vanson.dev.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import vanson.dev.swoosh.Model.Player
import vanson.dev.swoosh.R
import vanson.dev.swoosh.Utilities.EXTRA_PLAYER

//import vanson.dev.swoosh.Utilities.EXTRA_LEAGUE
//import vanson.dev.swoosh.Utilities.EXTRA_SKIll

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
//        val league = intent.getStringExtra(EXTRA_LEAGUE)
//        val skill = intent.getStringExtra(EXTRA_SKIll)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}