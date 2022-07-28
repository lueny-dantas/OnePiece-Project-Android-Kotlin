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
            val nameView = findViewById<TextView>(R.id.characterDetailsName)
            val roleTitle = findViewById<TextView>(R.id.characterDetailsRoleTitle)
            val roleView = findViewById<TextView>(R.id.characterDetailsRole)
            val rewardTitleView= findViewById<TextView>(R.id.characterDetailsRewardTitle)
            val rewardView= findViewById<TextView>(R.id.characterDetailsReward)
            val akumanoMiTitleView = findViewById<TextView>(R.id.characterDetailsAkumanoMiTitle)
            val akumanoMiView = findViewById<TextView>(R.id.characterDetailsAkumanoMi)
            val powersTitleView = findViewById<TextView>(R.id.characterDetailsPowersTitle)
            val powersView = findViewById<TextView>(R.id.characterDetailsPowers)

            imageView.setImageResource(character.image)
            nameView.text = character.name
            roleTitle.text = character.roleTitle
            roleView.text = character.role
            rewardTitleView.text = character.rewardTitle
            rewardView.text = character.reward
            akumanoMiTitleView.text = character.akumanoMiTilte
            akumanoMiView.text = character.akumanoMi
            powersTitleView.text = character.powersTitle
            powersView.text = character.powers

        }
    }
}


