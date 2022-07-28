package paixao.lueny.one_piece_wiki.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Arc
import paixao.lueny.one_piece_wiki.domain.models.Saga

class ArcsAdapter(
    private val context: Context,
    private val arcs: List<Arc>,
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(View: View): RecyclerView.ViewHolder(View)
    private fun RecyclerView.ViewHolder.bind (arc: Arc) {
        val nameView = itemView.findViewById<TextView>(R.id.arcName)
        val beginningEpView = itemView.findViewById<TextView>(R.id.arcBeginningEpisode)
        val endEpView = itemView.findViewById<TextView>(R.id.arcEndEpisode)

        nameView.text = arc.name
        beginningEpView.text = arc.beginningEpisode
        endEpView.text = arc.endEpisode
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_arc_list, parent, false)
        return SagasAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val arc = arcs [position]
        holder.bind(arc)
    }

    override fun getItemCount(): Int {
        return arcs.size
    }
}
