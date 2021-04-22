package Diaz_TP1;

import java.util.Scanner;

public class Humano {

    public void jugarConRobot(Robot robot1) {
        robot1.despertar();
        robot1.avanzar(500);
        robot1.retroceder(20);
        Scanner sc = new Scanner(System.in);
        int mover;
        while (robot1.getEncendido()) {
            robot1.energiaActual();
            System.out.println("Escriba 'avanzar' o 'retroceder' para que el robot avance o retroceda, o 0 si desea apagar al robot:");
            String aor = sc.next();
            switch (aor) {
                case "avanzar":
                    do {
                        System.out.println("¿Cuantos pasos desea que el robot avance (el número debe ser mayor a 0 para que el robot pueda moverse)?");
                        mover = sc.nextInt();
                    } while (mover < 1);
                    robot1.avanzar(mover);
                    break;
                case "retroceder":
                    do {
                        System.out.println("¿Cuantos pasos desea que el robot retroceda (el número debe ser mayor a 0 para que el robot pueda moverse)?");
                        mover = sc.nextInt();
                    } while (mover < 1);
                    robot1.retroceder(mover);
                    break;
                case "0":
                    robot1.dormir();
                    break;
                default:
                    System.out.println("La acción elegida es incorrecta, por favor elija una nueva acción.");
                    break;
            }
        }
    }
}