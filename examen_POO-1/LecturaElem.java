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
    public void leerJSONElem(int indice){
        try{
        JSONParser parser=new JSONParser();
        JSONArray arregloJson= (JSONArray) parser.parse(new FileReader("D:/Descargas/Elementos.json"));
        JSONObject elemento= (JSONObject) arregloJson.get(indice);
        System.out.println("Nombre: "+elemento.get("name").toString());
        System.out.println("Apariencia: "+elemento.get("appearance").toString());
        System.out.println("Masa atómica: "+elemento.get("atomic_mass").toString());
        System.out.println("Punto de ebullición: "+elemento.get("boil").toString());
        System.out.println("Categoría: "+elemento.get("category").toString());
        System.out.println("Color: "+elemento.get("color").toString());
        System.out.println("Densidad: "+elemento.get("density").toString());
        System.out.println("Descubierto por: "+elemento.get("discovered_by").toString());
        System.out.println("Punto de fusión: "+elemento.get("melt").toString());
        System.out.println("Capacidad térmica molar: "+elemento.get("molar_heat").toString());
        System.out.println("Nombrado por: "+elemento.get("named_by").toString());
        System.out.println("Número: "+elemento.get("number").toString());
        System.out.println("Periodo: "+elemento.get("period").toString());
        System.out.println("Fase: "+elemento.get("phase").toString());
        System.out.println("Símbolo: "+elemento.get("symbol").toString());
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
    }
    
    public static void main (String args[]){
        LecturaElem hola=new LecturaElem();
        hola.leerJSONElem(0);       
        
    }
}
