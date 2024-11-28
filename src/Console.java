/*
* File: Console.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.util.Scanner;

public class Console {

  /*
   * A be() függvény indítja a bekérést,
   * és a tárolást.
   */
  public void startApp(){
    String name = input("bejelentő neve: ");
    String message = input("hiba leírása: ");
    
    Incident incident = new Incident(name, message);
    incident.name = name;
    incident.message = message;
    Store.writeIncidentToFilee(incident);
  }
  private String input(String message){
    System.out.println(message);
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    // scanner.close();
    return input;
  }
    Scanner b = new Scanner(System.in);
    System.out.print("Bejelentő neve: ");
    String da = b.nextLine();
    System.out.print("Hiba leírása: ");
    String la = b.nextLine();
    Store a = new Store();
    i.name = da;
    i.error = la;

    /*
     * Hibakezelő rész, ami fájlbaírás
     * műveletnél használt FileWriter 
     * esetleges hibáját kezeli. A FileWriter
     * az java.io csomagban van. A kivétel
     * amit dob: IOException.
     */
    
    try {
      a.doit(i);
    } catch (Exception e) {
      System.out.println(da + " hiba leírt: " + la);
    }
    b.close();
  }
}
