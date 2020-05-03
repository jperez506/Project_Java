
package proyecto_tabla_matriz;


public class Tabla {

   
    
  
    

    static void leertabla( Listas vector) {
        
        Listas.table[0][0] = "|Hidrógeno "+vector.noMetales[0]+"|";
        Listas.table[0][1] = "  ";
        Listas.table[0][2] = "                  ";
        Listas.table[0][3] = "                  ";
        Listas.table[0][4] = "                  ";
        Listas.table[0][5] = "                  ";
        Listas.table[0][6] = "                  ";
        Listas.table[0][7] = "                  ";
        Listas.table[0][8] = "                  ";
        Listas.table[0][9] = "                  ";
        Listas.table[0][10] = "             ";
        Listas.table[0][11] = "       ";
        Listas.table[0][12] = "      ";
        Listas.table[0][13] = "   ";
        Listas.table[0][14] = "   ";
        Listas.table[0][15] = "   ";
        Listas.table[0][16] = "   ";
        Listas.table[0][17] = "| Helio   "+vector.gases[0]+"|";
        Listas.table[0][18] = "";
        
        Listas.table[1][0] = "|     H #   |";
        Listas.table[1][1] = "       ";
        Listas.table[1][2] = "       ";
        Listas.table[1][3] = "        Tabla Periódica     ";
        Listas.table[1][4] = "           No Metales = #             ";
        Listas.table[1][5] = "     ";
        Listas.table[1][6] = "     ";
        Listas.table[1][7] = "              ";
        Listas.table[1][8] = "                ";
        Listas.table[1][9] = "                ";
        Listas.table[1][10] = "               ";
        Listas.table[1][11] = "               ";
        Listas.table[1][12] = "      ";
        Listas.table[1][13] = "   ";
        Listas.table[1][14] = "   ";
        Listas.table[1][15] = "   ";
        Listas.table[1][16] = "   ";
        Listas.table[1][17] = "|    He %  |";
        Listas.table[1][18] = "";
      
        Listas.table[2][0] = "|   1.007   |";
        Listas.table[2][1] = "                  ";
        Listas.table[2][2] = "                  ";
        Listas.table[2][3] = "                 Metales Alcalinos = ° ";
        Listas.table[2][4] = "                  ";
        Listas.table[2][5] = "                  ";
        Listas.table[2][6] = "        ";
        Listas.table[2][7] = "        ";
        Listas.table[2][8] = "                 ";
        Listas.table[2][9] = "           ";
        Listas.table[2][10] = "       ";
        Listas.table[2][11] = "       ";
        Listas.table[2][12] = "   ";
        Listas.table[2][13] = "   ";
        Listas.table[2][14] = "   ";
        Listas.table[2][15] = "   ";
        Listas.table[2][16] = "   ";
        Listas.table[2][17] = "|   4.002  |";
        Listas.table[2][18] = "_________________________                                         Alcalinotérreos = $                                                         ___________________________________________________________________" + "\n";

        Listas.table[3][0] = "| Litio    "+vector.alcalinos[0]+"|";
        Listas.table[3][1] = " Berilio  "+vector.alcalinoterreos[0]+"|";
        Listas.table[3][2] = "";
        Listas.table[3][3] = "                 ";
        Listas.table[3][4] = "                 ";
        Listas.table[3][5] = "       Otros Metales = &  ";
        Listas.table[3][6] = "                ";
        Listas.table[3][7] = "        ";
        Listas.table[3][8] = "                ";
        Listas.table[3][9] = "                ";
        Listas.table[3][10] = " ";
        Listas.table[3][11] = "";
        Listas.table[3][12] = "| Boro    "+vector.metaloides[0]+"|";
        Listas.table[3][13] = " Carbono "+vector.noMetales[1]+"|";
        Listas.table[3][14] = "Nitrógeno"+vector.noMetales[2]+"|";
        Listas.table[3][15] = " Oxígeno "+vector.noMetales[3]+"|";
        Listas.table[3][16] = " Flúor   "+vector.halogenos[0]+"|";
        Listas.table[3][17] = " Neón   "+vector.gases[1]+"|";
        Listas.table[3][18] = "";
      
       
        Listas.table[4][0] = "|    Li °   |";
        Listas.table[4][1] = "     Be $  |";
        Listas.table[4][2] = "       ";
        Listas.table[4][3] = "           de los              ";
        Listas.table[4][4] = "   Metales = +  ";
        Listas.table[4][5] = "              ";
        Listas.table[4][6] = "              ";
        Listas.table[4][7] = "             ";
        Listas.table[4][8] = "             ";
        Listas.table[4][9] = "   ";
        Listas.table[4][10] = "   ";
        Listas.table[4][11] = "   ";
        Listas.table[4][12] = "|     B !  |";
        Listas.table[4][13] = "    C #   |";
        Listas.table[4][14] = "    N #   |";
        Listas.table[4][15] = "    O #   |";
        Listas.table[4][16] = "    F ¬   |";
        Listas.table[4][17] = "    Ne %  |";
        Listas.table[4][18] = "";
    
        Listas.table[5][0] = "|   6.941   |";
        Listas.table[5][1] = "   9.012   |";
        Listas.table[5][2] = "               ";
        Listas.table[5][3] = "               ";
        Listas.table[5][4] = "           Metaloides = !    ";
        Listas.table[5][5] = "                 ";
        Listas.table[5][6] = "         ";
        Listas.table[5][7] = "         ";
        Listas.table[5][8] = "           ";
        Listas.table[5][9] = "      ";
        Listas.table[5][10] = "   ";
        Listas.table[5][11] = "   ";
        Listas.table[5][12] = "|   10.81  |";
        Listas.table[5][13] = "   12.01  |";
        Listas.table[5][14] = "   14.00  |";
        Listas.table[5][15] = "   15.99  |";
        Listas.table[5][16] = "   18.99  |";
        Listas.table[5][17] = "   20.18  |";
        Listas.table[5][18] = "_________________________                                         Lantánidos = *                                                              ___________________________________________________________________" + "\n";

    
        Listas.table[6][0] = "| Sodio   "+vector.alcalinos[1]+"|";
        Listas.table[6][1] = "Magnesio "+vector.alcalinoterreos[1]+"|";
        Listas.table[6][2] = " ";
        Listas.table[6][3] = "                 ";
        Listas.table[6][4] = "                 ";
        Listas.table[6][5] = "      Actínidos = =        ";
        Listas.table[6][6] = "                ";
        Listas.table[6][7] = "            ";
        Listas.table[6][8] = "           ";
        Listas.table[6][9] = "          ";
        Listas.table[6][10] = "   ";
        Listas.table[6][11] = "   ";
        Listas.table[6][12] = "|Aluminio"+vector.otrosMetales[0]+"|";
        Listas.table[6][13] = "Silicio "+vector.metaloides[1]+"|";
        Listas.table[6][14] = "Fósforo "+vector.noMetales[4]+"|";
        Listas.table[6][15] = " Azufre "+vector.noMetales[5]+"|";
        Listas.table[6][16] = " Cloro  "+vector.halogenos[1]+"|";
        Listas.table[6][17] = " Argón  "+vector.gases[2]+"|";
        Listas.table[6][18] = "";

    
        Listas.table[7][0] = "|     Na °  |";
        Listas.table[7][1] = "     Mg $  |";
        Listas.table[7][2] = "       ";
        Listas.table[7][3] = "                   Elementos      Halógenos = ¬          ";
        Listas.table[7][4] = "             ";
        Listas.table[7][5] = "           ";
        Listas.table[7][6] = "          ";
        Listas.table[7][7] = "        ";
        Listas.table[7][8] = "   ";
        Listas.table[7][9] = "   ";
        Listas.table[7][10] = "  ";
        Listas.table[7][11] = "   ";
        Listas.table[7][12] = "|    Al &  |";
        Listas.table[7][13] = "    Si !  |";
        Listas.table[7][14] = "    P #   |";
        Listas.table[7][15] = "    S #   |";
        Listas.table[7][16] = "    Cl ¬  |";
        Listas.table[7][17] = "    Ar %  |";
        Listas.table[7][18] = "";

     
        Listas.table[8][0] = "|   22.99   |";
        Listas.table[8][1] = "   24.30   |";
        Listas.table[8][2] = "                 ";
        Listas.table[8][3] = "                ";
        Listas.table[8][4] = "        Gases Nobles = % ";
        Listas.table[8][5] = "               ";
        Listas.table[8][6] = "            ";
        Listas.table[8][7] = "            ";
        Listas.table[8][8] = "       ";
        Listas.table[8][9] = "       ";
        Listas.table[8][10] = "   ";
        Listas.table[8][11] = "   ";
        Listas.table[8][12] = "|   26.98  |";
        Listas.table[8][13] = "   28.0   |";
        Listas.table[8][14] = "   30.97  |";
        Listas.table[8][15] = "   32.06  |";
        Listas.table[8][16] = "   35.45  |";
        Listas.table[8][17] = "   39.94  |";
        Listas.table[8][18] = "";

    
        Listas.table[9][0] = "| Potasio "+vector.alcalinos[2]+"|";
        Listas.table[9][1] = " Calcio  "+vector.alcalinoterreos[2]+"|";
        Listas.table[9][2] = "Escandio "+vector.metales[0]+"|";
        Listas.table[9][3] = " Titanio "+vector.metales[2]+"|";
        Listas.table[9][4] = " Vanadio "+vector.metales[6]+"|";
        Listas.table[9][5] = " Cromo   "+vector.metales[10]+"|";
        Listas.table[9][6] = "Manganeso"+vector.metales[14]+"|";
        Listas.table[9][7] = " Hierro  "+vector.metales[18]+"|";
        Listas.table[9][8] = " Cobalto "+vector.metales[22]+"|";
        Listas.table[9][9] = " Niquel  "+vector.metales[26]+"|";
        Listas.table[9][10] = " Cobre  "+vector.metales[30]+"|";
        Listas.table[9][11] = " Zinc   "+vector.metales[34]+"|";
        Listas.table[9][12] = " Galio  "+vector.otrosMetales[1]+"|";
        Listas.table[9][13] = "Germanio"+vector.metaloides[2]+"|";
        Listas.table[9][14] = "Arsénico"+vector.metaloides[3]+"|";
        Listas.table[9][15] = "Selenio "+vector.noMetales[6]+"|";
        Listas.table[9][16] = " Bromo  "+vector.halogenos[2]+"|";
        Listas.table[9][17] = "Kriptón "+vector.gases[3]+"|";
        Listas.table[9][18] = "";

        Listas.table[10][0] = "|     K °   |";
        Listas.table[10][1] = "     Ca $  |";
        Listas.table[10][2] = "     Sc +  |";
        Listas.table[10][3] = "     Ti +  |";
        Listas.table[10][4] = "     V  +  |";
        Listas.table[10][5] = "     Cr +  |";
        Listas.table[10][6] = "     Mn +  |";
        Listas.table[10][7] = "     Fe +  |";
        Listas.table[10][8] = "     Co +  |";
        Listas.table[10][9] = "     Ni +  |";
        Listas.table[10][10] = "    Cu +  |";
        Listas.table[10][11] = "    Zn +  |";
        Listas.table[10][12] = "    Ga &  |";
        Listas.table[10][13] = "    Ge !  |";
        Listas.table[10][14] = "    As !  |";
        Listas.table[10][15] = "    Se #  |";
        Listas.table[10][16] = "    Br ¬  |";
        Listas.table[10][17] = "    Kr %  |";
        Listas.table[10][18] = "";

     
        Listas.table[11][0] = "|   39.09   |";
        Listas.table[11][1] = "   40.07   |";
        Listas.table[11][2] = "   44.95   |";
        Listas.table[11][3] = "   47.86   |";
        Listas.table[11][4] = "   50.94   |";
        Listas.table[11][5] = "   51.99   |";
        Listas.table[11][6] = "   54.93   |";
        Listas.table[11][7] = "   55.84   |";
        Listas.table[11][8] = "   58.93   |";
        Listas.table[11][9] = "   58.69   |";
        Listas.table[11][10] = "   63.54  |";
        Listas.table[11][11] = "   65.39  |";
        Listas.table[11][12] = "   69.72  |";
        Listas.table[11][13] = "   72.61  |";
        Listas.table[11][14] = "   74.92  |";
        Listas.table[11][15] = "   78.96  |";
        Listas.table[11][16] = "   79.90  |";
        Listas.table[11][17] = "   83.80  |";
        Listas.table[11][18] = "";


        
        Listas.table[12][0] = "| Rubidio "+vector.alcalinos[3]+"|";
        Listas.table[12][1] = "Estroncio"+vector.alcalinoterreos[3]+"|";
        Listas.table[12][2] = " Itrio   "+vector.metales[1]+"|";
        Listas.table[12][3] = "Circonio "+vector.metales[3]+"|";
        Listas.table[12][4] = " Niobio  "+vector.metales[7]+"|";
        Listas.table[12][5] = "Molibdeno"+vector.metales[11]+"|";
        Listas.table[12][6] = "Tecnecio "+vector.metales[15]+"|";
        Listas.table[12][7] = " Rutenio "+vector.metales[19]+"|";
        Listas.table[12][8] = " Rodio   "+vector.metales[23]+"|";
        Listas.table[12][9] = " Paladio "+vector.metales[27]+"|";
        Listas.table[12][10] = " Plata  "+vector.metales[31]+"|";
        Listas.table[12][11] = " Cadmio "+vector.metales[35]+"|";
        Listas.table[12][12] = " Indio  "+vector.otrosMetales[2]+"|";
        Listas.table[12][13] = " Estaño "+vector.otrosMetales[5]+"|";
        Listas.table[12][14] = "Antimoni"+vector.metaloides[4]+"|";
        Listas.table[12][15] = " Teluro "+vector.metaloides[5]+"|";
        Listas.table[12][16] = " Yodo   "+vector.halogenos[3]+"|";
        Listas.table[12][17] = " Xenón  "+vector.gases[4]+"|";
        Listas.table[12][18] = "";

    
        Listas.table[13][0] = "|     Rb °  |";
        Listas.table[13][1] = "     Sr $  |";
        Listas.table[13][2] = "     Y  +  |";
        Listas.table[13][3] = "     Zr +  |";
        Listas.table[13][4] = "     Nb +  |";
        Listas.table[13][5] = "     Mo +  |";
        Listas.table[13][6] = "     Tc +  |";
        Listas.table[13][7] = "     Ru +  |";
        Listas.table[13][8] = "     Rh +  |";
        Listas.table[13][9] = "     Pd +  |";
        Listas.table[13][10] = "    Ag +  |";
        Listas.table[13][11] = "    Cd +  |";
        Listas.table[13][12] = "    In &  |";
        Listas.table[13][13] = "    Sn &  |";
        Listas.table[13][14] = "    Sb !  |";
        Listas.table[13][15] = "    Te !  |";
        Listas.table[13][16] = "    I  ¬  |";
        Listas.table[13][17] = "    Xe %  |";
        Listas.table[13][18] = "";

        /*                 */
        Listas.table[14][0] = "|   85.46   |";
        Listas.table[14][1] = "   87.62   |";
        Listas.table[14][2] = "   88.90   |";
        Listas.table[14][3] = "   91.24   |";
        Listas.table[14][4] = "   92.90   |";
        Listas.table[14][5] = "   95.94   |";
        Listas.table[14][6] = "   97.90   |";
        Listas.table[14][7] = "   101.0   |";
        Listas.table[14][8] = "   102.9   |";
        Listas.table[14][9] = "   106.4   |";
        Listas.table[14][10] = "  107.8   |";
        Listas.table[14][11] = "  112.4   |";
        Listas.table[14][12] = "  114.8   |";
        Listas.table[14][13] = "  118.7   |";
        Listas.table[14][14] = "  121.7   |";
        Listas.table[14][15] = "  127.6   |";
        Listas.table[14][16] = "  126.9   |";
        Listas.table[14][17] = "  131.2   |";
        Listas.table[14][18] = "";

        /*  radif 6om jadval  */
        Listas.table[15][0] = "| Cesio   "+vector.alcalinos[4]+"|";
        Listas.table[15][1] = " Bario   "+vector.alcalinoterreos[4]+"|";
        Listas.table[15][2] = " Lutecio "+vector.lantanidos[14]+"|";
        Listas.table[15][3] = " Hafnio  "+vector.metales[4]+"|";
        Listas.table[15][4] = " Tántalo "+vector.metales[8]+"|";
        Listas.table[15][5] = "Wolframio"+vector.metales[12]+"|";
        Listas.table[15][6] = " Renio   "+vector.metales[16]+"|";
        Listas.table[15][7] = " Osmio   "+vector.metales[20]+"|";
        Listas.table[15][8] = " Iridio  "+vector.metales[24]+"|";
        Listas.table[15][9] = " Platino "+vector.metales[28]+"|";
        Listas.table[15][10] = " Oro    "+vector.metales[32]+"|";
        Listas.table[15][11] = "Mercurio"+vector.metales[36]+"|";
        Listas.table[15][12] = " Talio  "+vector.otrosMetales[3]+"|";
        Listas.table[15][13] = " Plomo  "+vector.otrosMetales[6]+"|";
        Listas.table[15][14] = "Bismuto "+vector.otrosMetales[8]+"|";
        Listas.table[15][15] = " Plonio "+vector.metaloides[6]+"|";
        Listas.table[15][16] = " Astato "+vector.halogenos[4]+"|";
        Listas.table[15][17] = " Radón  "+vector.gases[5]+"|";
        Listas.table[15][18] = "";

        /*                           */
        Listas.table[16][0] = "|     Cs °  |";
        Listas.table[16][1] = "     Ba $  |";
        Listas.table[16][2] = "     La *  |";
        Listas.table[16][3] = "     Hf +  |";
        Listas.table[16][4] = "     Ta +  |";
        Listas.table[16][5] = "     W  +  |";
        Listas.table[16][6] = "     Re +  |";
        Listas.table[16][7] = "     Os +  |";
        Listas.table[16][8] = "     Ir +  |";
        Listas.table[16][9] = "     Pt +  |";
        Listas.table[16][10] = "    Au +  |";
        Listas.table[16][11] = "    Hg +  |";
        Listas.table[16][12] = "    Ti &  |";
        Listas.table[16][13] = "    Pb &  |";
        Listas.table[16][14] = "    Bi &  |";
        Listas.table[16][15] = "    Po !  |";
        Listas.table[16][16] = "    At ¬  |";
        Listas.table[16][17] = "    Rn %  |";
        Listas.table[16][18] = "";

        /*                        */
        Listas.table[17][0] = "|   132.9   |";
        Listas.table[17][1] = "   137.3   |";
        Listas.table[17][2] = "   138.9   |";
        Listas.table[17][3] = "   178.4   |";
        Listas.table[17][4] = "   180.9   |";
        Listas.table[17][5] = "   183.8   |";
        Listas.table[17][6] = "   186.2   |";
        Listas.table[17][7] = "   190.2   |";
        Listas.table[17][8] = "   192.2   |";
        Listas.table[17][9] = "   195.0   |";
        Listas.table[17][10] = "  196.9   |";
        Listas.table[17][11] = "  200.5   |";
        Listas.table[17][12] = "  204.3   |";
        Listas.table[17][13] = "  207.2   |";
        Listas.table[17][14] = "  208.9   |";
        Listas.table[17][15] = "  208.9   |";
        Listas.table[17][16] = "  209.9   |";
        Listas.table[17][17] = "  222.0   |";
        Listas.table[17][18] = "";

        /*  radif 7om jadval  */
        Listas.table[18][0] = "| Francio "+vector.alcalinos[5]+"|";
        Listas.table[18][1] = " Radio   "+vector.alcalinoterreos[5]+"|";
        Listas.table[18][2] = "Lauren.."+vector.actinidos[14]+"|";
        Listas.table[18][3] = "Ruther.."+vector.metales[5]+"|";
        Listas.table[18][4] = " Dubnio "+vector.metales[9]+"|";
        Listas.table[18][5] = "Seabor.."+vector.metales[13]+"|";
        Listas.table[18][6] = " Bohrio "+vector.metales[17]+"|";
        Listas.table[18][7] = " Hassio "+vector.metales[21]+"|";
        Listas.table[18][8] = "Meitne.."+vector.metales[25]+"|";
        Listas.table[18][9] = "Darmst.."+vector.metales[29]+"|";
        Listas.table[18][10] = "Roent.."+vector.metales[33]+"|";
        Listas.table[18][11] = "Coper.."+vector.metales[37]+"|";
        Listas.table[18][12] = "Nihonio"+vector.otrosMetales[4]+"|";
        Listas.table[18][13] = "Flerovi"+vector.otrosMetales[7]+"|";
        Listas.table[18][14] = "Moscovi"+vector.otrosMetales[9]+"|";
        Listas.table[18][15] = "Liver.."+vector.otrosMetales[10]+"|";
        Listas.table[18][16] = "Teneso "+vector.halogenos[5]+"|";
        Listas.table[18][17] = "Ogane.."+vector.gases[6]+"|";
        Listas.table[18][18] = "";

        /*                 */
        Listas.table[19][0] = "|    Fr °   |";
        Listas.table[19][1] = "     Ra $  |";
        Listas.table[19][2] = "     Lr =  |";
        Listas.table[19][3] = "     Rf +  |";
        Listas.table[19][4] = "     Db +  |";
        Listas.table[19][5] = "     Sg +  |";
        Listas.table[19][6] = "     Bh +  |";
        Listas.table[19][7] = "     Hs +  |";
        Listas.table[19][8] = "     Mt +  | ";
        Listas.table[19][9] = "    Ds +  |";
        Listas.table[19][10] = "   Rg +   | ";
        Listas.table[19][11] = "   Cn +  | ";
        Listas.table[19][12] = "   Nh &  | ";
        Listas.table[19][13] = "   Fl &  |  ";
        Listas.table[19][14] = "   Mc & | ";
        Listas.table[19][15] = "   Lv &  | ";
        Listas.table[19][16] = "   Ts ¬  |  ";
        Listas.table[19][17] = "   Og % |";
        Listas.table[19][18] = ""; 

        /*                        */
        Listas.table[20][0] = "|   223.0   |";
        Listas.table[20][1] = "   226.0   |";
        Listas.table[20][2] = "   227.0   |";
        Listas.table[20][3] = "   263.1   |";
        Listas.table[20][4] = "   262.1   |";
        Listas.table[20][5] = "   266.1   |";
        Listas.table[20][6] = "   264.0   |";
        Listas.table[20][7] = "   277.0   |";
        Listas.table[20][8] = "   268.0   |";
        Listas.table[20][9] = "   271.0   |";
        Listas.table[20][10] = "  272.0   |";
        Listas.table[20][11] = "  285.0   |";
        Listas.table[20][12] = "  284.0   |";
        Listas.table[20][13] = "  289.0   |";
        Listas.table[20][14] = "  288.0   |";
        Listas.table[20][15] = "  292.0   |";
        Listas.table[20][16] = "  294.0   |";
        Listas.table[20][17] = "  294.0   |";
        Listas.table[20][18] = "";

        Listas.table2[0][0] = " ";
        Listas.table2[0][1] = " ";
        Listas.table2[0][2] = " ";
        Listas.table2[0][3] = "";
        Listas.table2[0][4] = "";
        Listas.table2[0][5] = "";
        Listas.table2[0][6] = "";
        Listas.table2[0][7] = "";
        Listas.table2[0][8] = "";
        Listas.table2[0][9] = "58";
        Listas.table2[0][10] = "";
        Listas.table2[0][11] = "";
        Listas.table2[0][12] = "";
        Listas.table2[0][14] = " 58|";
       
        Listas.table2[1][0] = "|Lantano  "+vector.lantanidos[0]+"|";
        Listas.table2[1][1] = " Cerio   "+vector.lantanidos[1]+"|";
        Listas.table2[1][2] = "Praseodim"+vector.lantanidos[2]+"|";
        Listas.table2[1][3] = "Neodimio "+vector.lantanidos[3]+"|";
        Listas.table2[1][4] = "Prometio "+vector.lantanidos[4]+"|";
        Listas.table2[1][5] = " Samario "+vector.lantanidos[5]+"|";
        Listas.table2[1][6] = " Europio "+vector.lantanidos[6]+"|";
        Listas.table2[1][7] = "Gadolinio"+vector.lantanidos[7]+"|";
        Listas.table2[1][8] = " Terbio "+vector.lantanidos[8]+"|";
        Listas.table2[1][9] = "Disprosi"+vector.lantanidos[9]+"|";
        Listas.table2[1][10] = " Holmio "+vector.lantanidos[10]+"|";
        Listas.table2[1][11] = " Erbio  "+vector.lantanidos[11]+"|";
        Listas.table2[1][12] = " Tulio  "+vector.lantanidos[12]+"|";
        Listas.table2[1][13] = "Iterbio "+vector.lantanidos[13]+"|";
        Listas.table2[1][14] = "";
        Listas.table2[1][14] = "";


        /*                           */
        Listas.table2[2][0] = "|    La *   |";
        Listas.table2[2][1] = "     Ce *  |";
        Listas.table2[2][2] = "     Pr *  |";
        Listas.table2[2][3] = "     Nd *  |";
        Listas.table2[2][4] = "     Pm *  |";
        Listas.table2[2][5] = "     Sm *  |";
        Listas.table2[2][6] = "     Eu *  |";
        Listas.table2[2][7] = "     Gd *  |";
        Listas.table2[2][8] = "     Tb * |";
        Listas.table2[2][9] = "     Dy * |";
        Listas.table2[2][10] = "    Ho *  |";
        Listas.table2[2][11] = "    Er *  |";
        Listas.table2[2][12] = "    Tm *  |";
        Listas.table2[2][13] = "    Yb *  |";
        Listas.table2[2][14] = "";


        /*                        */
        Listas.table2[3][0] = "|   138.9   |";
        Listas.table2[3][1] = "   140.1   |";
        Listas.table2[3][2] = "   140.9   |";
        Listas.table2[3][3] = "   144.2   |";
        Listas.table2[3][4] = "   145.0   |";
        Listas.table2[3][5] = "   150.3   |";
        Listas.table2[3][6] = "   151.9   |";
        Listas.table2[3][7] = "   157.2   |";
        Listas.table2[3][8] = "   158.9  |";
        Listas.table2[3][9] = "   162.5  |";
        Listas.table2[3][10] = "  164.9   |";
        Listas.table2[3][11] = "  167.2   |";
        Listas.table2[3][12] = "  168.9   |";
        Listas.table2[3][13] = "  173.0   |";
        Listas.table2[3][14] = "_____________________________________________________________________________________________________________";

      
        Listas.table2[4][0] = "| Actinio "+vector.actinidos[0]+"|";
        Listas.table2[4][1] = " Torio   "+vector.actinidos[1]+"|";
        Listas.table2[4][2] = "Protactin"+vector.actinidos[2]+"|";
        Listas.table2[4][3] = " Uranio  "+vector.actinidos[3]+"|";
        Listas.table2[4][4] = "Neptunio "+vector.actinidos[4]+"|";
        Listas.table2[4][5] = "Plutonio "+vector.actinidos[5]+"|";
        Listas.table2[4][6] = "Americio "+vector.actinidos[6]+"|";
        Listas.table2[4][7] = " Curio   "+vector.actinidos[7]+"|";
        Listas.table2[4][8] = "Berkelio"+vector.actinidos[8]+"|";
        Listas.table2[4][9] = "Californ"+vector.actinidos[9]+"|";
        Listas.table2[4][10] = "Einsten "+vector.actinidos[10]+"|";
        Listas.table2[4][11] = "Fermio "+vector.actinidos[11]+"|";
        Listas.table2[4][12] = "Mende.."+vector.actinidos[12]+"|";
        Listas.table2[4][13] = "Nobelio"+vector.actinidos[13]+"|";
        Listas.table2[4][14] = "";

        Listas.table2[5][0] = "|     Ac =  |";
        Listas.table2[5][1] = "     Th =  |";
        Listas.table2[5][2] = "     Pa =  |";
        Listas.table2[5][3] = "     U =   |";
        Listas.table2[5][4] = "     Np =  |";
        Listas.table2[5][5] = "     Pu =  |";
        Listas.table2[5][6] = "     Am =  |";
        Listas.table2[5][7] = "     Cm =  |";
        Listas.table2[5][8] = "     Bk = |";
        Listas.table2[5][9] = "     Cf = |";
        Listas.table2[5][10] = "    Es =  |";
        Listas.table2[5][11] = "    Fm =  |";
        Listas.table2[5][12] = "    Md =  |";
        Listas.table2[5][13] = "    No =  |";
        Listas.table2[5][14] = "";

        Listas.table2[6][0] = "|   227.0   |";
        Listas.table2[6][1] = "   232.0   |";
        Listas.table2[6][2] = "   231.0   |";
        Listas.table2[6][3] = "   238.0   |";
        Listas.table2[6][4] = "   237.0   |";
        Listas.table2[6][5] = "   244.0   |";
        Listas.table2[6][6] = "   243.0   |";
        Listas.table2[6][7] = "   247.0   |";
        Listas.table2[6][8] = "   247.0  |";
        Listas.table2[6][9] = "   251.0  |";
        Listas.table2[6][10] = "  252.0   |";
        Listas.table2[6][11] = "  257.0   |";
        Listas.table2[6][12] = "  258.0   |";
        Listas.table2[6][13] = "  259.0   |";
        Listas.table2[6][14] = "";
        Listas.formato2();
        Listas.formato();

    }
}
