/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.guess.game;
import javax.swing.*;


/**
 *
 * @author hp
 */
public class NumberGuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int comnum=(int)(Math.random()*100+1);
        int userinput=0;
        System.out.println("The Correct Guess of the number is:"+comnum);
        int count=0;
        while(userinput!=comnum)
        {
            String res=JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Game",3);
            userinput=Integer.parseInt(res);
            JOptionPane.showMessageDialog(null," "+determineGuess(userinput,comnum,count));
         }
    }
        public static String determineGuess(int user,int com,int count)
        {
            
            if(user<=0||user>100)
            {
                return "Your guess is invalid";
            }
            else if(user==com)
            {
                count=count++;
                return "Your guess is Correct!!"+count;
            }
            else if(user> com)
            {
                count=count++;
                return "Your guess is too high,TRY AGAIN,\n TRY COUNT:"+ count;
            }
            else if(user< com)
            {
                count=count++;
                return "Your guess is too low,TRY AGAIN,\n TRY COUNT:"+ count;
            }
            else{
                count=count++;
                return "Your guess is Incorrect,TRY AGAIN,\n TRY COUNT:"+ count;
            }
        }
    
}
