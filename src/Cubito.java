public class Cubito {

    private double largo, alto, ancho;


    public Cubito(){
        largo = alto = ancho = 3.0;
    }


    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void mostrarTamanio(){
        System.out.println("El tamaño de los cubos es: " +
                getLargo() + " x " + getAncho() + " x " + getAlto() + " u.");
    }



}//FIN DE CUBITO
