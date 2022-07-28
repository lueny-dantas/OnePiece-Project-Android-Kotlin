package paixao.lueny.one_piece_wiki.domain.models

import java.io.Serializable

data class Character(
    val image: Int,
    val name: String,
    val roleTitle: String,
    val role: String,
    val akumanoMiTilte: String,
    val akumanoMi: String,
    val powersTitle: String,
    val powers: String,
    val rewardTitle: String,
    val reward: String
): Serializable {
}