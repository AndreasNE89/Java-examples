package com.company;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import sun.misc.IOUtils;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends factory {



    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/andreasengebretsen/Desktop/Master_Dissertation_Andreas_Engebretsen.pdf"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.print(everything.toString());


            try{
                PrintWriter writer = new PrintWriter("newDoc.txt", "UTF-8");
                writer.println(everything + "Hello");
                writer.close();

            } catch (IOException e) {
                System.out.print("Something went wrong....");
            }
            for (int i = 0; i <= everything.length(); i+=100)
                  {
                System.out.print("\n" + "Text found " + i);


            }

        }





    }
}
