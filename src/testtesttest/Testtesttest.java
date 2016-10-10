/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtesttest;

/**
 *
 * @author School
 */
public class Testtesttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] arr1 = new int[10][10];
        int[] arr2 = new int[10];
        String[] map = new String[30];
        
        for(int i=0;i<30;i++){
            map[i]="";
        }
        
        for(int i=0;i<10;i++){
            for(int u=0;u<10;u++){
                arr1[i][u]=(int)(Math.random()*2);
                if(arr1[i][u]==1){
                    map[(0+(i*3))]+="|---|";
                    map[(1+(i*3))]+="|   |";
                    map[(2+(i*3))]+="|___|";
                }else{
                    map[(0+(i*3))]+="     ";
                    map[(1+(i*3))]+="     ";
                    map[(2+(i*3))]+="     ";
                }
            }
        }

        for(int i=0;i<30;i++){
                System.out.println(map[i]);
            }
            System.out.println();
        }

    }
    
    

