package Diaz_TP1;

public class Robot {

    private int bateria;
    private boolean encendido;

    public Robot() {
        this.bateria = 1000;
        this.encendido = false;
    }
    
    public boolean getEncendido() {
        return encendido;
    }

    public void avanzar(int cantidadDePasos) {
        if (cantidadDePasos * 0.1 < bateria && encendido) {
            bateria -= cantidadDePasos * 0.1;
            System.out.println("El robot ha avanzado " + cantidadDePasos + " pasos.");
        } else if (!encendido) {
            System.out.println("El robot está apagado, por favor enciendalo para jugar con él.");
        } else {
            System.out.println("No hay suficiente bateria para jugar con el robot, por favor recarguelo.");
        }
    }

    public void retroceder(int cantidadDePasos) {
        if (cantidadDePasos * 0.1 < bateria && encendido) {
            bateria -= cantidadDePasos * 0.1;
            System.out.println("El robot ha retrocedido " + cantidadDePasos + " pasos.");
        } else if (!encendido) {
            System.out.println("El robot está apagado, por favor enciendalo para jugar con él.");
        } else {
            System.out.println("No hay suficiente bateria para jugar con el robot, por favor recarguelo.");
        }
    }

    public void dormir() {
        if (encendido) {
            encendido = false;
            System.out.println("El robot se ha dormido.");
        } else {
            System.out.println("El robot ya esta dormido.");
        }
    }

    public void despertar() {
        if (!encendido) {
            encendido = true;
            System.out.println("El robot se ha despertado.");
        } else {
            System.out.println("El robot ya esta despierto.");
        }
    }

    public void recargar() {
        if (encendido && !bateriaLlena()) {
            bateria = 1000;
            System.out.println("¡Bateria recargada!");
        } else if (!encendido) {
            System.out.println("El robot esta apagado, enciendalo antes de usarlo.");
        } else {
            System.out.println("La bateria ya esta llena, ¡A jugar!");
        }
    }

    public boolean bateriaLlena() {
        System.out.println("La bateria ya esta llena, ¡A jugar!");
        return bateria == 1000;
    }

    public boolean bateriaVacia() {
        System.out.println("La bateria esta vacia ¡Recargala para poder jugar!");
        return bateria == 0;
    }

    public int energiaActual() {
        System.out.println("La energia actual es de: " + bateria);
        return bateria;
    }
}