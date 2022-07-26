package paixao.lueny.one_piece_wiki.view.activity

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
        val buttonSaga = findViewById<Button>(R.id.homeSagaButton)
        buttonSaga.setOnClickListener {
            navigateToSagaActivity()
        }
    }

    private fun navigateToCrewActivity() {
        val intentOfCrewActivity = Intent(this, CrewActivity::class.java)
        startActivity(intentOfCrewActivity)
    }

    private fun navigateToSagaActivity() {
        val intentOfSagaActivity = Intent(this, SagaActivity::class.java)
        startActivity(intentOfSagaActivity)
    }
}