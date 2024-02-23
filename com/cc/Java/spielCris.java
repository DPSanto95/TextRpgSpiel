package com.cc.java;

public class spielCris {

    /**
     * @param args
     */
    public static void main(String[] args) 
    { 

        // variablen deklarieren
        String name = "";
        String item = "";
        String playGame = "";
        String Quest = "";
        String karte = "Karte";
        String handel = "";
        String stein = "";


        
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
                System.out.println("Wurfstern(1) , Messer(2), Axt(3), Speer(4)?");
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
                        item = "Speer" ;
                        break;
                            }
                System.out.println("Hier hast du dein item: " + item + ". " +  item + " wurde in deinem Inventar verstaut.");
            // ansonsten spiel verlassen
            }else{
            System.out.println("Das ist bedauerlich lieber Abenteuerer " + name + ".");
            System.exit(0);}
            //abfrage welchen Weg du wählst
            System.out.println("Wähle Dir deine erste Quest und besiege den Wächter am Ende des Levels entscheide Weise");
                System.out.println("Wald(1), Wüste(2), Höhle(3),");
                Quest = System.console().readLine("Deine Wahl? : ");
                switch (Quest){
                    case "1":
                        Quest = "Wald" ;
                        break;
                    case "2":
                        Quest = "Wüste";
                        break;
                    case "3":
                        Quest = "Höhle" ;
        }
        // Erste gravierende entscheidung die auswirkung aufs Spiel hat
        // Questreihe Wald 
        //Bitte noch zusammen führen und als ein befehlausführen lassen!
        System.out.println("Du entscheidest dich also für die Questreihe " + Quest + ". Dann Lass uns die Reise beginnen!");
        System.out.println("An deiner ersten Wegkreuzung siehst du ein Zwielichtigen Mann. Er fragt dich ob du ihm Deine Waffe überlässt.");
        System.out.println("Dafür würde er dir einen Wichtigen Hinweis und eine Karte geben.");
        System.out.println("Überlässt du ihm deine Waffe?");
        handel = System.console().readLine("ja/nein?  :");

            //Waffe getauscht -> Karte und Info
            //später den Mann wiedertreffen und belohnt werden 
            if (handel.equals("ja")) {
            System.out.println( item + " wurde aus deinem Inventar entfernt!");
            System.out.println("Du erhälst den Hinweis das du dich immer Links halten sollst um an eine Truhe zu kommen und erhälst Das Item " + karte + " und verstaust Sie im Inventar.");
        
            //ignoriert und weiter gegangen
            //später den Mann wiedertreffen und überfallen werden 
            }else{ handel.equals("nein");
            System.out.println("Du verzichtest auf den Handel. Der Zwillichtige Mann sagt das du es bereuen wirst. Du setzt deine Reise fort!"); 
        }
        System.out.println("Du gehst ein Stück weiter in den Wald. Ein großer Stein versperrt dir den Weg. Du musst dich entscheiden ob du links oder rechts hälst." );
        stein = System.console().readLine("links/rechts?  :");

        if (stein.equals("links")) {
            System.out.println("Du entscheidest dich für den Linken Pfad und findest am Ende des Weges eine kleine Hütte.");
            //function erstellen Hütte durchsuchen ja/nein ??
            //in der Hütte soll eine truhe sein mit einer Waffe


            //function erstellen. Rechter Pfad ohne waffe Game over
            //mit Anfangswaffe -> Status verletzt 
            //Status verletzt geben für nächste quest -> Verletzt (beeinträchtigt nicht zu klettern/laufen)
            //Waffe aus der Hütte vom Linken Pfad -> Wolf besiegt ohne Verletzung
        } else{ System.out.println("Du entscheidest dich für den rechten Pfad und triffst auf einen Wolf!");
            
        }

        

    // @Override
    // public String toString() {
    //     return "spiel []";
    // }
}
}
