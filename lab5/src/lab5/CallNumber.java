/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author FSKKP UMP
 */
public class CallNumber {
    
    private String callNum;
    //Book Genre
    // >>IT - Info. Tech, EE - Enginering ,FB - Fiction, SC - Social Sc, KD - Kids  ,
    
    //Book Location
    // >>01,02,03    

    public CallNumber(String callNum) {
        
        this.callNum = callNum;
    }   

    public String getCallNum() {
        return callNum;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }    
}
