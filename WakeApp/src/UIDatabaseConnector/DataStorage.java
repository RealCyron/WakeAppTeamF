package UIDatabaseConnector;

import java.io.IOException;
import java.io.*;


public class DataStorage {

public static void main(String[] args) {
// TODO Auto-generated method stub


File file = new File("data.txt"); //Datei, in die geschrieben werden soll

try {
BufferedWriter writer = new BufferedWriter(new FileWriter(file)); //Erzeugen eines effizienten Writers für Textdateien
writer.write("Test");
writer.newLine();
writer.write("Test");
writer.newLine();
writer.write("Test");
writer.newLine();
writer.write("Test1");
writer.close();
}
catch(IOException ioe) {
System.err.println(ioe);
}

}
public boolean speichern() {
return true;
}
}
