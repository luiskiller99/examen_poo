package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.JOptionPane;
import java.awt.*;

import java.net.URISyntaxException;


public class Controller {
    private Stage primaryStage;
    @FXML
    private void act_bot_H() throws Exception{
        System.out.println("hola mundo");
        JOptionPane.showMessageDialog(null,
                "Name: Hydrogen\n"+
                "Appearance: colorless gas\n"+
                        "Atomic_mass: 1.008\n"+
                        "Boil: 20.271\n"+
                        "Category: diatomic nonmetal\n"+
                        "Color: No asignado\n"+
                        "Density: 0.08988\n"+
                "Discovered_by: Henry Cavendish\n"+
                "Melt: 13.99\n"+
                "Molar_heat: 28.836\n"+
                "Named_by: Antoine Lavoisier\n"+
                "Number: 1\n"+
                "Period: 1\n"+
                "Phase: Gas\n"+
                "Source: https://en.wikipedia.org/wiki/Hydrogen\n"+
                //"Spectral_img: https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg\n"+
                "Summary: Hydrogen is a chemical element with chemical symbol H and \n" +
                        "atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic \n" +
                        "table. Its monatomic form (H) is the most abundant chemical substance in the Universe, \n" +
                        "constituting roughly 75% of all baryonic mass.\n"+
                "Symbol: H\n"+
                "Xpos: 1\n"+
                "Ypos: 1\n"
                , "ELEMENTO", JOptionPane.PLAIN_MESSAGE);

        String URL="https://en.wikipedia.org/wiki/Hydrogen";
        String direccion = "https://www.youtube.com/watch?v=qNBGz_2XAVA";
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + URL);
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
        }
        catch(Exception err)
        {
            JOptionPane.showMessageDialog(null,"Error: "+err);
        }

    }
}
