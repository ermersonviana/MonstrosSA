package app;

import java.util.Random;

import Monstros.Criature;
import MonstrosFactory.Monstro;
import MonstrosFactory.MonstroFactory;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<Monstro> enums = new ArrayList<Monstro>();
		enums.add(Monstro.Djinn);
		enums.add(Monstro.Dopplers);
		enums.add(Monstro.Ghouls);
		enums.add(Monstro.Kikimora);
		enums.add(Monstro.Silvano);
		
		for(int i = 0; i < 25; i++) {

			Monstro monsterType = enums.get(random.nextInt(5));
			
			Criature aletoryCriature = MonstroFactory.getMonster(monsterType);
			
			System.out.println(aletoryCriature.infoMonster());
		}
		
	}

}