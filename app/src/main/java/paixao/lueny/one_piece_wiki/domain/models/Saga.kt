package paixao.lueny.one_piece_wiki.domain.models

import java.io.Serializable

data class Saga(
    val name: String,
    val image: Int,
    val beginningEpisode: String,
    val endEpisode: String,
    val titleResume: String,
    val resume: String,
    val titleArcs: String,
    val arcs: List<Arc>,
): Serializable
