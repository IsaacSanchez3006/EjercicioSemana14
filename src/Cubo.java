import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cubo extends Figura {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double Area() {
        return 6 * lado * lado;
    }

    @Override
    double Perimetro() {
        return 0;
    }

    @Override
    double Volumen() {
        return lado * lado * lado;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Cubo");
        System.out.println("El Área es: " + Area());
        System.out.println("El Volumen es: " + Volumen());
    }
}
