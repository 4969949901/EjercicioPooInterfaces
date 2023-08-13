
// Ejercicio-Poo-Interfaces
public class Main {
    public static void main(String[] args) {
    Distribuidor dist=new Distribuidor();
        System.out.println();
        System.out.println("------------VEHICULOS----------\n");
        System.out.println(dist.tipoVehiculo("Automovil \n"));
        System.out.println(dist.modeloCarro(2023)+"\n");
        System.out.println(dist.marcaCarro("Honda\n"));
        System.out.println(dist.colorCarro("Rojo\n"));
        System.out.println(dist.arrancar("Encendido por llave o manual.\n"));
        System.out.println(dist.detener("Sensores y camaras para detenerse en caso de emergencia.\n"));
        System.out.println(dist.velMinima(5)+" KM  velocidad minima\n");
        System.out.println(dist.velMaxima(150)+" KM  velocidad maxima\n");
        System.out.println("------------VEHICULOS----------\n");
        System.out.println(dist.tipoVehiculo("Motocicleta \n"));
        System.out.println(dist.modeloMotocicleta(2023)+"\n");
        System.out.println(dist.marcaMotocicleta("Suzuki\n"));
        System.out.println(dist.colorMotocicleta("Rojo con franjas blancas.\n"));
        System.out.println(dist.arrancar("Encendido por patada o starte\n"));
        System.out.println(dist.detener("Cuenta con frenos de disco para deternerse con seguridad.\n"));
        System.out.println(dist.velMinima(5)+" KM  velocidad minima\n");
        System.out.println(dist.velMaxima(110)+" KM  velocidad maxima\n");

    }
}