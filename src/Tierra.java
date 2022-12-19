public class Tierra extends Cubito{
    private String color;
    private int dureza;
    private boolean pasto;


    public Tierra() {
        super();
        this.color = "verde";
        this.dureza = 3;
        this.pasto = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public void tienePasto(String respuesta){
        if( respuesta.equals("Si") ||respuesta.equals("SI") ){
            pasto = true;
        }else{
            pasto = false;
        }

    }

    public String mostrarPasto(){
        if(pasto == true){
            return "El bloque tiene pasto";
        }else{
            return "El bloque solo es de tierra";
        }
    }


}
