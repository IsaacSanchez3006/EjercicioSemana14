import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double Area() {
        return lado * lado;
    }

    @Override
    double Perimetro() {
        return 4 * lado;
    }

    @Override
    double Volumen() {
        return 0;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Cuadrado");
        System.out.println("El Área es: " + Area());
        System.out.println("El Perímetro es: " + Perimetro());
    }
}
