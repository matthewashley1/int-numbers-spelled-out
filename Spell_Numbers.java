
/**
 * The Spell_Numbers class takes in a number in a int variable and returns 
 * that number spelled out in word form. Example (45: forty five, 1200: one thousand two hundred). 
 *Joanna
 */

public class Spell_Numbers {
   
    private int a;
    private int b;
    private int c;
    private int temp;
    private int jump;
    
/**
 * Initilzes variables used within the Number_Spell method.
 */    
    
    public Spell_Numbers() {
        
       a = 0; //Variable for the number of digits in the number to be spelled
              //out. Is the size of the array used.
       b = 0; //Equals variable a and used to arrange the digits of the number 
              //back into correct order. Also used to evaluate the digit
              //in the place of the array.
       c = 0; //Used to tell when the number has a full tens place in 
              //the thousands and millions place (Example: 20,30,40...).
              //Variable c is also used to tell when the number has a full
              //Hundreds place in the thousands and millions place
              //(Example: 200,300,400...).
       temp = 0; //Equals variable Numbers and used to short digits into 
                 //an array.
       jump = 0; //Used to skip ones, thousands, and millions place
                 //if number has a one in the tens, ten thousands, and 
                 //ten millions place.
    }

/**
 * Spells out the imputed number into word form.
 * Variable Numbers is the number to be spelled out
 * @parma Numbers is the imputed number to be spelled out.
 */
    
    public void Number_Spell(int Numbers) {
                     
        temp = Numbers;
        
        if (Numbers == 0) {
            System.out.print("Zero"); }
                     
        //Figures out how many digits are in the number to initializes the 
        //array used to store each digit of the number.
        while (Numbers > 0) {            
            Numbers = (Numbers / 10);
            a++;}
                    
         int [] array = new int[a]; //Array used to store each digit of the 
                                    //number in reverse order.
         b = (a - 1);//Sets variable to look at numbers within array in reverse!
        
        //Arranges each digit of the number into an array, but into 
        //Reverse order.
        for (int i = 0; 0 < temp; i++) {
            array [i] = (temp % 10);
            temp = (temp / 10);  }
                                    
        //Determines the size of the number and the value of each digit and
        //then prints that value to the screen.
        for (int j = 0; j < a; j++) {
            //Determines the value of the tens place for ten, ten thousand, 
            //and ten million and then prints that value to the screen.
            //Has conditions to determine if the tens place for the 
            //ten thousands and ten millions place has a full 
            //number in it, (Example: 20,30,40...).
            if ((b == 1) || (b == 4) || (b == 7)) {
                if (b == 1) {
                    c = 0; }
                if (b == 4) {
                    c = 3; }
                if (b == 7){
                    c = 6; }
                //Determines if the tens place has a teen value in it for 
                //ten, ten thousand, and ten million place.
                if (array [b] == 1) {
                    jump = 1;
                    if (array [c] == 0) {
                        System.out.print(" Ten ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 1) {
                        System.out.print(" Eleven ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 2) {
                        System.out.print(" Twelve ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 3) {
                        System.out.print(" Thirteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 4) {
                        System.out.print(" Fourteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 5) {
                        System.out.print(" Fifteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 6) {
                        System.out.print(" Sixteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 7) {
                        System.out.print(" Seventeen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 8) {
                        System.out.print(" Eighteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}
                    else if (array [c] == 9) {
                        System.out.print(" Nineteen ");
                        if (b == 4) {
                            System.out.print("Thousand"); }
                        if (b == 7) {
                            System.out.print("Million"); }}                    
               }        
               else if (array [b] == 2) {
                    System.out.print(" Twenty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 3) {
                    System.out.print(" Thirty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 4) {
                    System.out.print(" Forty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 5) {
                    System.out.print(" Fifty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 6) {
                    System.out.print(" Sixty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 7) {
                    System.out.print(" Seventy"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 8) {
                    System.out.print(" Eighty"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
               else if (array [b] == 9) {
                    System.out.print(" Ninety"); 
                    if ((array [c] == 0) && (b == 4)) {
                        System.out.print(" Thousand");}
                    if ((array [c] == 0) && (b == 7)) {
                        System.out.print(" Million"); }} 
            }
            //Determines the value of the ones, Hundreds, thousands,
            //Hundred thousands, millions, Hundred millions, and billions
            //place and then prints that value to the screen. 
            //Also has conditions to figure out if the Hundred 
            //thousands and Hundred millions place has a full number in it,
            //(Example: 200,300,400...).
            if ((b == 0) || (b == 2) || (b == 3) || (b == 5) ||(b == 6) || 
                (b == 8) ||(b == 9)) {
                if ((b == 2) || (b == 5)) {
                    jump = 0; }
                if (jump == 1) {//Nothing, answer determined when b = 1 or b = 4!
                }
                   else if (array [b] == 1) {
                       System.out.print(" One "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)){
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 2) {
                       System.out.print(" Two "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 3) {
                       System.out.print(" Three "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 4) {
                       System.out.print(" Four "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 5) {
                       System.out.print(" Five "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 6) {
                       System.out.print(" Six "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 7) {
                       System.out.print(" Seven "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 8) {
                       System.out.print(" Eight "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
                   else if (array [b] == 9) {
                       System.out.print(" Nine "); 
                       if (b == 3) {
                           System.out.print("Thousand"); }
                       if ((b == 2) || (b == 5)) {
                           System.out.print("Hundred"); 
                           if ((b == 5) && (array [4] ==0) && (array [3] == 0)) {
                               System.out.print(" Thousand"); }}
                       if (b == 6) {
                           System.out.print("Million"); }
                       if (b == 8) {
                           System.out.print("Hundred"); 
                           if ((array [7] ==0) && (array [6] == 0)){
                               System.out.print(" Million"); }}
                       if (b == 9) {
                           System.out.print("Billion"); }}
            }    
            c = 0;
            b--;
    }

}
}