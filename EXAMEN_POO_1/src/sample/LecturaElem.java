package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.nio.file.Files;

public class LecturaElem{

    public Elementos leerJSONElem(int indice){
        Elementos nuevo = new Elementos();
        try{
        JSONParser parser = new JSONParser();
        JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("C:/Users/metal/Documents/GitHub/EXAMEN_POO-1/src/sample/Elementos.json"));
        JSONObject elemento= (JSONObject) arregloJson.get(indice);

        nuevo = new Elementos(

        elemento.get("name").toString(),
        elemento.get("appearance").toString(),
        elemento.get("atomic_mass").toString(),
        elemento.get("boil").toString(),
        elemento.get("category").toString(),
        elemento.get("color").toString(),
        elemento.get("density").toString(),
        elemento.get("discovered_by").toString(),
        elemento.get("melt").toString(),
        elemento.get("molar_heat").toString(),
        elemento.get("named_by").toString(),
        elemento.get("period").toString(),
        elemento.get("phase").toString(),
        elemento.get("summary").toString(),
        elemento.get("symbol").toString()

            );
        System.out.println("retorno");
            return nuevo;
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
        Elementos hola=new Elementos();
     return hola;
    }
}
