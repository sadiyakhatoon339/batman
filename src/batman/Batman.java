/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class Batman {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String a[][]=new String[1000][1000];
        for(int i=0;i<t;i++)
        {
            StringTokenizer tk=new StringTokenizer(br.readLine());   
            for(int j=0;j<4;j++)
            {
            for(int k=0;k<4;k++)
            {
               
            a[j][k]=(br.readLine());
            
            
            }}
             for(int j=0;j<4;j++)
            {
            for(int k=0;k<4;k++)
            {
                     System.out.print(a[j][k]);
                     
                
            }
            
                     System.out.println();
            }
               int c=0;
            for(int j=0;j<4;j++)
            {
            for(int k=0;k<4;k++)
            {
              if("x".equals(a[j][k])&&"x".equals(a[j+1][k])||"x".equals(a[j][k])
                      &&"x".equals(a[j+2][k])||"x".equals(a[j][j])&&"x".equals(a[j+1][j+1])
                      ||"x".equals(a[j][j])&&"x".equals(a[j+2][j+2])||"x".equals(a[j][k])
                      &&"x".equals(a[j][k+1])||"x".equals(a[j][k])&&"x".equals(a[j][k+2]))
                   
                  c++;
              }}
            if(c>0)
                     System.out.println("yes");
              else
                 System.out.println("no"); 
           
        }
        
        // TODO code application logic here
    }
    
}
