/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themeparkticketingsystem;

/**
 *
 * @author Nicholas Tan
 */
public class FantasyGarden implements Attractions{
    
    private String gamesName;
    public double gamePrice;

    @Override
    public void selectGameAndPrice(int gameNumber) {
        
        if (gameNumber==1){
            gamesName="Cosmo Theater";
            gamePrice=5.50;
    
        }
        else if (gameNumber==2){
            gamesName="Honey Bump";
            gamePrice=6.50;
    
        }
        else if (gameNumber==3){
            gamesName="Crazy Bus";
            gamePrice=4.50;
    
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
