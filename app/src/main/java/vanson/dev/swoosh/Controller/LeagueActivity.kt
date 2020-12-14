package vanson.dev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import vanson.dev.swoosh.Model.Player
//import vanson.dev.swoosh.Utilities.EXTRA_LEAGUE
import vanson.dev.swoosh.R
import vanson.dev.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {
//    var selectLeague = ""
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view: View){
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
    fun onMensClicked(view: View){
        wonmensBtn.isChecked = false
        coBtn.isChecked = false
        if(mensBtn.isChecked){
            player.league = "mens"
        }else{
            player.league = ""
        }
    }

    fun onWomensClicked(view: View){
        mensBtn.isChecked = false;
        coBtn.isChecked = false;
//        selectLeague = "womens"
        if(wonmensBtn.isChecked){
            player.league = "womens"
        }else{
            player.league = ""
        }
    }

    fun onCoClicked(view: View){
        mensBtn.isChecked = false;
        wonmensBtn.isChecked = false;
//        selectLeague = "co-ed"
        if(coBtn.isChecked){
            player.league = "co-ed"
        }else{
            player.league = ""
        }
    }
}