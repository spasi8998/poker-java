/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author LAB-INF
 */
public class CarteRandomUtility {
    
    private static String[] semi = {"CUORI", "FIORI", "PICCHE", "QUADRI"};
    private static String[] numeri = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    
    public static String getRandomCartaFileName() {
        //("images/" + (int)(Math.random() * 6 + 1) + ".jpg")
        int s = (int) (Math.random() * 4);
        int n = (int) (Math.random() * 10);
        
        String fileName;
        fileName = numeri[n] + semi[s] + ".JPG";
        return fileName;
    }
    
    
}
