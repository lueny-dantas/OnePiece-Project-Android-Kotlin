package paixao.lueny.one_piece_wiki.data

import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Arc
import paixao.lueny.one_piece_wiki.domain.models.Saga

object SagasProvider {
    fun retrieveSagas() =
        listOf(
            Saga(
                "Saga East Blue",
                image = R.drawable.saga1,
                "Beginning Episode: 01",
                "End Episode: 61",
                "Resume: A saga que apresentou Luffy ao mundo, a chamada Saga East Blue. Ela mostra o personagem ainda criança vivendo em East Blue e no início do recrutamento de tripulantes para ele caçar o One Piece e tentar se tornar o Rei dos Piratas. ",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Romance Dawn (ou Arco do Capitão Morgan): episódios 1 ao 4;\n" +
                                "Arco Orange Town (ou Arco do Buggy, o palhaço): episódios 5 ao 8;\n" +
                                "Arco Vila Syrup: episódios 9 ao 18;\n" +
                                "Arco Baratie: episódios 19 ao 30;\n" +
                                "Arco Arlong Park: episódios 31 ao 44;\n" +
                                "Arco Bando do Buggy: Após a Batalha!: episódios 46 e 47;\n" +
                                "Arco Loguetown: episódios 45 e 48 ao 53;\n" +
                                "Arco Dragão Milenar: episódios 54 ao 61 (arco filler)"
                    )
                ),
            ),
            Saga(
                "Saga Alabasta",
                image = R.drawable.saga2,
                "Beginning Episode: 62",
                "End Episode: 135",
                "Resume: A segunda saga, intitulada Alabasta (ou Baroque Works) Luffy e sua tripulação segue na busca pelo One Piece, na tentativa do rapaz se tornar o Rei dos Piratas. Entretanto, eles precisam ajudar a Nefertari Vivi à chegar na sua pátria antes que uma guerra se inicie. O problema é que uma organização mal intencionada vai fazer de tudo para impedir Luffy e seus amigos de chegar em Alabasta.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Reverse Mountain: episódios 62 e 63;\n" +
                                "Arco Whiskey Peak: episódios 64 ao 67;\n" +
                                "Arco Coby e Helmeppo: episódios 68 e 69;\n" +
                                "Arco Little Garden: episódios 70 ao 77;\n" +
                                "Arco Ilha Drum: episódios 78 ao 91;\n" +
                                "Arco Alabasta: episódios 92 ao 130;\n" +
                                "Arco Pós-Alabasta: episódios 131 ao 135 (arco filler)"
                    )
                )
            ),
            Saga(
                "Saga Skypiea",
                image = R.drawable.saga3,
                "Beginning Episode: 136",
                "End Episode: 206 ",
                "Resume: A terceira saga de One Piece, intitulada Skypieia, os Chapéus de Palha seguem em sua aventura. Porém Luffy e os outros se deparam com uma terra cheia de mistérios e envolvida em uma guerra que pode destruir de uma vez Skypiera. Esse é um dos arcos que já começam com fillers logo no início da saga. ",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Ilha dos Carneiros: episódios 136 ao 138 (arco filler);\n" +
                                "Arco Névoa Arco-Íris: episódios 139 ao 143 (arco filler);\n" +
                                "Arco Jaya: episódios 144 ao 152;\n" +
                                "Arco Skypiea: episódios 153 ao 195;\n" +
                                "Arco G-8: episódios 196 ao 206 (arco filler)"
                    )
                )
            ),
            Saga(
                "Saga Water 7",
                image = R.drawable.saga4,
                "Beginning Episode: 207",
                "End Episode: 325 ",
                "Resume: Water 7 é a quarta saga de One Piece, conhecia também por Saga Enies Lobby ou Saga CP9. Desta vez, os piratas já estão em mar aberto novamente e irão enfrentar alguns perigos em sua empreitada na busca do One Piece. Um deles é o trapaceiro Foxy, além de um dos três Mirantes da Marinha, chamado Aokiji. Luffy precisa chegar a Water 7 para encontrar um carpinteiro que se junte a sua tripulação e conserte seu navio.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Davy Back Fight (ou Arco Long Ring Long Land): episódios 207 ao 219;\n" +
                                "Arco Sonho do Oceano: episódios 220 ao 224 (arco filler);\n" +
                                "Arco Retorno de Foxy: episódios 225 e 226 (arco semi-filler);\n" +
                                "Arco Water 7: episódios 227 ao 265;\n" +
                                "Arco Enies Lobby: episódios 266 ao 312;\n" +
                                "Arco Pós-Enies Lobby: episódios 313 ao 325;"
                    )
                )
            ),
            Saga(
                "Saga Thriller Bark",
                image = R.drawable.saga5,
                "Beginning Episode: 326",
                "End Episode: 384 ",
                "Resume: Na quinta saga do anime, Luffy e os tripulantes acabam desembarcando em uma ilha fantasma chamada Thriller Bark. No local, um estranho personagem usa a sombra de Luffy para reviver Oars, um lendário gigante. Com a ajuda de Brook, um esqueleto, Luffy e os outros Chapéus de Palha terão que enfrentar Oars e aquele que lhe trouxe de volta a vida.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Adorável Terra: episódios 326 ao 336 (arco filler);\n" +
                                "Arco Thriller Bark: episódios 337 ao 381;\n" +
                                "Arco Ilha Spa: episódios 382 ao 384 (arco filler)"
                    )
                )
            ),
            Saga(
                "Saga Guerra de Marineford",
                image = R.drawable.saga6,
                "Beginning Episode: 385",
                "End Episode: 516",
                "Resume: Conhecida também como Saga Cúpula da Guerra, a Guerra de Marineford marca o final da primeira metade do anime. Neste ponto da trama, Luffy e os outros Piratas do Chapéu de Palha são separados no Arquipélago de Sabaody. E é aqui que as coisas parecem se tornar um pouco mais difíceis pra Luffy e os outros.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Arquipélago Sabaody: episódios 385 ao 407;\n" +
                                "Arco Amazon Lily: episódios 408 ao 421;\n" +
                                "Arco Impel Down: episódios 422 ao 425;\n" +
                                "Arco Pequeno-oriente Azul: episódios 426 ao 429; (arco filler)\n" +
                                "Arco Impel Down: episódios 430 ao 456 (continuação pós-filler);\n" +
                                "Arco Marineford: episódios 457 ao 489;\n" +
                                "Arco Pós-Marineford: episódios 490 ao 516"
                    )
                )
            ),
            Saga(
                "Saga Ilha dos Homens-Peixe",
                image = R.drawable.saga7,
                "Beginning Episode: 517",
                "End Episode: 574 ",
                "Resume: Conhecida também como Saga Ilha dos Homens-Peixe, ela apresenta a trama depois de 2 anos do timeskip (avanço de tempo). Os Chapéus de Palha se reencontram no Arquipélago Sabaody e rumam para o Novo Mundo, mas para isso eles precisam passar pela Ilha dos Tritões e enfrentar alguns piratas que estão por ali.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Retorno a Sabaody: episódios 517 ao 522;\n" +
                                "Arco Ilha dos Tritões: episódios 523 ao 574"
                    )
                )
            ),
            Saga(
                "Saga Aliança Pirata",
                image = R.drawable.saga8,
                "Beginning Episode: 575",
                "End Episode: 750 ",
                "Resume: Finalmente Luffy e sua tripulação conseguem chegar ao Novo Mundo, porém eles acabam se deparando com um antigo laboratório do Dr. Vegapunk e encontram experimentos ilegais de Caesar Clown. Luffy acaba formando alianças e descobre uma conspiração existente na ilha de Dressrosa.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Ambição de Z: episódios 575 ao 578 (arco filler)\n" +
                                "Arco Punk Hazard: episódios 579 ao 625;\n" +
                                "Arco Recuperando César: episódios 626 ao 628 (arco filler);\n" +
                                "Arco Dressrosa: episódios 629 ao 746;\n" +
                                "Arco Minas de Prata: episódios 747 ao 750 (arco filler)"
                    )
                )
            ),
            Saga(
                "Saga Yonkou",
                image = R.drawable.saga9,
                "Beginning Episode: 751",
                "End Episode currently: 1025 ",
                "Resume: Chegamos a saga mais atual de One Piece, intitulado Yonkou. Uma aliança chamada Ninja-Pirata-Mink-Samurai é formada para derrubar Kaido. É quando Luffy entra em ação, se envolve com um Yonko chamado Big Mom e precisa embarcar numa missão de resgate de seu amigo, Sanji.",
                listOf(
                    Arc(
                        "Arcos da saga\n" +
                                "Arco Zou: episódios 751 ao 779;\n" +
                                "Arco Marinha Supernova: episódios 780 ao 782 (arco filler);\n" +
                                "Arco Whole Cake: episódios 783 ao 877;\n" +
                                "Arco Reverie: episódios 878 ao 889;\n" +
                                "Arco País de Wano: episódios 890 ao 894\n" +
                                "Arco Rei do Ácido Carbônico: episódios 895 e 896\n" +
                                "Arco País de Wano (continuação): episódios 897 ao 906\n" +
                                "Arco/Episódio Madrugada de Romance: episódio 907 (episódio filler)\n" +
                                "Arco País de Wano (continuação): episódios 908 ao 1025 (atualmente)"
                    )
                )
            )
        )
}