package src.Files.TicTacToe;
import javax.swing.JOptionPane;

public class Singleplayerttteasy{
    static String[] F = {"f", "G"};
    
    static Boolean Xwins = false;
    static Boolean Owins = false;

    static String a = "_  |  A  |  B  |  C";
    static String b = "_____________";
    static String c = "1  |  ";
    static String A1 = "_";
    static String f = "  |  ";
    static String B1 = "_";
    static String g = "  |  ";
    static String C1 = "_";
    static String h = "_____________";
    static String i = "2  |  ";
    static String A2 = "_";
    static String j = "  |  ";
    static String B2 = "_";
    static String k = "  |  ";
    static String C2 = "_";
    static String l = "_____________";
    static String m = "3  |  ";
    static String A3 = "_";
    static String n = "  |  ";
    static String B3 = "_";
    static String o = "  |  ";
    static String C3 = "_";
    static String X = "X";
    static String O = "O";
    static String r;


    public static void main(String[] args){


        
        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
        
        firstMove(F);
        secondMove(F);
        thirdMove(F);
        fourthMove(F);
        fifthtMove(F);
        XwinChecker(F);
        if(Xwins == true)
            JOptionPane.showMessageDialog(null, "X Won.\nCongrats....!","X WINS", 0);
        else{
            sixthMove(F);
            OwinChecker(F);
            if(Owins == true)
                JOptionPane.showMessageDialog(null, "O Won.\nCongrats....!","O WINS", 0);
            else{
                seventhMove(F);
                XwinChecker(F);
                if(Xwins == true)
                    JOptionPane.showMessageDialog(null, "X Won.\nCongrats....!","X WINS", 0);
                else{
                    eighthMove(F);
                    OwinChecker(F);
                    if(Owins == true)
                        JOptionPane.showMessageDialog(null, "O Won.\nCongrats....!","O WINS", 0);
                    else{
                        ninethMove(F);
                        XwinChecker(F);
                        if(Xwins == true){
                            JOptionPane.showMessageDialog(null, "X Won.\nCongrats....!","X WINS", 0);
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Its a draw!","X WINS", 0);

                            
                        }
                    }
                }
            }
        }
        String draw = JOptionPane.showInputDialog("Its a draw..!\nDo you want to play again?\n (Y/N)");
                            String drawRedo = draw.toUpperCase();
                            if(drawRedo.equals("Y")){
                                A1 = "_";
                                B1 = "_";
                                C1 = "_";
                                A2 = "_";
                                B2 = "_";
                                C2 = "_";
                                A3 = "_";
                                B3 = "_";
                                C3 = "_";
                                main(F);
                            }
                            else
                                JOptionPane.showMessageDialog(null, "Press 'OK' To Quit...!", "Exit Screen..", 0);
        

    }

    

    public static void firstMove(String[] args){
        
        //fm = First Move
        String fmm = JOptionPane.showInputDialog(a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3 + "\n" + "Please Enter The Coordinates For (X)!!");
        String fm = fmm.toUpperCase().replace(" ", "");
        if(fm.equals("A1"))
            A1 = A1.replace("_", "X");
        else if(fm.equals("B1"))
            B1 = B1.replace("_", "X"); 
        else if(fm.equals("C1"))
            C1 = C1.replace("_", "X");  
        else if(fm.equals("A2"))
            A2 = A2.replace("_", "X"); 
        else if(fm.equals("B2"))
            B2 = B2.replace("_", "X"); 
        else if(fm.equals("C2"))
            C2 = C2.replace("_", "X");  
        else if(fm.equals("A3"))
            A3 = A3.replace("_", "X");
        else if(fm.equals("B3"))
            B3 = B3.replace("_", "X");  
        else if(fm.equals("C3"))
            C3 = C3.replace("_", "X");
        else{
            JOptionPane.showMessageDialog(null, fm + " is not a valid coordinate.\nEnter a new and valid coordinate.\nClick 'OK' to continue.", "Invalid Input Error.....!", 0);
            firstMove(F);
        }

        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
    }

