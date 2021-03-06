import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Clase ReadAndWrite
 * Encargada de interactuar con el archivo de texto txt, leerlo y sobreescribirlo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 
public class ReadAndWrite {

    /**
     * Lee la informacion en el  archivo txt
     * El primer numero debe ser el  valor del contador 
     * @return devuelve un array de Strings con los valores correspondientes
     */
    public static ArrayList<String[]> read(){
        Scanner scan = findFile();
        ArrayList<String[]> data = new ArrayList<String[]>();

        while(scan.hasNext()){
            String line = scan.next();
            String[] splited = line.split(",");
            data.add(splited);
        }
        return data;
    }



    /**
     * Metodo que encuentra el archivo que se quiere leer
     * @return devuelve el scanner del archivo
     */
    private static Scanner findFile(){
        File file = null;
        Scanner scan = null;

        
        try{
            file = new File("./Ab DataCart.txt");
            scan  = new Scanner(file);
            
        }catch(FileNotFoundException e){
            System.out.println("El archivo no se encontro");
            System.exit(1);
        }

        return scan;
    }



    /**
     * Metodo que escribe un string
     * @param str String que se pone en el archivo
     */
    public static void writer(String str) {
        FileWriter writer  = null;
        
        try{
            writer = makeWriter();
            writer.write(str);
        }catch(IOException e){
            System.out.println("El archivo no se encontro");
            System.exit(1);
        }
      
    
    }


    /**
     * Encuentra el archivo e instancia el  FileWriter
     * @return
     */
    private static FileWriter makeWriter()throws IOException{

        File file = new File("./Ab DataCart.txt");
        FileWriter writer = new FileWriter(file);

        return writer;
    }
    
}
