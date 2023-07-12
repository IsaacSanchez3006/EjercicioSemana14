import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double Area() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    double Perimetro() {
        return 0;
    }

    @Override
    double Volumen() {
        return (4 * Math.PI * radio * radio * radio) / 3;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Esfera");
        System.out.println("El Área es: " + Area());
        System.out.println("El Volumen es: " + Volumen());
    }
}
