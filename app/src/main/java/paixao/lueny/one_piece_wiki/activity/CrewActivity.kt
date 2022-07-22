package paixao.lueny.one_piece_wiki.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.data.CharactersProvider
import paixao.lueny.one_piece_wiki.recyclerview.adapter.CharacterListAdapter
import paixao.lueny.one_piece_wiki.recyclerview.adapter.Character

class CrewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crew)

        val characters = CharactersProvider.retrieveCharacters()
        val recyclerView = findViewById<RecyclerView>(R.id.crewRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CharacterListAdapter(
            context = this,
            characters = characters,
            onClick = { character ->
                navigateToCharacterDetailsActivity(character)
            }
        )
    }

    private fun navigateToCharacterDetailsActivity(character: Character) {
        val intentOfCharacterDetailsActivity = Intent(this, CharacterDetailsActivity::class.java)
        intentOfCharacterDetailsActivity.putExtra("character", character)
        startActivity(intentOfCharacterDetailsActivity)

    }
}


