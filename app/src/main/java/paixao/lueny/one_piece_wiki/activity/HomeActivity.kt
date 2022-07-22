package paixao.lueny.one_piece_wiki.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import paixao.lueny.one_piece_wiki.R


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val toolbar = findViewById<Toolbar>(R.id.homeToolbar)
        val buttonCrew = findViewById<Button>(R.id.homeCrewButton)
        buttonCrew.setOnClickListener {
            navigateToCrewActivity()
        }
        val buttonSeason = findViewById<Button>(R.id.homeSeasonButton)
    }

    private fun navigateToCrewActivity(){
        val intentOfCrewActivity = Intent(this, CrewActivity::class.java)
        startActivity(intentOfCrewActivity)
    }
}