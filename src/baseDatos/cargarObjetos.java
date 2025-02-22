package baseDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.reservacionHotel.Destino;

public class cargarObjetos implements Serializable{

    private static final String DIRECCION_BBDD="src/baseDatos/temp/"; //En esta ruta es donde se almacenan los archivos

    public static ArrayList<Destino> destinos(){ //Este método carga destinos

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DIRECCION_BBDD+"destinos.txt"))) {
            return (ArrayList<Destino>) ois.readObject();
        }
            
        catch(IOException | ClassNotFoundException e){
            System.out.println("Un momento, por favor.");
            return Destino.generadorDeDatos();
        }

    }
    
}
