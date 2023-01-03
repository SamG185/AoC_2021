
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samue
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int depth = 0;
        int horizontal = 0;
        int aim = 0;
        
        List<String>  aList = new ArrayList<>();
        File aFile = new File("input.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(aFile))) 
        {
            while (br.ready()) {
            aList.add(br.readLine());
        }
        }
        catch(IOException anException)
        {
            System.out.println("file not found");
        }
        
        for(int i = 0; i < aList.size(); i++)
        {
            String aLine = aList.get(i);
            
            if(aLine.startsWith("forward"))
            {
                int distance = Integer.parseInt(aLine.substring(aLine.length() - 1));
                horizontal = horizontal + distance;
                depth = depth + (aim * distance);
                
            }
            if(aLine.startsWith("down"))
            {
                int distance = Integer.parseInt(aLine.substring(aLine.length() - 1));
                aim = aim + distance;
            }
            if(aLine.startsWith("up"))
            {
                int distance = Integer.parseInt(aLine.substring(aLine.length() - 1));
                aim = aim - distance;
            }
            
        }
        System.out.println(horizontal);
        System.out.println(depth);
        
        System.out.println(horizontal * depth);
        
}
}
