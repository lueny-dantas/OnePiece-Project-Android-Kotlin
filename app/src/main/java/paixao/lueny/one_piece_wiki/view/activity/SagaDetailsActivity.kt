package paixao.lueny.one_piece_wiki.view.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Saga
import paixao.lueny.one_piece_wiki.view.adapters.ArcsAdapter

class SagaDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saga_details)

        val saga = intent.getSerializableExtra("saga") as? Saga
        if (saga != null) {
            val imageView = findViewById<ImageView>(R.id.sagaDetailsImage)
            val nameView = findViewById<TextView>(R.id.sagaDetailsName)
            val beginningEpisodeView = findViewById<TextView>(R.id.sagaDetailsBeginningEpisode)
            val endEpisodeView = findViewById<TextView>(R.id.sagaDetailsEndEpisode)
            val resumeTitleView = findViewById<TextView>(R.id.sagaDetailsTitleResume)
            val resumeView = findViewById<TextView>(R.id.sagaDetailsResume)
            val arcTitleView = findViewById<TextView>(R.id.sagaDetailsTitleArc)
            val arcsView = findViewById<RecyclerView>(R.id.arcsRecyclerView)

            imageView.setImageResource(saga.image)
            nameView.text = saga.name
            beginningEpisodeView.text = saga.beginningEpisode
            endEpisodeView.text = saga.endEpisode
            resumeTitleView.text = saga.titleResume
            resumeView.text = saga.resume
            arcTitleView.text = saga.titleArcs
            arcsView.adapter = ArcsAdapter(this, saga.arcs)

        }
    }
}