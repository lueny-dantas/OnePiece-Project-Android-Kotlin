package paixao.lueny.one_piece_wiki.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.data.CharactersProvider
import paixao.lueny.one_piece_wiki.view.adapters.CharactersAdapter
import paixao.lueny.one_piece_wiki.domain.models.Character
import paixao.lueny.one_piece_wiki.view.NavigationParams

class CrewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crew)
        setupCrewContent()
        setupToolbar()
    }

    private fun setupCrewContent() {
        val characters = CharactersProvider.retrieveCharacters()
        val recyclerView = findViewById<RecyclerView>(R.id.crewRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CharactersAdapter(
            context = this,
            characters = characters,
            onClick = { character ->
                navigateToCharacterDetailsActivity(character)
            }
        )
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.crewToolbar)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    private fun navigateToCharacterDetailsActivity(character: Character) {
        val intentOfCharacterDetailsActivity = Intent(this, CharacterDetailsActivity::class.java)
        intentOfCharacterDetailsActivity.putExtra(NavigationParams.CHARACTER_PARAMS, character)
        startActivity(intentOfCharacterDetailsActivity)

    }
}


