
package proyecto_tabla_matriz;


public class Listas extends Tabla {

     Listas arrayObjetos[] = new Listas[118];
    public static String[][] table = new String[21][19];
    public static String[][] table2 = new String[9][15];
    public static int[] alcalinos;
    public static int[] alcalinoterreos;
    public static int[] metales;
    public static int[] otrosMetales;
    public static int[] lantanidos;
    public static int[] actinidos;
    public static int[] metaloides;
    public static int[] noMetales;
    public static int[] halogenos;
    public static int[] gases;
    public static String[] NameAlcalinos;
    public static String[] NameAlcalinoterreos;
    public static String[] NameMetales;
    public static String[] NameOtrosMetales;
    public static String[] NameLantanidos;
    public static String[] NameActinidos;
    public static String[] NameMetaloides;
    public static String[] NameNometales;
    public static String[] NameHalogenos;
    public static String[] NameGases;
     public static String[] ValeGases;
     
    
    

    //   public static int[] metaloide;
    public static void CargarMetalesAlcalinos() {
        alcalinos = new int[6];
        NameAlcalinos = new String[6];
        NameAlcalinos[0] = "Litio"; 
        NameAlcalinos[1] = "Sodio";
        NameAlcalinos[2] = "Potasio";
        NameAlcalinos[3] = "Rubidio";
        NameAlcalinos[4] = "Cesio";
        NameAlcalinos[5] = "Francio";
        
        alcalinos[0] = 3;        
        alcalinos[1] = 11;
        alcalinos[2] = 19;
        alcalinos[3] = 37;
        alcalinos[4] = 55;
        alcalinos[5] = 87;
     

    }

    public static void CargarAlcalinoterreos() {
        alcalinoterreos = new int[6];
        NameAlcalinoterreos = new String[6];
        NameAlcalinoterreos[0] = "Berilio";
        NameAlcalinoterreos[1] = "Magnesio";
        NameAlcalinoterreos[2] = "Calcio";
        NameAlcalinoterreos[3] = "Estroncio";
        NameAlcalinoterreos[4] = "Bario";
        NameAlcalinoterreos[5] = "Radio";
        
        alcalinoterreos[0] = 4;
        alcalinoterreos[1] = 12;
        alcalinoterreos[2] = 20;
        alcalinoterreos[3] = 38;
        alcalinoterreos[4] = 56;
        alcalinoterreos[5] = 88;

    }

    public static void CargarMetales() {
        metales = new int[38];
        NameMetales = new String[38];
        
        int[] valeEscandio = new int[1];
        valeEscandio[0] = 3;
        
        NameMetales[0] = "Escandio";
        NameMetales[1] = "Itrio";
        NameMetales[2] = "Titanio";
        NameMetales[3] = "Zirconio";
        NameMetales[4] = "Hafnio";
        NameMetales[5] = "Rutherfordio";
        NameMetales[6] = "Vanadio";
        NameMetales[7] = "Niobio";
        NameMetales[8] = "Tantalio";
        NameMetales[9] = "Dubnio";
        NameMetales[10] = "Cromo";
        NameMetales[11] = "Molibdeno";
        NameMetales[12] = "Wolframio";
        NameMetales[13] = "Seaborgio";
        NameMetales[14] = "Manganeso";
        NameMetales[15] = "Tecnecio";
        NameMetales[16] = "Renio";
        NameMetales[17] = "Bohrio";
        //Hierro.
        int[] valeHierro = new int[2];
        valeHierro[0] = 2;
        valeHierro[1] = 3;
        NameMetales[18] = "Hierro";
        
        metales[18] = 26;
        
        
        NameMetales[19] = "Rutenio";
        NameMetales[20] = "Osmio";
        NameMetales[21] = "Hassio";
        NameMetales[22] = "Cobalto";
        NameMetales[23] = "Rodio";
        NameMetales[24] = "Iridio";
        NameMetales[25] = "Meitnerio";
        NameMetales[26] = "Níquel";
        NameMetales[27] = "Paladio";
        NameMetales[28] = "Platino";
        NameMetales[29] = "Darmstatio";
        NameMetales[30] = "Cobre";
        NameMetales[31] = "Plata";
        NameMetales[32] = "Oro";
        NameMetales[33] = "Roentgenio";
        NameMetales[34] = "Zinc";
        NameMetales[35] = "Cadmio";
        NameMetales[36] = "Mercurio";
        NameMetales[37] = "Copernicio";
         
        metales[0] = 21;
        metales[1] = 39;
        metales[2] = 22;
        metales[3] = 40;
        metales[4] = 72;
        metales[5] = 104;
        metales[6] = 23;
        metales[7] = 41;
        metales[8] = 73;
        metales[9] = 105;
        metales[10] = 24;
        metales[11] = 42;
        metales[12] = 74;
        metales[13] = 106;
        metales[14] = 25;
        metales[15] = 43;
        metales[16] = 75;
        metales[17] = 107;
       
        metales[19] = 44;
        metales[20] = 76;
        metales[21] = 108;
        metales[22] = 27;
        metales[23] = 45;
        metales[24] = 77;
        metales[25] = 109;
        metales[26] = 28;
        metales[27] = 46;
        metales[28] = 78;
        metales[29] = 110;
        metales[30] = 29;
        metales[31] = 47;
        metales[32] = 79;
        metales[33] = 111;
        metales[34] = 30;
        metales[35] = 48;
        metales[36] = 80;
        metales[37] = 112;
    }

