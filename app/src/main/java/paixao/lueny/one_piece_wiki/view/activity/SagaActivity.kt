package paixao.lueny.one_piece_wiki.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.data.SagasProvider
import paixao.lueny.one_piece_wiki.domain.models.Saga
import paixao.lueny.one_piece_wiki.view.NavigationParams
import paixao.lueny.one_piece_wiki.view.adapters.SagasAdapter

class SagaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saga)
        setupSagasContent()
        setupToolbar()
    }

    private fun setupSagasContent() {
        val recyclerView = findViewById<RecyclerView>(R.id.sagaRecyclerView)
        val sagas = SagasProvider.retrieveSagas()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SagasAdapter(
            context = this,
            sagas = sagas,
            onClick = { saga ->
                navigateToSagaDetailsActivity(saga)
            }
        )
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.sagaToolbar)

        toolbar.setNavigationOnClickListener {
            onBackPressed()

        }


    }


    private fun navigateToSagaDetailsActivity(saga: Saga) {
        val intent = Intent(this, SagaDetailsActivity::class.java)
        intent.putExtra(NavigationParams.SAGA_PARAMS, saga)
        startActivity(intent)
    }
}