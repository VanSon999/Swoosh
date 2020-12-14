package vanson.dev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import vanson.dev.swoosh.Model.Player
//import vanson.dev.swoosh.Utilities.EXTRA_LEAGUE
import vanson.dev.swoosh.R
import vanson.dev.swoosh.Utilities.EXTRA_PLAYER

//import vanson.dev.swoosh.Utilities.EXTRA_SKIll

class SkillActivity : BaseActivity() {
//    var league = ""
//    var skill =""
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = if(savedInstanceState != null){
            savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }else{
            player
        }
    }
    fun onFinishClicked(view: View){
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View){
        ballerBtn.isChecked = false
        if (beginnerBtn.isChecked) {
            player.skill = "beginner"
        }else{
            player.skill = ""
        }
    }

    fun onBallerClicked(view: View){
        beginnerBtn.isChecked = false
        if(ballerBtn.isChecked) {
            player.skill = "baller"
        }else{
            player.skill = ""
        }
    }
}