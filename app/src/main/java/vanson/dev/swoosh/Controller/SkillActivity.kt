package vanson.dev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import vanson.dev.swoosh.Utilities.EXTRA_LEAGUE
import vanson.dev.swoosh.R
import vanson.dev.swoosh.Utilities.EXTRA_SKIll

class SkillActivity : BaseActivity() {
    var league = ""
    var skill =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }

    fun onFinishClicked(view: View){
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKIll,skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View){
        ballerBtn.isChecked = false
        if (beginnerBtn.isChecked) {
            skill = "beginner"
        }else{
            skill = ""
        }
    }

    fun onBallerClicked(view: View){
        beginnerBtn.isChecked = false
        if(ballerBtn.isChecked) {
            skill = "baller"
        }else{
            skill = ""
        }
    }
}