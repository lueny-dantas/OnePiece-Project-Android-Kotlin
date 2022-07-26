package paixao.lueny.one_piece_wiki.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.data.SagasProvider
import paixao.lueny.one_piece_wiki.domain.models.Saga
import paixao.lueny.one_piece_wiki.view.adapters.SagaListAdapter

class SagaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saga)

        val sagas = SagasProvider.retrieveSagas()
        val recyclerView = findViewById<RecyclerView>(R.id.sagaRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SagaListAdapter(
            context = this,
            sagas = sagas,
            onClick = { saga ->
                navigateToSagaDetailsActivity(saga)
            }
        )
    }

    private fun navigateToSagaDetailsActivity(saga: Saga) {
        val intentOfSagaDetailsActivity = Intent(this, SagaDetailsActivity::class.java)
        intentOfSagaDetailsActivity.putExtra("saga", saga)
        startActivity(intentOfSagaDetailsActivity)

    }
}