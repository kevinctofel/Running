/* Convert MPH to pace per mile
   Kevin C. Tofel
   Version 1.0
   November 12, 2018
*/

import javax.swing.JOptionPane;

public class MPHtoPacePerMile {
   
   public static void main (String[] args) {
   
      String speed;
      double speedDbl, mileSec, mileMin, secMile; 
      
      speed = JOptionPane.showInputDialog(null, "Enter speed in MPH");
      speedDbl = Double.parseDouble(speed); // Convert speed string to double
      mileSec = 3600/speedDbl; // Mile per second at input speed
      mileMin = mileSec / 60;  // Minutes per mile at input speed
      secMile = mileSec % 60; // Left over seconds (if any) for minutes per mile
   
      if (secMile < 10)
      {
         JOptionPane.showMessageDialog(null, speedDbl + " MPH is " + (int)mileMin + ":0" + (int)secMile + " per mile pace.");
      }
      else
      {
         JOptionPane.showMessageDialog(null, speedDbl + " MPH is " + (int)mileMin + ":" + (int)secMile + " per mile pace.");
      }
      System.exit(0);
   }
}
