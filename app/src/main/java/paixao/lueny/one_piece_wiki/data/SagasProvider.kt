package paixao.lueny.one_piece_wiki.data

import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.domain.models.Arc
import paixao.lueny.one_piece_wiki.domain.models.Saga

object SagasProvider {
    fun retrieveSagas() =
        listOf(
            Saga(
                "East Blue",
                image = R.drawable.saga1,
                "Episódio Inicial: 01",
                "Episódio Final: 61",
                "Resumo ",
                "A saga que apresentou Luffy ao mundo, a chamada Saga East Blue. Ela mostra o personagem ainda criança vivendo em East Blue e no início do recrutamento de tripulantes para ele caçar o One Piece e tentar se tornar o Rei dos Piratas. ",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Romance Dawn (ou Arco do Capitão Morgan)", "Episódio Inicial:1","Episódio Final:4"),
                    Arc( "Arco Orange Town (ou Arco do Buggy, o palhaço)", "Episódio Inicial:5", "Episódio Final: 8"),
                    Arc( "Arco Vila Syrup","Episódio Inicial:9","Episódio Final: 18"),
                    Arc( "Arco Baratie", "Episódio Inicial:19", "Episódio Final: 30"),
                    Arc( "Arco Arlong Park", "Episódio Inicial: 31", "Episódio Final: 44"),
                    Arc( "Arco Bando do Buggy: Após a Batalha", "Episódio Inicial: 46","Episódio Final: 47"),
                    Arc( "Arco Loguetown","Episódio Inicial: 45 e 48","Episódio Final:53"),
                    Arc( "Arco Dragão Milenar", "Episódio Inicial: 54", "Episódio Final: 61 (arco filler)"
                    )
                ),
            ),
            Saga(
                "Alabasta",
                image = R.drawable.alabasta,
                "Episódio Inicial: 62",
                "Episódio Final: 135",
                "Resumo ",
                "A segunda saga, intitulada Alabasta (ou Baroque Works) Luffy e sua tripulação segue na busca pelo One Piece, na tentativa do rapaz se tornar o Rei dos Piratas. Entretanto, eles precisam ajudar a Nefertari Vivi à chegar na sua pátria antes que uma guerra se inicie. O problema é que uma organização mal intencionada vai fazer de tudo para impedir Luffy e seus amigos de chegar em Alabasta.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Reverse Mountain","Episódio Inicial: 62","Episódio Final:63"),
                    Arc("Arco Whiskey Peak","Episódio Inicial: 64", "Episódio Final: 67" ),
                    Arc("Arco Coby e Helmeppo", "Episódio Inicial: 68","Episódio Final: 69"),
                    Arc("Arco Little Garden","Episódio Inicial: 70","Episódio Final: 77"),
                    Arc("Arco Ilha Drum","Episódio Inicial: 78", "Episódio Final: 91"),
                    Arc("Arco Alabasta"," Episódio Inicial: 92", "Episódio Final: 130"),
                    Arc("Arco Pós-Alabasta", "Episódio Inicial: 131","Episódio Final: 135 (arco filler)"
                    )
                )
            ),
            Saga(
                "Skypiea",
                image = R.drawable.saga3,
                "Episódio Inicial: 136",
                "Episódio Final: 206 ",
                "Resumo",
                "A terceira saga de One Piece, intitulada Skypieia, os Chapéus de Palha seguem em sua aventura. Porém Luffy e os outros se deparam com uma terra cheia de mistérios e envolvida em uma guerra que pode destruir de uma vez Skypiera. Esse é um dos arcos que já começam com fillers logo no início da saga. ",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Ilha dos Carneiros","Episódio Inicial: 136 ", " Episódio Final: 138; (arco filler)"),
                    Arc("Arco Névoa Arco-Íris","Episódio Inicial: 139", "Episódio Final: 143; (arco filler)"),
                    Arc("Arco Jaya"," Episódio Inicial: 144"," Episódio Final: 152"),
                    Arc("Arco Skypiea"," Episódio Inicial: 153", "Episódio Final: 195"),
                    Arc("Arco G-8", "Episódio Inicial:196","Episódio Final: 206 (arco filler)"
                    )
                )
            ),
            Saga(
                "Water 7",
                image = R.drawable.saga4,
                "Episódio Inicial:207",
                "Episódio Final: 325 ",
                "Resumo",
                "Water 7 é a quarta saga de One Piece, conhecia também por Saga Enies Lobby ou Saga CP9. Desta vez, os piratas já estão em mar aberto novamente e irão enfrentar alguns perigos em sua empreitada na busca do One Piece. Um deles é o trapaceiro Foxy, além de um dos três Mirantes da Marinha, chamado Aokiji. Luffy precisa chegar a Water 7 para encontrar um carpinteiro que se junte a sua tripulação e conserte seu navio.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Davy Back Fight (ou Arco Long Ring Long Land)","Episódio Inicial: 207", "Episódio Final: 219"),
                    Arc("Arco Sonho do Oceano","Episódio Inicial: 220 ", "Episódio Final: 224 (arco filler)"),
                    Arc("Arco Retorno de Foxy", "Episódio Inicial: 225", "Episódio Final: 226 (arco semi-filler)"),
                    Arc("Arco Water 7","Episódio Inicial: 227","Episódio Final: 265"),
                    Arc("Arco Enies Lobby","Episódio Inicial: 266", "Episódio Final:312"),
                    Arc("Arco Pós-Enies Lobby", "Episódio Inicial:313","Episódio Final: 325")
                )
            ),
            Saga(
                "Thriller Bark",
                image = R.drawable.saga5,
                "Episódio Inicial: 326",
                "Episódio Final: 384 ",
                "Resumo",
                "Na quinta saga do anime, Luffy e os tripulantes acabam desembarcando em uma ilha fantasma chamada Thriller Bark. No local, um estranho personagem usa a sombra de Luffy para reviver Oars, um lendário gigante. Com a ajuda de Brook, um esqueleto, Luffy e os outros Chapéus de Palha terão que enfrentar Oars e aquele que lhe trouxe de volta a vida.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Adorável Terra", "Episódio Inicial:326", "Episódio Final: 336; (arco filler)"),
                    Arc("Arco Thriller Bark", " Episódio Inicial: 337", " Episódio Final: 381"),
                    Arc("Arco Ilha Spa", " Episódio Inicial:382", "Episódio Final: 384 (arco filler)")
                )
            ),
            Saga(
                "Guerra de Marineford",
                image = R.drawable.saga6,
                "Episódio Inicial: 385",
                "Episódio Final:516",
                "Resumo",
                "Conhecida também como Saga Cúpula da Guerra, a Guerra de Marineford marca o final da primeira metade do anime. Neste ponto da trama, Luffy e os outros Piratas do Chapéu de Palha são separados no Arquipélago de Sabaody. E é aqui que as coisas parecem se tornar um pouco mais difíceis pra Luffy e os outros.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Arquipélago Sabaody"," Episódio Inicial: 385", "Episódio Final: 407"),
                    Arc("Arco Amazon Lily", "Episódio Inicial: 408", "Episódio Final: 421"),
                    Arc("Arco Impel Down","Episódio Inicial:422", "Episódio Final: 425"),
                    Arc("Arco Pequeno-oriente Azul", "Episódio Inicial:426", "Episódio Final: 429; (arco filler)") ,
                    Arc("Arco Impel Down","Episódio Inicial:430", "Episódio Final: 456 (continuação pós-filler)" ),
                    Arc("Arco Marineford", "Episódio Inicial:457", "Episódio Final: 489"),
                    Arc("Arco Pós-Marineford","Episódio Inicial:490", "Episódio Final: 516")
                )
            ),
            Saga(
                "Ilha dos Homens-Peixe",
                image = R.drawable.saga7,
                "Episódio Inicial: 517",
                "Episódio Final: 574 ",
                "Resumo",
                "Conhecida também como Saga Ilha dos Homens-Peixe, ela apresenta a trama depois de 2 anos do timeskip (avanço de tempo). Os Chapéus de Palha se reencontram no Arquipélago Sabaody e rumam para o Novo Mundo, mas para isso eles precisam passar pela Ilha dos Tritões e enfrentar alguns piratas que estão por ali.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Retorno a Sabaody","Episódio Inicial:517"," Episódio Final:522"),
                    Arc("Arco Ilha dos Tritões","Episódio Inicial: 523","Episódio Final: 574")
                )
            ),
            Saga(
                "Aliança Pirata",
                image = R.drawable.saga8,
                "Episódio Inicial: 575",
                "Episódio Final: 750 ",
                "Resumo",
                "Finalmente Luffy e sua tripulação conseguem chegar ao Novo Mundo, porém eles acabam se deparando com um antigo laboratório do Dr. Vegapunk e encontram experimentos ilegais de Caesar Clown. Luffy acaba formando alianças e descobre uma conspiração existente na ilha de Dressrosa.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Ambição de Z","Episódio Inicial: 575", "Episódio Final: 578 (arco filler)"),
                    Arc("Arco Punk Hazard", "Episódio Inicial: 579","Episódio Final: 625"),
                    Arc("Arco Recuperando César"," Episódio Inicial: 626", "Episódio Final: 628 (arco filler)"),
                    Arc("Arco Dressrosa","Episódio Inicial: 629", " Episódio Final: 746"),
                    Arc("Arco Minas de Prata","Episódio Inicial:  747", " Episódio Final: 750 (arco filler)"),

                    )
                ),

            Saga(
                "Yonkou",
                image = R.drawable.saga9,
                "Episódio Inicial: 751",
                "Episódio Final: 1025 ",
                "Resumo",
                "Chegamos a saga mais atual de One Piece, intitulado Yonkou. Uma aliança chamada Ninja-Pirata-Mink-Samurai é formada para derrubar Kaido. É quando Luffy entra em ação, se envolve com um Yonko chamado Big Mom e precisa embarcar numa missão de resgate de seu amigo, Sanji.",
                "Arcos da Saga",
                listOf(
                    Arc("Arco Zou", "Episódio Inicial: 751", "Episódio Final:779"),
                    Arc("Arco Marinha Supernova","Episódio Inicial: 780 ","Episódio Final: 782 (arco filler)"),
                    Arc("Arco Whole Cake","Episódio Inicial:  783","Episódio Final: 877"),
                    Arc("Arco Reverie","Episódio Inicial: 878","Episódio Final: 889"),
                    Arc("Arco País de Wano","Episódio Inicial:  890","Episódio Final: 894"),
                    Arc("Arco Rei do Ácido Carbônico","Episódio Inicial:  895","Episódio Final: 896"),
                    Arc("Arco País de Wano (continuação)","Episódio Inicial:  897","Episódio Final: 906"),
                    Arc("Arco/Episódio Madrugada de Romance","Episódio Inicial:  907","Episódio Final: 907 (episódio filler)"),
                    Arc("Arco País de Wano (continuação)","Episódio Inicial:  908","Episódio Final: 1025 (atualamente)"

                )
            )
        )
    )
}
