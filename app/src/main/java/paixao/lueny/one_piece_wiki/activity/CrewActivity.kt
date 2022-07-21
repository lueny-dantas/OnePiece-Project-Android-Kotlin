package paixao.lueny.one_piece_wiki.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.data.CharactersProvider
import paixao.lueny.one_piece_wiki.recyclerview.adapter.Characters
import paixao.lueny.one_piece_wiki.recyclerview.adapter.ProductListAdapter

class CrewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crew)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val characters = CharactersProvider.retrieveCharacters()
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductListAdapter(this, characters)
    }

    private fun navigateToCrewActivity() {
        val intentOfCrewActivity = Intent(this, CrewActivity::class.java)
        startActivity(intentOfCrewActivity)
    }
}


