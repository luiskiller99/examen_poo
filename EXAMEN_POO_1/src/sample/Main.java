package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.stream.events.EndElement;

public class Main extends Application {
    private LecturaElem prin = new LecturaElem();
    private Elementos eprin = new Elementos();

    @Override

    public void start(Stage primaryStage) throws Exception{
        for (int i = 0 ; i < 118 ; i++){
            eprin.añadirElemento(prin.leerJSONElem(i));
        }
        System.out.println(0+" : "+eprin.getArray_Tabla().get(1).nombre+"\n");

        /**for(int i = 0 ; i < eprin.getArray_Tabla().size() ; i++){
            System.out.println(i+" : "+eprin.getArray_Tabla().get(0).masa_atomica+"\n");
        }*/


        Parent root = FXMLLoader.load(getClass().getResource("Tabla periódica.fxml"));
        primaryStage.setTitle("Tabla periodica de lo elementos");
        primaryStage.setScene(new Scene(root, 1376, 615));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
