package paixao.lueny.one_piece_wiki.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Character
import paixao.lueny.one_piece_wiki.domain.models.Saga

class SagasAdapter (
    private val context: Context,
    private val sagas: List<Saga>,
    private val onClick: (Saga) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(View: View) : RecyclerView.ViewHolder(View)

    private fun RecyclerView.ViewHolder.bind(saga: Saga) {
        val imageView = itemView.findViewById<ImageView>(R.id.sagaImage)
        imageView.setImageResource(saga.image)
        val textView = itemView.findViewById<TextView>(R.id.sagaName)
        textView.text = saga.name
        val rootView = itemView.findViewById<View>(R.id.itemSagaView)
        rootView.setOnClickListener{
            onClick(saga)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_saga_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val saga = sagas [position]
        holder.bind(saga)
    }

    override fun getItemCount(): Int {
        return sagas.size
    }
}