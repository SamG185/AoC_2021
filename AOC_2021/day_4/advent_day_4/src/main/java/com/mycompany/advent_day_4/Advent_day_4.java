/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.advent_day_4;
import java.util.*;
import java.io.*;

/**
 *
 * @author samue
 */
public class Advent_day_4 {

    public static void main(String[] args) {
        List<String>  bingoInput = new ArrayList<>();
        List<List<String>>  bingoBoards = new ArrayList<>();
        List<String> tempBoard = new ArrayList<>();
        
        File aFile = new File("input.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(aFile))) 
        {
            
            bingoInput.add(br.readLine());
            while(br.ready())
            {
                for(int i = 0; i < 6; i++)
                {
                    tempBoard.add(br.readLine());
                    
                }
                
                bingoBoards.add(tempBoard);
                tempBoard.clear();
            }  
        
        }
        catch(IOException anException)
        {
            System.out.println("file not found");
            
        }
        
        
        
        System.out.println(bingoInput);
        System.out.println(bingoBoards);
    }
}
