package sample;
import java.util.ArrayList;

public class Elementos{
    private ArrayList<Elementos> Array_Tabla = new ArrayList<Elementos>();
    String nombre;
    String apariencia;
    String masa_atomica;
    String boil;
    String category;
    String color;
    String dencidad;
    String descubierto;
    String melt;
    String molar;
    String named;
    String period;
    String phase;
    String sumuary;
    String symbol;

    public Elementos(){}

    public Elementos(
            String nombre,
            String apariencia,
            String masa_atomica,
            String boil,
            String category,
            String color,
            String dencidad,
            String descubierto,
            String melt,
            String molar,
            String named,
            String period,
            String phase,
            String sumuary,
            String symbol
            ){
        nombre = nombre;
        apariencia=apariencia;
        masa_atomica=masa_atomica;
        boil=boil;
        category=category;
        color=color;
        dencidad=dencidad;
        descubierto=descubierto;
        melt=melt;
        molar=molar;
        named=named;
        period=period;
        phase=phase;
        sumuary=sumuary;
        symbol=symbol;
    }
    public ArrayList<Elementos> getArray_Tabla(){
        return Array_Tabla;
    }
    public void añadirElemento(Elementos ne){ Array_Tabla.add(ne); }
}

