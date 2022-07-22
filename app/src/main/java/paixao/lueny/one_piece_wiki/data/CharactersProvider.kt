package paixao.lueny.one_piece_wiki.data

import paixao.lueny.one_piece_wiki.R
import paixao.lueny.one_piece_wiki.recyclerview.adapter.Character

object CharactersProvider {

    fun retrieveCharacters() =
        listOf(
            Character(image = R.drawable.luffy, "Luffy", "Função no Grupo: Capitão","Akuma no Mi: Fruta da Borracha","Poderes: Capacidades físicas sobre-humanas: além de velocidade, agilidade e reflexos aprimorados, Luffy tem uma força inacreditável, sendo capaz quebrar materiais resistentes como aço e concreto.\n" +
                    "Capacidade de cura: além da resistência que suas habilidades de borracha lhe proporcionam, Luffy pode se curar de intensos ataques.\n" +
                    "Haki: por ser capaz de usar as três formas de Haki (uma das poucas pessoas conhecidas com essa capacidade), Luffy pode aumentar seus poderes e habilidades e prever ataques.\n" +
                    "Akuma no Mi: no decorrer de sua trajetória e de seus treinamentos, Luffy desenvolveu diferentes técnicas unindo suas habilidades de luta com seus poderes de borracha, geralmente usando recursos como esticar partes de seu corpo para que possa atingir inimigos à distância ou com maior potência.","Recompensa: $1.500.000.000."),
            Character(image = R.drawable.zoro, "Zoro", "Função no Grupo: Espadachim","Akuma no Mi: Não Possui","Poderes: Ittoryu, Nitoryu e Santoryu: Zoro domina o Ittoryu (Estilo Uma Espada), o Nitoryu (Estilo Duas Espadas), e desenvolveu por conta própria o Santoryu (Estilo Três Espadas). Neste último, ele usa uma espada em cada mão enquanto leva outra na boca. Os três estilos são usados para ataques de alta velocidade e ataques de projeção de ar comprimido. O Santoryu permite que ele combine os dois tipos de ataques em uma mesma técnica.\n" +
                    "Flying Slash Attack: Ataque à distância no qual Zoro atinge seu inimigo a pressão do ar que provoca com seus golpes de espada.\n" +
                    "Kyutoryu (forma Ashura): Zoro é capaz de contactar a entidade Ashura, ligação a partir da qual ele despertou um estilo de espada no qual adquire a aparência temporária de ter seis braços e três cabeças, sendo assim capaz de usar nove espadas ao mesmo tempo.","Recompensa: $320.000.000."),
            Character(image = R.drawable.nami, "Nami", "Função no Grupo: Cartógrafa e Tesoureira","Akuma no Mi: Não Possui","Poderes: Arte do Tempo: a sensibilidade que Nami já possuía em pressentir o clima foi canalizada no artefato Clima-Tact, uma espécie de bastão criado por Usopp (falamos dele mais a seguir) com o qual ela consegue controlar as condições climáticas próximas a sua localização. A partir dessa nova habilidade, a pirata desenvolveu diferentes técnicas de combate.\n" +
                    "Perfect Clima-Tact: Nami pode criar duplicatas de si mesma usando névoa (após um aperfeiçoamento do Clima-Tact).\n" +
                    "Sorcery Clima-Tact: Nami usa o Clima-Tact para controlar raios e usá-los como arma (depois do salto temporal).\n" +
                    "Fourth Clima-Tact: Com o novo Clima-Tact acriado por por Usopp e Franky, Nami intensifica o poder de todas as suas técnicas.","Recompensa: $66.000.000."),
            Character(image = R.drawable.usopp, "Usopp", "Função no Grupo: Atirador","Akuma no Mi: Não Possui","Poderes: Tiro: Usopp é um habilidoso atirador que usa sua incrível mira e seus conhecimento de engenharia para acertar alvos a grandes distâncias, seja com sua baladeira/estilingue, seja com canhões.\n" +
                    "Inventos: Além do Clima-Tact, Usopp criou sua arma Kabuto, uma espécie de estilingue com cinco elásticos conectados, o que faz com que a força e a precisão do tiro seja ainda maior.","$200.000.000"),
            Character(image = R.drawable.sanji, "Sanji", "Função no Grupo: Cozinheiro","Akuma no Mi:  Não Possui","Poderes: Capacidades físicas sobre-humanas: seu treinamento lhe proporcionaram força, velocidade e resistência inacreditáveis Sanji pe capaz de destruir até mesmo metal apenas com sua força física.\n" +
                    "Estilo de luta único: unindo técnicas de lutas como capoeira, Taekwondo e savate, Sanji desenvolveu seu próprio estilo de luta, criando técnicas com as quais consegue, por exemplo: correr embaixo da água, saltar de grandes alturas e se locomover criando barreiras sonoras no ar com sua velocidade.\n" +
                    "Diable Jambe: nesta técnica, Sanji eleva a temperatura de suas pernas até que elas ganhem a aparência e o poder de fogo vivo.\n" +
                    "Haki: o pirata é capaz de usar Kenbunshoku Haki, com o qual pode sentir a presença de outras pessoas mesmo a grandes distâncias, e Busoshoku Haki. Com este último, consegue criar uma espécie de armadura invisível em torno de si mesmo.","Recompensa: $330.000.000."),
            Character(image = R.drawable.chopper, "Chopper", "Função no Grupo: Médico","Akuma no Mi: Fruta Humano","Poderes: Horn Point: provoca o crescimento de seus chifres.\n" +
                    "Jumping Point: assume uma forma mais humana, bípede, e aumenta o tamanho de suas pernas para ganhar velocidade e dar grandes saltos.\n" +
                    "Arm Point: amplia seus músculos, numa forma humanoide que deixa seus cascos dianteiros extremamente fortes.\n" +
                    "Monster Point: Chopper fica com mais de 6 metros de altura, ganhando uma força monstruosa, ganha três chifres.\n" +
                    "Guard Point: Seu pelo cresce impedir ataques externos como uma armadura.","Recompensa: $50.00."),
            Character(image = R.drawable.robin, "Robin", "Função no Grupo: arqueóloga e Historiadora","Akuma no Mi: Fruta da Flor","Poderes: Clutch: com essa técnica, ela replica suas mãos nas costas do oponente e as usa para atacá-lo sem que ela possa revidar.\n" +
                    "Cuerpo Fleur: Doble Clutch: Nico cria um clone seu e replica quatro braços a mais para si mesma e para seu clone, aumentando seu poder de ataque.\n" +
                    "Ojos Fleur: com essa técnica de espionagem, ela é capaz de replicar seus olhos em um objeto ou no corpo de outra pessoa, mesmo a longas distâncias.\n" +
                    "Oreja Fleur: também útil para conseguir informações sigilosas, ela replica suas orelhas onde desejar.","Recompensa: $130.000.000."),
            Character(image = R.drawable.franky, "Franky", "Função no Grupo: Carpinteiro","Akuma no Mi: Não Possui","Poderes: Força sobre-humana: mesmo quando perigosamente ferido, Franky ainda se destaca como um dos integrantes mais fortes da tripulação.\n" +
                    "Habilidades com armas: Franky consegue usar qualquer tipo de arma que chegue a suas mãos com grande destreza. Além disso, inclui armas em seu próprio corpo ciborgue.\n" +
                    "Audição aprimorada: o pirata é capaz de ouvir informações ditas e outros sons mesmo a grandes distâncias.\n" +
                    "Inteligência: Franky é um gênio da construção naval, com conhecimentos de engenharia e carpintaria, sendo capaz de criar importantes itens incrivelmente tecnológicos com facilidade.","Recompensa: $94.000.000."),
            Character(image = R.drawable.brook, "Brook", "Função no Grupo: Espadachim e Músico","Akuma no Mi: Fruta Revivi","Poderes: Música: além de entreter com sua arte, Brook é capaz de usar sua música para influenciar as pessoas, e até fazer os oponentes adormecerem. Ele consegue tocar qualquer instrumento.\n" +
                    "Esgrima: extremamente habilidoso com a espada, é uma forte presença em batalha.\n" +
                    "Capacidades físicas aprimoradas: seu novo corpo esquelético lhe proporcionou grande velocidade, até da capacidade de saltar extraordinariamente alto e correr sobre a água.\n" +
                    "Projeção astral: Brook aprendeu a projetar seu espírito, conseguindo deixar seu esqueleto para trás enquanto se locomove como uma alma desencarnada.","Recompensa: $83.000.000."),
        )
}