package com.mycompany.brasileirao;

import java.util.ArrayList;

public class Brasileirao {

    public static void main(String[] args) {
        
        Jogador luan = new Jogador("Luan", 10, Posicao.ATACANTE);
        Jogador cuca = new Jogador("Cuca", 10, Posicao.ATACANTE);
        Jogador neymar = new Jogador("Neymar Jr.", 11, Posicao.ATACANTE);
        Jogador alisson = new Jogador("Alisson Becker", 1, Posicao.GOLEIRO);
        Jogador sergioRamos = new Jogador("Sergio Ramos", 4, Posicao.ZAGUEIRO);
        Jogador marcelo = new Jogador("Marcelo Vieira", 12, Posicao.LATERAL);
        Jogador kante = new Jogador("N'Golo Kante", 7, Posicao.VOLANTE);
        Jogador deBruyne = new Jogador("Kevin De Bruyne", 17, Posicao.MEIA);
        Jogador messi = new Jogador("Lionel Messi", 10, Posicao.ATACANTE);
        Jogador vanDijk = new Jogador("Virgil van Dijk", 4, Posicao.ZAGUEIRO);
        Jogador kroos = new Jogador("Toni Kroos", 8, Posicao.VOLANTE);
        Jogador mbappe = new Jogador("Kylian Mbappe", 7, Posicao.ATACANTE);
        Jogador deGea = new Jogador("David de Gea", 1, Posicao.GOLEIRO);
        Jogador varane = new Jogador("Raphael Varane", 5, Posicao.ZAGUEIRO);
        Jogador carvajal = new Jogador("Dani Carvajal", 2, Posicao.LATERAL);
        Jogador busquets = new Jogador("Sergio Busquets", 5, Posicao.VOLANTE);
        Jogador modric = new Jogador("Luka Modric", 10, Posicao.MEIA);
        Jogador lewandowski = new Jogador("Robert Lewandowski", 9, Posicao.ATACANTE);
        Jogador hummels = new Jogador("Mats Hummels", 15, Posicao.ZAGUEIRO);
        Jogador fabregas = new Jogador("Cesc Fabregas", 4, Posicao.VOLANTE);
        Jogador rashford = new Jogador("Marcus Rashford", 10, Posicao.ATACANTE);
        
        // Time 1 - Real Madrid
        Tecnico zidane = new Tecnico("Zinedine Zidane", 49, 600000);
        ArrayList<Jogador> realMadridJogadores = new ArrayList<>();
        realMadridJogadores.add(alisson);
        realMadridJogadores.add(sergioRamos);
        realMadridJogadores.add(varane);
        realMadridJogadores.add(carvajal);
        realMadridJogadores.add(kante);
        realMadridJogadores.add(deBruyne);
        realMadridJogadores.add(messi);
        realMadridJogadores.add(mbappe);
        realMadridJogadores.add(rashford);
        realMadridJogadores.add(fabregas);
        realMadridJogadores.add(lewandowski);
        Time realMadrid = new Time("Real Madrid", zidane, realMadridJogadores, 30, 5, 3);

        // Time 2 - Barcelona
        Tecnico guardiola = new Tecnico("Pep Guardiola", 50, 750000);
        ArrayList<Jogador> barcelonaJogadores = new ArrayList<>();
        barcelonaJogadores.add(deGea);
        barcelonaJogadores.add(fabregas);
        barcelonaJogadores.add(hummels);
        barcelonaJogadores.add(luan);
        barcelonaJogadores.add(modric);
        barcelonaJogadores.add(kante);
        barcelonaJogadores.add(deBruyne);
        barcelonaJogadores.add(messi);
        barcelonaJogadores.add(mbappe);
        barcelonaJogadores.add(rashford);
        barcelonaJogadores.add(lewandowski);
        Time barcelona = new Time("Barcelona", guardiola, barcelonaJogadores, 28, 6, 4);

        // Time 3 - Manchester United
        Tecnico mourinho = new Tecnico("Jose Mourinho", 58, 500000);
        ArrayList<Jogador> manchesterUnitedJogadores = new ArrayList<>();
        manchesterUnitedJogadores.add(alisson);
        manchesterUnitedJogadores.add(sergioRamos);
        manchesterUnitedJogadores.add(varane);
        manchesterUnitedJogadores.add(carvajal);
        manchesterUnitedJogadores.add(kante);
        manchesterUnitedJogadores.add(deBruyne);
        manchesterUnitedJogadores.add(neymar);
        manchesterUnitedJogadores.add(mbappe);
        manchesterUnitedJogadores.add(rashford);
        manchesterUnitedJogadores.add(fabregas);
        manchesterUnitedJogadores.add(lewandowski);
        Time manchesterUnited = new Time("Manchester United", mourinho, manchesterUnitedJogadores, 27, 8, 3);
        
        
        Partida barcelonaXmanchesterUnited = new Partida(barcelona, manchesterUnited, 2, 1);
        Partida barcelonaXrealMadrid = new Partida(barcelona, realMadrid, 3, 2);
        Partida realMadridXmanchesterUnited = new Partida(realMadrid, manchesterUnited, 4, 1);
        
        System.out.println(barcelonaXmanchesterUnited.toString());
        System.out.println(realMadridXmanchesterUnited.toString());
        System.out.println(barcelonaXrealMadrid.toString());
    }
}
