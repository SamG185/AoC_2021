/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.advent_day_3;
import java.io.*;
import java.util.*;

/**
 *
 * @author samue
 */
public class Advent_day_3 {

    public static void main(String[] args) throws IOException {
        
        
        int zeroes;
        int ones;
        
        List<String>  aList = new ArrayList<>();
        List<String> intermediateList;
        List<String> passForwardList;
        
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
        
        passForwardList = aList;
        
        //determine whichnumber is more common here.
        for(int x = 0; x < 12; x++)
        {
            
            zeroes = 0;
            ones = 0;
            intermediateList = new ArrayList<>();
            
            for(int i = 0; i < passForwardList.size(); i++)
            {
                
                if(passForwardList.get(i).charAt(x) == '0')
                {
                    zeroes++;
                }
                else if(passForwardList.get(i).charAt(x) == '1')
                {
                    ones++;
                }
                
                
                
            }  
            
            if(zeroes > ones)
            {
                for(int i = 0; i < passForwardList.size(); i++)
                {
                    if(passForwardList.get(i).charAt(x)== '1')
                    {
                        intermediateList.add(passForwardList.get(i));
                        
                    }
                    
                }
            }
            else
            {
                for(int i = 0; i < passForwardList.size(); i++)
                {
                    if(passForwardList.get(i).charAt(x)== '0')
                    {
                        intermediateList.add(passForwardList.get(i));
                        
                    }
                    
                }
            }
            
            passForwardList = intermediateList;
            System.out.println(passForwardList);
            }  
            
            
        
        System.out.print(passForwardList);
        
        
}
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samue
 */

    
