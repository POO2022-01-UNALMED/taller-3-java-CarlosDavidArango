package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca= marca;
        this.estado = estado;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public Control getControl() {
        return control;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }public int getVolumen() {
        return volumen;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getCanal() {
        return canal;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public static int getNumTV() {
        return numTV;
    }
    public boolean getEstado() {
        return this.estado;
    }

    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }

    public void canalUp(){
        if (this.canal == 120){
            return;
        }
        else if(this.estado){
            this.canal++;
        }
        else{
            return;
        }
    }
    public void canalDown(){
        if (this.canal == 1){
            return;
        }
        else if(this.estado){
            this.canal--;
        }
        else{
            return;
        }
    }

    public void volumenUp(){
        if (this.volumen == 7){
            return;
        }
        else if(this.estado){
            this.volumen++;
        }
        else{
            return;
        }
    }
    public void volumenDown(){
        if (this.volumen == 0){
            return;
        }
        else if(this.estado){
            this.volumen--;
        }
        else{
            return;
        }
    }

}