    public static void secondMove(String[] args){
        
        //sm = Second Move
        randomer(F);
        String smm = r;
        String sm = smm.toUpperCase().replace(" ", "");
        if(sm.equals("A1") && !A1.equals("X"))
            A1 = A1.replace("_", "O");
        else if(sm.equals("B1") && !B1.equals("X"))
            B1 = B1.replace("_", "O"); 
        else if(sm.equals("C1") && !C1.equals("X"))
            C1 = C1.replace("_", "O");  
        else if(sm.equals("A2") && !A2.equals("X"))
            A2 = A2.replace("_", "O"); 
        else if(sm.equals("B2") && !B2.equals("X"))
            B2 = B2.replace("_", "O"); 
        else if(sm.equals("C2") && !C2.equals("X"))
            C2 = C2.replace("_", "O");  
        else if(sm.equals("A3") && !A3.equals("X"))
            A3 = A3.replace("_", "O");
        else if(sm.equals("B3") && !B3.equals("X"))
            B3 = B3.replace("_", "O");  
        else if(sm.equals("C3") && !C3.equals("X"))
            C3 = C3.replace("_", "O");
        else{
            secondMove(F);
        }

       
        
    }

    public static void thirdMove(String[] args){
        
        //tm = Third Move
        String tmm = JOptionPane.showInputDialog(a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3 + "\n" + "Please Enter The Coordinates For (X)!!");
        String tm = tmm.toUpperCase().replace(" ", "");
        if(tm.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "X");
        else if(tm.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "X"); 
        else if(tm.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "X");  
        else if(tm.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "X"); 
        else if(tm.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "X"); 
        else if(tm.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "X");  
        else if(tm.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "X");
        else if(tm.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "X");  
        else if(tm.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "X");
        else{
            JOptionPane.showMessageDialog(null, tm + " is not a valid coordinate.\nEnter a new and valid coordinate.\nClick 'OK' to continue.", "Invalid Input Error.....!", 0);
            thirdMove(F);
        }

        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
    }

    public static void fourthMove(String[] args){
        
        //fom = Fourth Move
        randomer(F);
        String fomm = r;
        String fom = fomm.toUpperCase().replace(" ", "");
        if(fom.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "O");
        else if(fom.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "O"); 
        else if(fom.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "O");  
        else if(fom.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "O"); 
        else if(fom.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "O"); 
        else if(fom.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "O");  
        else if(fom.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "O");
        else if(fom.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "O");  
        else if(fom.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "O");
        else{
            fourthMove(F);
        }

        
    }

    public static void fifthtMove(String[] args){
        
        //fim = Fifth Move
        String fimm = JOptionPane.showInputDialog(a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3 + "\n" + "Please Enter The Coordinates For (X)!!");
        String fim = fimm.toUpperCase().replace(" ", "");
        if(fim.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "X");
        else if(fim.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "X"); 
        else if(fim.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "X");  
        else if(fim.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "X"); 
        else if(fim.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "X"); 
        else if(fim.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "X");  
        else if(fim.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "X");
        else if(fim.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "X");  
        else if(fim.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "X");
        else{
            JOptionPane.showMessageDialog(null, fim + " is not a valid coordinate.\nEnter a new and valid coordinate.\nClick 'OK' to continue.", "Invalid Input Error.....!", 0);
            fifthtMove(F);
        }

        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
    }

    public static void sixthMove(String[] args){
        
        //sim = Sixth Move
        randomer(F);
        String simm = r;
        String sim = simm.toUpperCase().replace(" ", "");
        if(sim.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "O");
        else if(sim.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "O"); 
        else if(sim.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "O");  
        else if(sim.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "O"); 
        else if(sim.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "O"); 
        else if(sim.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "O");  
        else if(sim.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "O");
        else if(sim.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "O");  
        else if(sim.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "O");
        else{
            sixthMove(F);
        }

        
    }

    public static void seventhMove(String[] args){
        
        //sem = Seventh Move
        String semm = JOptionPane.showInputDialog(a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3 + "\n" + "Please Enter The Coordinates For (X)!!");
        String sem = semm.toUpperCase().replace(" ", "");
        if(sem.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "X");
        else if(sem.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "X"); 
        else if(sem.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "X");  
        else if(sem.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "X"); 
        else if(sem.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "X"); 
        else if(sem.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "X");  
        else if(sem.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "X");
        else if(sem.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "X");  
        else if(sem.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "X");
        else{
            JOptionPane.showMessageDialog(null, sem + " is not a valid coordinate.\nEnter a new and valid coordinate.\nClick 'OK' to continue.", "Invalid Input Error.....!", 0);
            seventhMove(F);
        }

        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
    }

    public static void eighthMove(String[] args){
        
        //em = Eighth Move
        randomer(F);
        String emm = r;
        String em = emm.toUpperCase().replace(" ", "");
        if(em.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "O");
        else if(em.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "O"); 
        else if(em.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "O");  
        else if(em.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "O"); 
        else if(em.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "O"); 
        else if(em.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "O");  
        else if(em.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "O");
        else if(em.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "O");  
        else if(em.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "O");
        else{
            eighthMove(F);
        }

        
    }

