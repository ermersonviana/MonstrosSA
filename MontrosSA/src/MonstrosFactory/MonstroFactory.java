package MonstrosFactory;

import Monstros.*;

public abstract class MonstroFactory {
	public static Criature getMonster(Monstro tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necr�fago", 5, 7, 3, "Cemit�rio");
		case Djinn:
			return new Djinn("Djin / G�nio", 8, 9, 10, "N�o possui um terreno.");
		case Silvano:
			return new Silvano("Silvano / Human�ide com Chifres", 5, 7, 3, "Fazendas");
		case Kikimora:
			return new Kikimora("Kikimora / Insectoide", 7, 8, 3, "P�ntano");
		case Dopplers:
			return new Dopplers("Dopplers / Relictos ou Metamorfos", 5, 7, 6, "N�o possui terreno.");
		}
		
		return null;
	}

}
