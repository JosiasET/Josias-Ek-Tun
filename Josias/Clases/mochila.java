package Josias.Clases;

public class mochila{

    private String marca;
    private String color;
    private String bordes;
    private String adorno;
    private int cierres;
    private String tamano;

    private boolean estado = false;
    private int almacen = 5;



    public mochila(){
        marca = "nike";
        color = "negro";
        bordes = "rojo";
        adorno = "gris";
        cierres = 4;
        tamano = "mediano";
        
    }
    
    public void estado(boolean e){
        if(e == true){
            System.out.println("Esta abierta la mochila");
        }else if( e == false){
            System.out.println("La mochila esta cerrada");
            e = true;
            System.out.println("La mochila se esta abriendo");
        }
    }

    public void almacen(int a){
        int lim = almacen;

        if(a < lim){
            System.out.println("Acabas de meter "+ a);
            a = almacen - a;
            System.out.println("Y te queda de espacio "+ a);
        }else if(a > lim){
            System.out.println("La mochila ya esta llena no puedes meter otros objetos");
        }


    }
    

    
}
