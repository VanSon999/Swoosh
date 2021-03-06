package vanson.dev.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import vanson.dev.swoosh.R

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}