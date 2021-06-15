package comm.example;

import java.io.*;

public class CopyByFileReaderWriter {
    
    public static void main(String[] args) throws IOException {
        
        File inputFile = new File("farrago.txt");
        File outputFile = new File("outagain.txt");
        
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        
        BufferedReader   inputStream = new BufferedReader(in);
        PrintWriter    outputStream = new PrintWriter(out);
         
        String l,m="";
        while ((l = inputStream.readLine()) != null) {
        	// this is code snippet to make the file encrypted. after every letter,
        	//it will shift 2 spaces ahead and show in output file. ex: abc --> cde
        	for (char c :l.toCharArray()) {
        	m += Character.toString((char) (((c - 'a' + 2) % 26) + 'a'));	
        	     	}
        	System.out.println(m);
            outputStream.println(m);
            m="";
        }
            
        in.close();
        out.close();
    }
}
