/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themeparkticketingsystem;

/**
 *
 * @author Nicholas Tan
 */
public class GalaxyStation implements Attractions{ 
    
    private String gamesName;
    public double gamePrice;

    @Override
    public void selectGameAndPrice(int gameNumber) {
        
        if (gameNumber==1){
            gamesName="Dizzy Izzy";
            gamePrice=10.00;
    
        }
        else if (gameNumber==2){
            gamesName="Supersonic Odyssey";
            gamePrice=11.00;
    
        }
        else if (gameNumber==3){
            gamesName="Spinning Object";
            gamePrice=8.50;
    
        }
    }

    @Override
    public String getGameName() {
        return gamesName;
    }

    @Override
    public double getGamePrice() {
       
        return gamePrice;
    }
    
    
    
}
