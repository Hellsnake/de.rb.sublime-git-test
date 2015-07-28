package de.rb.test;


import java.io.InputStreamReader;
import java.io.File;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] arguments) {
		File file = new File("Z:\\ARBEIT\\aktuelle Projekte\\2015\\15172 IAV GmbH Ingenieurgesellschaft Auto und Verkehr TD-Box 2\\EMV\\315172 IAV Ingenieursgesellschaft TD-Box 2 .T11");

		if (!file.exists()) {
			System.out.println("Datei " + file.toString() + "existiert nicht...");
			return;
		}

		Scanner scan = new Scanner(file);

		while(scan.hasNext()){
			

		}
	}
    
}
