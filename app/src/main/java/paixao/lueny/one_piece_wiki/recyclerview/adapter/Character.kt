package paixao.lueny.one_piece_wiki.recyclerview.adapter

import java.io.Serializable

data class Character(
    val image: Int,
    val name: String,
    val role: String,
    val akumanoMi: String,
    val powers: String,
    val reward: String
): Serializable {
}