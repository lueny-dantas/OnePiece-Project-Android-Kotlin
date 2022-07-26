package paixao.lueny.one_piece_wiki.view.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Character
import paixao.lueny.one_piece_wiki.domain.models.Saga

class SagaDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saga_details)

        val saga = intent.getSerializableExtra("saga") as? Saga
        if (saga != null) {
            val imageView = findViewById<ImageView>(R.id.sagaDetailsImage)
            imageView.setImageResource(saga.image)
            val nameView = findViewById<TextView>(R.id.sagaDetailsName)
            nameView.text = saga.name
            val beginningEpisodeView = findViewById<TextView>(R.id.sagaDetailsBeginningEpisode)
            beginningEpisodeView.text = saga.beginningEpisode
            val endEpisodeView = findViewById<TextView>(R.id.sagaDetailsEndEpisode)
            endEpisodeView.text = saga.endEpisode
            val resumeView = findViewById<TextView>(R.id.sagaDetailsResume)
            resumeView.text = saga.resume
            val arcsView = findViewById<TextView>(R.id.sagaDetailsArcs)
            arcsView.text = saga.arcs.toString()

        }
    }
}