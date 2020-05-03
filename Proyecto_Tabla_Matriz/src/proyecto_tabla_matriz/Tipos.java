package proyecto_tabla_matriz;

public class Tipos {

    public static void OxidoMetalico(int numero, int vale, Listas signo) {
//Oxigeno + Metales
        for (int i = 0; i < signo.metales.length; i++) {
           
            
            for (int j = 0; j < signo.NameMetales.length; j++) {

                if (signo.metales[i] == numero && i == j) {
                    System.out.println("Has escogido " + signo.NameMetales[j] + " y valencia " + vale);

                    if (vale == 1) {
                        System.out.println("Monóxido de " + signo.NameMetales[j]);
                    }
                    System.out.println("Dióxido de " + signo.NameMetales[j]);
                }
                if (vale == 3) {
                    System.out.println("Trióxido de " + signo.NameMetales[j]);
                }
            }
        }
        if (vale == 2) {

        }

    }

    public static void OxidoNOMetalico(int numero, int valencia, Listas list) {
        //Reaccion OxidosNoMetalicos

        String elemento;
        for (int i = 0; i < list.noMetales.length; i++) {

            {
                for (int j = 0; j < list.NameNometales.length; j++) {
                    {
                        if (list.noMetales[i] == numero && i == j) {
                            System.out.println("Has escogido " + list.NameNometales[j] + " y valencia " + valencia);
                            if (valencia == 1) {
                                System.out.println("Monóxido de " + list.NameNometales[j]);
                            }
                            if (valencia == 2) {
                                System.out.println("Dióxido de " + list.NameNometales[j]);
                            }
                            if (valencia == 3) {
                                System.out.println("Trióxido de " + list.NameNometales[j]);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
    hidruros, son combinaciones de hidrógeno junto a un elemento metálico.
    En este tipo de compuestos los metales actúan con valencias positivas mientras 
    que el hidrógeno actúa con valencia -1.
     */
    //Metal +  hidrógeno.
    public static void HidruroMetalico(int numero, int vale2, Listas signo) {
        for (int i = 0; i < signo.metales.length; i++) {
          
            for (int j = 0; j < signo.NameMetales.length; j++) {
                if (signo.metales[i] == numero && i == j) {
                    System.out.println("Has escogido " + signo.NameMetales[j] + " y valencia " + vale2);
                    if (vale2 == 1) {
                        System.out.println("Hidruro de " + signo.NameMetales[j] + "");
                    }
                    if (vale2 == 2) {
                        System.out.println("Hidruro de " + signo.NameMetales[j] + " II");
                    }
                    if (vale2 == 3) {
                        System.out.println("Hidruro de " + signo.NameMetales[j] + " III");
                    }
                    if (vale2 == 4) {
                        System.out.println("Hidruro de " + signo.NameMetales[j] + " IV");
                    }

                }
            }

        }

    }
//Hidrógeno +  halogenos + 

    public static void Hidracidos(int numero, int vale2, Listas signo) {
        for (int i = 0; i < signo.halogenos.length; i++) {
           
            for (int j = 0; j < signo.NameHalogenos.length; j++) {
                if (signo.halogenos[i] == numero && i == j) {
                    System.out.println("Has escogido " + signo.NameHalogenos[j] + " y valencia " + vale2);

                    if (vale2 == 1) {
                        System.out.println("Ácido " + signo.NameHalogenos[j].charAt(0)
                                + signo.NameHalogenos[j].charAt(1)
                                + signo.NameHalogenos[j].charAt(2)
                                + signo.NameHalogenos[j].charAt(3)
                                + "hídrico"
                        );
                    }
                    if (vale2 == 2) {
                        System.out.println("Ácido " + signo.NameHalogenos[j].charAt(0)
                                + signo.NameHalogenos[j].charAt(1)
                                + signo.NameHalogenos[j].charAt(2)
                                + signo.NameHalogenos[j].charAt(3)
                                + "hídrico"
                        );
                    }
                    if (vale2 == 3) {
                        System.out.println("Ácido " + signo.NameHalogenos[j].charAt(0)
                                + signo.NameHalogenos[j].charAt(1)
                                + signo.NameHalogenos[j].charAt(2)
                                + signo.NameHalogenos[j].charAt(3)
                                + "hídrico"
                        );
                    }
                }
            }

        }

    }

    public static void Hidroxidos(int numero, int valencia, Listas list) {

//Metal + hidrógenos
        String elemento;
        for (int i = 0; i < list.metales.length; i++) {
           
            {
                for (int j = 0; j < list.NameMetales.length; j++) {
                    {
                        if (list.metales[i] == numero && i == j) {

                            System.out.println("Has escogido " + list.NameMetales[j] + " y valencia " + valencia);

                            if (valencia == 1) {
                                System.out.println("Hidróxido de " + list.NameMetales[j] + " ");
                            }
                            if (valencia == 2) {
                                System.out.println("Hidróxido de " + list.NameMetales[j] + " II");
                            }
                            if (valencia == 3) {
                                System.out.println("Hidróxido de " + list.NameMetales[j] + " III");
                            }
                        }
                    }
                }
            }
        }
    }

}
