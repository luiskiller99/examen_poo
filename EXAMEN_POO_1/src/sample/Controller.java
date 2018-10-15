package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

import java.net.URISyntaxException;


public class Controller {
    private Stage primaryStage;

    private LecturaElem hola = new LecturaElem();

    @FXML
    private void act_bot_H() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/H.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(0), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    @FXML
    private void act_bot_He() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/He.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(1), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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

    }@FXML
    private void act_bot_Li() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Li.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(2), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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

    }@FXML
    private void act_bot_Be() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Be.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(3), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_B() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/B.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(4), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_C() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/C.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(5), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_N() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/N.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(6), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_O() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/O.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(7), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_F() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/F.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(8), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ne() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ne.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(9), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Na() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Na.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(10), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Mg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mg.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(11), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Al() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Al.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(12), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Si() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Si.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(13), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_P() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/P.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(14), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_S() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/S.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(15), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cl() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cl.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(16), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ar() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ar.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(17), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_K() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/K.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(18), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ca() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ca.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(19), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sc() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sc.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(20), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ti() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ti.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(21), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_V() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/V.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(22), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(23), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Mn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mn.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(24), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Fe() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Fe.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(25), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Co() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Co.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(26), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ni() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ni.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(27), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cu.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(28), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Zn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Zn.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(29), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ga() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ga.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(30), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ge() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ge.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(31), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_As() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/As.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(32), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Se() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Se.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(33), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Br() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Br.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(34), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Kr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Kr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(35), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Rb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(36), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(37), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Y() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Y.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(38), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Zr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Zr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(39), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Nb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Nb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(40), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Mo() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mo.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(41), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Tc() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tc.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(42), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ru() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ru.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(43), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Rh() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rh.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(44), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pd.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(45), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ag() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ag.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(46), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cd.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(47), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_In() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/In.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(48), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sn.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(49), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(50), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Te() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Te.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(51), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_I() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/I.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(52), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Xe() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Xe.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(53), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cs() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cs.gif"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(54), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ba() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ba.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(55), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_La() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/La.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(56), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ce() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ce.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(57), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(58), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Nd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Nd.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(59), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pm.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(60), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sm.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(61), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Eu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Eu.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(62), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Gd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Gd.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(63), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Tb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(64), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Dy() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Dy.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(65), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ho() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ho.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(66), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Er() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Er.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(67), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Tm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tm.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(68), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Yb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Yb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(69), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Lu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Lu.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(70), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Hf() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Hf.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(71), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ta() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ta.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(72), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_W() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/W.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(73), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Re() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Re.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(74), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Os() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Os.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(75), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ir() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ir.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(76), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pt() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pt.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(77), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Au() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Au.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(78), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Hg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Hg.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(79), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_TI() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/TI.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(80), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pb.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(81), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Bi() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Bi.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(82), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Po() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Po.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(83), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_At() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/At.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(84), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Rn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rn.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(85), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Fr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Fr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(86), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ra() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ra.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(87), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ac() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ac.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(88), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Th() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Th.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(89), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pa() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pa.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(90), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_U() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/U.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(91), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Np() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Np.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(92), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Pu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pu.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(93), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Am() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Am.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(94), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cm.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(95), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Bk() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Bk.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(96), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Cf() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cf.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(97), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Es() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Es.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(98), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Fm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Fm.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(99), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Md() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Md.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(100), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_No() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/No.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(101), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Lr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Lr.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(102), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Rf() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rf.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(103), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Db() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Db.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(104), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Sg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sg.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(105), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Bh() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Bh.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(106), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Hs() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Hs.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(107), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Mt() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mt.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(108), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Ds() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ds.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(109), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Rg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rg.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(110), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uub() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uub.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(111), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uut() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uut.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(112), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uuq() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uuq.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(113), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uup() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uup.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(114), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uuh() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uuh.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(115), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uus() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uus.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(116), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
    }@FXML
    private void act_bot_Uuo() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Uuo.jpg"));
        JOptionPane.showMessageDialog(null,hola.leerJSONElem(117), "ELEMENTO", JOptionPane.PLAIN_MESSAGE,m);
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
