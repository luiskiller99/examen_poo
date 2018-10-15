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
    private void act_bot_He() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/He.jpg"));
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

    }
    private void act_bot_Li() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Li.jpg"));
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

    }
    private void act_bot_Be() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Be.jpg"));
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
    }
    private void act_bot_B() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/B.jpg"));
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
    }
    private void act_bot_C() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/C.jpg"));
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
    }
    private void act_bot_N() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/N.jpg"));
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
    }
    private void act_bot_O() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/O.jpg"));
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
    }
    private void act_bot_F() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/F.jpg"));
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
    }
    private void act_bot_Ne() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ne.jpg"));
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
    }
    private void act_bot_Na() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Na.jpg"));
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
    }
    private void act_bot_Mg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mg.jpg"));
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
    }
    private void act_bot_Al() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Al.jpg"));
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
    }
    private void act_bot_Si() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Si.jpg"));
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
    }
    private void act_bot_P() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/P.jpg"));
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
    }
    private void act_bot_S() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/S.jpg"));
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
    }
    private void act_bot_Cl() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cl.jpg"));
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
    }
    private void act_bot_Ar() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ar.jpg"));
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
    }
    private void act_bot_K() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/K.jpg"));
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
    }
    private void act_bot_Ca() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ca.jpg"));
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
    }
    private void act_bot_Sc() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sc.jpg"));
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
    }
    private void act_bot_Ti() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ti.jpg"));
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
    }
    private void act_bot_V() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/V.jpg"));
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
    }
    private void act_bot_Cr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cr.jpg"));
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
    }
    private void act_bot_Mn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mn.jpg"));
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
    }
    private void act_bot_Fe() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Fe.jpg"));
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
    }
    private void act_bot_Co() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Co.jpg"));
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
    }
    private void act_bot_Ni() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ni.jpg"));
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
    }
    private void act_bot_Cu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cu.jpg"));
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
    }
    private void act_bot_Zn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Zn.jpg"));
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
    }
    private void act_bot_Ga() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ga.jpg"));
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
    }
    private void act_bot_Ge() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ge.jpg"));
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
    }
    private void act_bot_As() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/As.jpg"));
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
    }
    private void act_bot_Se() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Se.jpg"));
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
    }
    private void act_bot_Br() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Br.jpg"));
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
    }
    private void act_bot_Kr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Kr.jpg"));
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
    }
    private void act_bot_Rb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rb.jpg"));
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
    }
    private void act_bot_Sr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sr.jpg"));
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
    }
    private void act_bot_Y() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Y.jpg"));
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
    }
    private void act_bot_Zr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Zr.jpg"));
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
    }
    private void act_bot_Nb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Nb.jpg"));
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
    }
    private void act_bot_Mo() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Mo.jpg"));
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
    }
    private void act_bot_Tc() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tc.jpg"));
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
    }
    private void act_bot_Ru() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ru.jpg"));
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
    }
    private void act_bot_Rh() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Rh.jpg"));
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
    }
    private void act_bot_Pd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pd.jpg"));
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
    }
    private void act_bot_Ag() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ag.jpg"));
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
    }
    private void act_bot_Cd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cd.jpg"));
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
    }
    private void act_bot_In() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/In.jpg"));
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
    }
    private void act_bot_Sn() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sn.jpg"));
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
    }
    private void act_bot_Sb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sb.jpg"));
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
    }
    private void act_bot_Te() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Te.jpg"));
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
    }
    private void act_bot_I() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/I.jpg"));
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
    }
    private void act_bot_Xe() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Xe.jpg"));
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
    }
    private void act_bot_Cs() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Cs.jpg"));
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
    }
    private void act_bot_Ba() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ba.jpg"));
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
    }
    private void act_bot_La() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/La.jpg"));
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
    }
    private void act_bot_Ce() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ce.jpg"));
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
    }
    private void act_bot_Pr() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pr.jpg"));
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
    }
    private void act_bot_Nd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Nd.jpg"));
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
    }
    private void act_bot_Pm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pm.jpg"));
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
    }
    private void act_bot_Sm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Sm.jpg"));
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
    }
    private void act_bot_Eu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Eu.jpg"));
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
    }
    private void act_bot_Gd() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Gd.jpg"));
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
    }
    private void act_bot_Tb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tb.jpg"));
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
    }
    private void act_bot_Dy() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Dy.jpg"));
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
    }
    private void act_bot_Ho() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ho.jpg"));
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
    }
    private void act_bot_Er() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Er.jpg"));
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
    }
    private void act_bot_Tm() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Tm.jpg"));
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
    }
    private void act_bot_Yb() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Yb.jpg"));
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
    }
    private void act_bot_Lu() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Lu.jpg"));
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
    }
    private void act_bot_Hf() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Hf.jpg"));
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
    }
    private void act_bot_Ta() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ta.jpg"));
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
    }
    private void act_bot_W() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/W.jpg"));
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
    }
    private void act_bot_Re() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Re.jpg"));
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
    }
    private void act_bot_Os() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Os.jpg"));
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
    }
    private void act_bot_Ir() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Ir.jpg"));
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
    }
    private void act_bot_Pt() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Pt.jpg"));
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
    }
    private void act_bot_Au() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Au.jpg"));
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
    }
    private void act_bot_Hg() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/Hg.jpg"));
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
    }
    private void act_bot_TI() throws Exception{
        Icon m= new ImageIcon(getClass().getResource("img/TI.jpg"));
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
    }


}