    public static void CargarOtrosMetales() {
        otrosMetales = new int[11];
        NameOtrosMetales = new String[11];
        NameOtrosMetales[0] = "Aluminio";
        NameOtrosMetales[1] = "Galio";
        NameOtrosMetales[2] = "Indio";
        NameOtrosMetales[3] = "Talio";
        NameOtrosMetales[4] = "Nihonio";
        NameOtrosMetales[5] = "Estaño";
        NameOtrosMetales[6] = "Plomo";
        NameOtrosMetales[7] = "Flerovio";
        NameOtrosMetales[8] = "Bismuto";
        NameOtrosMetales[9] = "Moscovio";
        NameOtrosMetales[10] = "Livermorio";
        
        otrosMetales[0] = 13;
        otrosMetales[1] = 31;
        otrosMetales[2] = 49;
        otrosMetales[3] = 81;
        otrosMetales[4] = 113;
        otrosMetales[5] = 50;
        otrosMetales[6] = 82;
        otrosMetales[7] = 114;
        otrosMetales[8] = 83;
        otrosMetales[9] = 115;
        otrosMetales[10] = 116;
    }

    public static void CargarLantanidos() {
        lantanidos = new int[15];
        NameLantanidos = new String[15];
        NameLantanidos[0] = "Lantano";
        NameLantanidos[1] = "Cerio";
        NameLantanidos[2] = "Praseodimio";
        NameLantanidos[3] = "Neodimio";
        NameLantanidos[4] = "Prometio";
        NameLantanidos[5] = "Samario";
        NameLantanidos[6] = "Europio";
        NameLantanidos[7] = "Gadolinio";
        NameLantanidos[8] = "Terbio";
        NameLantanidos[9] = "Disprosio";
        NameLantanidos[10] = "Holmio";
        NameLantanidos[11] = "Erbio";
        NameLantanidos[12] = "Tulio";
        NameLantanidos[13] = "Iterbio";
        NameLantanidos[14] = "Lutecio";
        
        
        
        
        lantanidos[0] = 57;
        lantanidos[1] = 58;
        lantanidos[2] = 59;
        lantanidos[3] = 60;
        lantanidos[4] = 61;
        lantanidos[5] = 62;
        lantanidos[6] = 63;
        lantanidos[7] = 64;
        lantanidos[8] = 65;
        lantanidos[9] = 66;
        lantanidos[10] = 67;
        lantanidos[11] = 68;
        lantanidos[12] = 69;
        lantanidos[13] = 70;
        lantanidos[14] = 71;
    }

    public static void CargarActinidos() {
        actinidos = new int[15];
        NameActinidos = new String[15];
        NameActinidos[0] = "Actinio";
        NameActinidos[1] = "Torio";
        NameActinidos[2] = "Protactinio";
        NameActinidos[3] = "Uranio";
        NameActinidos[4] = "Neptunio";
        NameActinidos[5] = "Plutonio";
        NameActinidos[6] = "Americio";
        NameActinidos[7] = "Curio";
        NameActinidos[8] = "Berkelio";
        NameActinidos[9] = "Californio";
        NameActinidos[10] = "Einstenio";
        NameActinidos[11] = "Fermio";
        NameActinidos[12] = "Mendelevio";
        NameActinidos[13] = "Nobelio";
        NameActinidos[14] = "Laurencio";
                
        actinidos[0] = 89;
        actinidos[1] = 90;
        actinidos[2] = 91;
        actinidos[3] = 92;
        actinidos[4] = 93;
        actinidos[5] = 94;
        actinidos[6] = 95;
        actinidos[7] = 96;
        actinidos[8] = 97;
        actinidos[9] = 98;
        actinidos[10] = 99;
        actinidos[11] = 100;
        actinidos[12] = 101;
        actinidos[13] = 102;
        actinidos[14] = 103;
    }

