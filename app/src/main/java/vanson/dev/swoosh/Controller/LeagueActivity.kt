package vanson.dev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import vanson.dev.swoosh.Utilities.EXTRA_LEAGUE
import vanson.dev.swoosh.R

class LeagueActivity : BaseActivity() {
    var selectLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view: View){
        if(selectLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
    fun onMensClicked(view: View){
        wonmensBtn.isChecked = false
        coBtn.isChecked = false
        if(mensBtn.isChecked){
            selectLeague = "mens"
        }else{
            selectLeague = ""
        }
    }

    fun onWomensClicked(view: View){
        mensBtn.isChecked = false;
        coBtn.isChecked = false;
//        selectLeague = "womens"
        if(wonmensBtn.isChecked){
            selectLeague = "womens"
        }else{
            selectLeague = ""
        }
    }

    fun onCoClicked(view: View){
        mensBtn.isChecked = false;
        wonmensBtn.isChecked = false;
//        selectLeague = "co-ed"
        if(coBtn.isChecked){
            selectLeague = "co-ed"
        }else{
            selectLeague = ""
        }
    }
}