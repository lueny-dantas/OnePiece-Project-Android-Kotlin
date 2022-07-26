package paixao.lueny.one_piece_wiki.view.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Character

class CharacterDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_details)

        val character = intent.getSerializableExtra("character") as? Character
        if (character != null) {
            val imageView = findViewById<ImageView>(R.id.characterDetailsImage)
            imageView.setImageResource(character.image)
            val nameView = findViewById<TextView>(R.id.characterDetailsName)
            nameView.text = character.name
            val roleView = findViewById<TextView>(R.id.characterDetailsRole)
            roleView.text = character.role
            val rewardView= findViewById<TextView>(R.id.characterDetailsReward)
            rewardView.text = character.reward
            val akumanoMiView = findViewById<TextView>(R.id.characterDetailsAkumanoMi)
            akumanoMiView.text = character.akumanoMi
            val powersView = findViewById<TextView>(R.id.characterDetailsPowers)
            powersView.text = character.powers

        }
    }
}