    public static void CargarMetaloides() {
        metaloides = new int[7];
        NameMetaloides = new String[7];
        NameMetaloides[0] = "Boro";
        NameMetaloides[1] = "Silicio";
        NameMetaloides[2] = "Germanio";
        NameMetaloides[3] = "Arsénico";
        NameMetaloides[4] = "Antimonio";
        NameMetaloides[5] = "Telurio";
        NameMetaloides[6] = "Polonio";
        
        metaloides[0] = 5;
        metaloides[1] = 14;
        metaloides[2] = 32;
        metaloides[3] = 33;
        metaloides[4] = 51;
        metaloides[5] = 52;
        metaloides[6] = 84;
    }

    public static void CargarNoMetales() {
        noMetales = new int[7];
        NameNometales = new String[7];
        NameNometales[0] = "Hidrógeno";
        NameNometales[1] = "Carbono";
        NameNometales[2] = "Nitrógeno";
        
        //Oxigeno
        int[] valeOxigeno = new int[2];
        valeOxigeno[0] = -2;
        valeOxigeno[1] = -1;
        NameNometales[3] = "Oxígeno";
        noMetales[3] = 8;
        
        
        
        
        NameNometales[4] = "Fósforo";
        NameNometales[5] = "Azufre";
        NameNometales[6] = "Selenio";
        
        noMetales[0] = 1;
        noMetales[1] = 6;
        noMetales[2] = 7;
        noMetales[3] = 8;
        noMetales[4] = 15;
        noMetales[5] = 16;
        noMetales[6] = 34;
    }

    public static void CargarHalogenos() {
        halogenos = new int[6];
        NameHalogenos = new String[6];
        NameHalogenos[0] = "Flúor";
        NameHalogenos[1] = "Cloro";
        NameHalogenos[2] = "Bromo";
        NameHalogenos[3] = "Yodo";
        NameHalogenos[4] = "Astato";
        NameHalogenos[5] = "Teneso";
        
        halogenos[0] = 9;
        halogenos[1] = 17;
        halogenos[2] = 35;
        halogenos[3] = 53;
        halogenos[4] = 85;
        halogenos[5] = 117;
    }

    public static void CargarGases() {
        gases = new int[7];
        NameGases = new String[7];
        NameGases[0] = "Helio";
        NameGases[1] = "Neón";
        NameGases[2] = "Argón";
        NameGases[3] = "Kriptón";
        NameGases[4] = "Xenón";
        NameGases[5] = "Radón";
        NameGases[6] = "Oganesón";
        
        gases[0] = 2;
        gases[1] = 10;
        gases[2] = 18;
        gases[3] = 36;
        gases[4] = 54;
        gases[5] = 86;
        gases[6] = 118;
       // ListasValencia[117] = new Listas(2,3);
    }

    public static void formato() {
        String space = "                        ";
        String border2 = "___________________________________________________________________________________________________________________________________________________________________";
        System.out.format("%s%s%n%s", space, border2, space);
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 15; j++) {
                if (j == 14 && i == 3) {
                    System.out.format("%s%n%s", border2, space);
                } else if (j == 14 && i == 6) {
                    System.out.format("%s", border2);
                } else if (j == 13) {
                    System.out.format("%s%n%s", Listas.table2[i][j], space);
                } else {
                    System.out.format("%s", Listas.table2[i][j]);
                }

            }

        }
        System.out.println("\n");
    }

    public static void formato2() {
        System.out.format("_____________                                                                                                                                                                                        ____________" + "\n");
        for (int i = 0; i < 21; i++) {
            int count = 1;
            for (int j = 0; j < 19; j++) {
                if (j == 17) {
                    System.out.format("%s%n", Listas.table[i][j]);
                } else {
                    System.out.format("%s", Listas.table[i][j]);
                }
            }
            count += i;
            if (count % 3 == 0 && i > 7 && i != 20) {
                System.out.format("_________________________________________________________________________________________________________________________________________________________________________________________________________________%n");
            }

        }
        System.out.format("_________________________________________________________________________________________________________________________________________________________________________________________________________________%n");

    }

  
}
