public class spiel {

    /**
     * @param args
     */
    public static void main(String[] args) 
    { 

        // variablen deklarieren
        String name = "Daniel";
        String item = "";
        String playGame = "";


        
        // name eingeben 
        name = System.console().readLine("Sei gegrüßt Abenteurer, wie lautet dein Name? ");
        
        // name wird ausgegeben
        System.out.println(name +", ein großartiger Name für ein Abenteuer!");
        
        // abfrage ob spiel gestartet werden soll
        System.out.println("Möchten Du ein Spiel Spielen? (ja/nein)");
         playGame = System.console().readLine("(ja/nein)? :");
            //  wenn ja textausgebe und item wahl
            if (playGame.equals("ja")) {
                System.out.println("Wähle Dir dein erstes Item entscheide Weise");
                System.out.println("Wurfstern(1) , Messer(2), Axt(3), Laserschwert(4)?");
                item = System.console().readLine("Deine Wahl? : ");
                switch (item){
                    case "1":
                        item = "Wurfstern" ;
                        break;
                    case "2":
                        item = "Messer";
                        break;
                    case "3":
                        item = "Axt" ;
                        break;
                    case "4":
                        item = "Laserschwert" ;
                        break;
                }
                System.out.println("Hier hast du dein item: " + item);
            // ansonsten spiel verlassen
            }else{
            System.out.println("Das ist Schade " + name);
            }
        }
    // @Override
    // public String toString() {
    //     return "spiel []";
    // }
}

