package paixao.lueny.one_piece_wiki.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import paixao.lueny.one_piece_wiki.R

class ProductListAdapter (
    private val context: Context,
    private val characters: List<Characters>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(View: View) : RecyclerView.ViewHolder(View)

    private fun RecyclerView.ViewHolder.bind(character: Characters) {
        val imageView = itemView.findViewById<ImageView>(R.id.characterImage)
        imageView.setImageResource(character.image)
        val textView = itemView.findViewById<TextView>(R.id.characterName)
        textView.text = character.name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_character_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character)
    }

    override fun getItemCount(): Int {
        return characters.size
    }
}