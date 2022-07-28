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

class CharactersAdapter (
    private val context: Context,
    private val characters: List<Character>,
    private val onClick: (Character) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(View: View) : RecyclerView.ViewHolder(View)

    private fun RecyclerView.ViewHolder.bind(character: Character) {
        val imageView = itemView.findViewById<ImageView>(R.id.characterImage)
        val textView = itemView.findViewById<TextView>(R.id.characterName)
        val rootView = itemView.findViewById<View>(R.id.itemCharacterView)

        imageView.setImageResource(character.image)
        textView.text = character.name
        rootView.setOnClickListener{
            onClick(character)
        }
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