    public static void ninethMove(String[] args){
        
        //nm = Nineth Move
        String nmm = JOptionPane.showInputDialog(a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3 + "\n" + "Please Enter The Coordinates For (X)!!");
        String nm = nmm.toUpperCase().replace(" ", "");
        if(nm.equals("A1") && !A1.equals("X") && !A1.equals("O"))
            A1 = A1.replace("_", "X");
        else if(nm.equals("B1") && !B1.equals("X") && !B1.equals("O"))
            B1 = B1.replace("_", "X"); 
        else if(nm.equals("C1") && !C1.equals("X") && !C1.equals("O"))
            C1 = C1.replace("_", "X");  
        else if(nm.equals("A2") && !A2.equals("X") && !A2.equals("O"))
            A2 = A2.replace("_", "X"); 
        else if(nm.equals("B2") && !B2.equals("X") && !B2.equals("O"))
            B2 = B2.replace("_", "X"); 
        else if(nm.equals("C2") && !C2.equals("X") && !C2.equals("O"))
            C2 = C2.replace("_", "X");  
        else if(nm.equals("A3") && !A3.equals("X") && !A3.equals("O"))
            A3 = A3.replace("_", "X");
        else if(nm.equals("B3") && !B3.equals("X") && !B3.equals("O"))
            B3 = B3.replace("_", "X");  
        else if(nm.equals("C3") && !C3.equals("X") && !C3.equals("O"))
            C3 = C3.replace("_", "X");
        else{
            JOptionPane.showMessageDialog(null, nm + " is not a valid coordinate.\nEnter a new and valid coordinate.\nClick 'OK' to continue.", "Invalid Input Error.....!", 0);
            ninethMove(F);
        }

        JOptionPane.showMessageDialog(null, a + "\n" + b + "\n" + c + A1 + f + B1 + g + C1 + "\n" + h + "\n" + i + A2 + j + B2 + k + C2 + "\n" + l + "\n" + m + A3 + n + B3 + o + C3, "Tic Tac Toe", 0);
    }


    public static void randomer(String[] args){
        //To create a random Coordinate
        int min = 1;
        int max = 9;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        

        if(random_int == 1)
            r = "A1";
        else if(random_int == 2)
            r = "A2";
        else if(random_int == 3)
            r = "A3";
        else if(random_int == 4)
            r = "B1";
        else if(random_int == 5)
            r = "B2";
        else if(random_int == 6)
            r = "B3";
        else if(random_int == 7)
            r = "C1";
        else if(random_int == 8)
            r = "C2";
        else
            r = "C3";
        
    }


    public static void XwinChecker(String[] args){
        
        if(A1.equals("X") && B1.equals("X") && C1.equals("X"))
            Xwins = true;
        else if(A2.equals("X") && B2.equals("X") && C2.equals("X"))
            Xwins = true;
        else if(A3.equals("X") && B3.equals("X") && C3.equals("X"))
            Xwins = true;
        else if(A1.equals("X") && A2.equals("X") && A3.equals("X"))
            Xwins = true;
        else if(B1.equals("X") && B2.equals("X") && B3.equals("X"))
            Xwins = true;
        else if(C1.equals("X") && C2.equals("X") && C3.equals("X"))
            Xwins = true;
        else if(A1.equals("X") && B2.equals("X") && C3.equals("X"))
            Xwins = true;
        else if(C1.equals("X") && B2.equals("X") && A3.equals("X"))
            Xwins = true;
        else
            Xwins = false;
    }


    public static void OwinChecker(String[] args){
        
        if(A1.equals("O") && B1.equals("O") && C1.equals("O"))
            Owins = true;
        else if(A2.equals("O") && B2.equals("O") && C2.equals("O"))
            Owins = true;
        else if(A3.equals("O") && B3.equals("O") && C3.equals("O"))
            Owins = true;
        else if(A1.equals("O") && A2.equals("O") && A3.equals("O"))
            Owins = true;
        else if(B1.equals("O") && B2.equals("O") && B3.equals("O"))
            Owins = true;
        else if(C1.equals("O") && C2.equals("O") && C3.equals("O"))
            Owins = true;
        else if(A1.equals("O") && B2.equals("O") && C3.equals("O"))
            Owins = true;
        else if(C1.equals("O") && B2.equals("O") && A3.equals("O"))
            Owins = true;
        else
            Owins = false;
    }

}
