package paixao.lueny.one_piece_wiki

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val toolbar = findViewById<Toolbar>(R.id.homeToolbar)
        val buttonCrew = findViewById<Button>(R.id.homeCrewButton)
        val buttonSeason = findViewById<Button>(R.id.homeSeasonButton)

        buttonCrew.setOnClickListener {
            navigateToCrewActivity()
        }
    }

    private fun navigateToCrewActivity(){
        val intentOfCrewActivity = Intent(this, CrewActivity::class.java)
        startActivity(intentOfCrewActivity)
    }
}