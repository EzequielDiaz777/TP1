package Diaz_TP1;

public class TestJuego {

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println("El robot ha sido creado y esta esperando un humano que juegue con él.");
        Humano elroy = new Humano();
        System.out.println("Elroy ha tomado el robot para jugar con él.");
        System.out.println("Elroy esta jugando con el robot.");
        elroy.jugarConRobot(robot1);
        Humano lucero = new Humano();
        System.out.println("Vino Lucero y le pidio el robot para jugar un rato y el se lo da.");
        System.out.println("Lucero esta jugando con el robot.");
        lucero.jugarConRobot(robot1);
    }
}