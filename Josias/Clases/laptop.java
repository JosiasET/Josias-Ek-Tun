package Josias.Clases;

public class laptop {
    private String marca;
    private String color;
    private String tamano;
    private String version;
    private String procesador;
    private String discoDuro;
    private boolean estado;
    private String escribir;

    public laptop(){
        marca = "Lenovo";
        color = "Azul";
        tamano = "33 x 22";
        version = "Windows 10";
        procesador = "core i3";
        discoDuro = "1 TB";
        escribir = "Hola persona";
    }
    public laptop(String marca, String c, String t, String v, String p, String dd, String es){
        color = c.equals("")? "Azul":c;
        this.marca = marca.equals("")?"Lenovo":marca;
        tamano = t.equals("")?"33 x 25":t;
        version = v.equals("")?"Windows 10":v;
        procesador = p.equals("")?"Core i3":p;
        discoDuro = dd.equals("")?"1 tb":dd;
        escribir = es.equals("")?"Hola persona hermosa":es;

    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        this.marca = m.equals("")?"HP":m;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c.equals("")?"Azul":c;
    }

    public String getTamano(){
        return tamano;
    }
    public void setTamano(String t){
        this.tamano = t.equals("")?"33 x 21 cm":t;
    }

    public String getVersion(){
        return version;
    }
    public void setVersion(String v){
        this.version = v.equals("")?"Windows 10":v;
    }

    public String getProcesador(){
        return procesador;
    }
    public void setProcesador(String p){
        this.procesador = p.equals("")?"core i3":p;
    }

    public String getDiscoDuro(){
        return discoDuro;
    }
    public void setDiscoDuro(String d){
        this.discoDuro = d.equals("")?"1 TB":d;
    }

    public void estado(boolean e){
        if(e == true){
            System.out.println("La laptop esta encendida");
        }
        else if(e == false){  
            System.out.println("La laptop se encuentra ahora apagada");
            e = true;
            System.out.println("Se esta encendiendo.");
        }
    }

    public void escribiendo(){

        if(estado == true){
            System.out.println(escribir);
        }else if(estado == false){
            System.out.println("No se puede escribir, debes de encenderme antes");
        }

    }
    
    public static void main(String[] arg){
        laptop compu = new laptop();
        
        compu.estado(true);
        compu.escribiendo();

        mochila mo = new mochila();

        mo.almacen(3);
        


    }
}
