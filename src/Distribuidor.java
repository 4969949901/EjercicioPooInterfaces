public class Distribuidor implements Vehiculo,Carro,Motocicleta{
    @Override
    public int modeloCarro(int modeloCarro) {
        return modeloCarro;
    }

    @Override
    public String marcaCarro(String marcaCarro) {
        return marcaCarro;
    }

    @Override
    public String colorCarro(String colorCarro) {
        return colorCarro;
    }

    @Override
    public int modeloMotocicleta(int modeloMotocicleta) {
        return modeloMotocicleta;
    }

    @Override
    public String marcaMotocicleta(String marcaMotocicleta) {
        return marcaMotocicleta;
    }

    @Override
    public String colorMotocicleta(String colorMotocicleta) {
        return colorMotocicleta;
    }

    @Override
    public String tipoVehiculo(String tipoVehiculo) {
        return tipoVehiculo;
    }

    @Override
    public String arrancar( String arrancar) {
        return arrancar;
    }

    @Override
    public String detener(String detener) {
        return detener;
    }

    @Override
    public double velMaxima(double velMaxima) {
        return velMaxima;
    }

    @Override
    public double velMinima(double velMinima) {
        return velMinima;
    }
}
