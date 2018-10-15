package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;

public class LecturaElem{

    public String leerJSONElem(int indice){
        try{

            JSONParser parser = new JSONParser();
            JSONArray arregloJson = (JSONArray) parser.parse(new FileReader("C:/Users/metal/Documents/GitHub/EXAMEN_POO-1/src/sample/Elementos.json"));
            JSONObject elemento = (JSONObject) arregloJson.get(indice);

            String hola=

            "Nombre: "+elemento.get("name").toString()+"\n"+
            "Apariencia: "+elemento.get("appearance").toString()+"\n"+
            "Masa atómica: "+elemento.get("atomic_mass").toString()+"\n"+
            "Punto de ebullición: "+elemento.get("boil").toString()+"\n"+
            "Categoría: "+elemento.get("category").toString()+"\n"+
            "Color: "+elemento.get("color").toString()+"\n"+
            "Densidad: "+elemento.get("density").toString()+"\n"+
            "Descubierto por: "+elemento.get("discovered_by").toString()+"\n"+
            "Punto de fusión: "+elemento.get("melt").toString()+"\n"+
            "Capacidad térmica molar: "+elemento.get("molar_heat").toString()+"\n"+
            "Nombrado por: "+elemento.get("named_by").toString()+"\n"+
            "Número: "+elemento.get("number").toString()+"\n"+
            "Period: "+elemento.get("period").toString()+"\n"+
            "Fase: "+elemento.get("phase").toString()+"\n"+
            "Símbolo: "+elemento.get("symbol").toString()+"\n"+
            "Informacion: "+elemento.get("summary").toString()+"\n";

            return hola;
        }
        catch (FileNotFoundException e){
          System.out.print(e);
        }
        catch (IOException e){
          System.out.print(e);
        }
        catch (ParseException e){
        System.out.print(e);        
        }
        catch (NullPointerException e){
            System.out.print(e);
        }
        return "";
    }
}
