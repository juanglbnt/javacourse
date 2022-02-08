import com.loaizajuan.factoryExercise.Fabrica;
import com.loaizajuan.factoryExercise.Transporte;

public class Main {

    public static void main(String[] args) {
        Transporte t1 = Fabrica.construir("automovil");

        t1.arrancar();
        t1.detener();
        System.out.println(t1.tipo());
    }
}
