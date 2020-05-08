import java.util.*;

public class Tictactoe {
        private static String[] a={"1","2","3","4","5","6","7","8","9"};
        private static Scanner s = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.println("TIC TAC TOE");
        System.out.println("Player 1 - o");
        System.out.println("player 2 - x");
        display();
        int p=1;
        int win=0;
        //only after total of 4 moves.We can decide which player wins
        for(int i=0;i<4;i++)
        {
        System.out.println("Player "+p+" turn");       
        String ind=s.next();
        int in = checkindex(ind);
        
        entry(p,in);
          if(p==1)
            p++;
        else
            p--;
        }
        //max 9 moves if possible in tic-tactoe, already 4 over,5 are left
        for(int i=0;i<5;i++)
    {
        System.out.println("Player "+p+" turn");
        String ind=s.next();
        int in= checkindex(ind);        
        entry(p,in);
        win=checkwin(p);
        if(win==1)
        {
            System.out.println("Player "+p+ " won");
            break;
        }
        if(p==1)
            p++;
        else
            p--;   
        }
        if(win==0)
        System.out.println("Draw");
    }
        private static int checkindex(String in)
        {
         try{
          int ind = Integer.parseInt(in);
        if(ind>0 && ind<=9)
        {
            return ind;
        }
        else
        {
            System.out.println("Enter valid position(1 to 9)");
            String k;
            k= s.next();
            return checkindex(k);   
        }
        }
         catch(NumberFormatException ex)
         {
             System.out.println("Type mismatch.Try again with valid integer");
            String k=s.next();
            return checkindex(k);
         }
        }
        private static void entry(int player,int index)
        {
            int flag=-1;
            if(a[index-1].equals("o")||a[index-1].equals("x"))
            {
            flag=-1;
            }
            else
            {
             flag=1;
                if(player==1)
                    a[index-1]="o";
                    
                else
                    a[index-1]="x";
            }
            check(flag,player);
        }
        private static void display()
        {
        System.out.println(" "+a[0]+" | "+a[1]+" | "+a[2]+" ");
        System.out.println("---|---|---");
        System.out.println(" "+a[3]+" | "+a[4]+" | "+a[5]+" ");
        System.out.println("---|---|---");
        System.out.println(" "+a[6]+" | "+a[7]+" | "+a[8]+" ");
        }
        private static void check(int i,int player)
        {
            
         if(i==1)
            display();
        else
          {
            System.out.println("position already ocupied");
            int p=player;
            if(p==2)
            {
            System.out.println("Player 2 turn");
            String k = s.next();
            int m = checkindex(k);
            entry(p,m);
            }
            if(p==1)
            {
                System.out.println("Player 1 turn");
                String h=s.next();
                int m = checkindex(h);
                entry(p,m);
            }
           }
       }
        private static int checkwin(int p)
        {
         if(((a[0]=="o")&&(a[1]=="o")&&(a[2]=="o"))||((a[3]=="o")&&(a[4]=="o")&&(a[5]=="o"))||((a[6]=="o")&&(a[7]=="o")&&(a[8]=="o"))||((a[0]=="o")&&(a[3]=="o")&&(a[6]=="o"))||((a[1]=="o")&&(a[4]=="o")&&(a[7]=="o"))||((a[2]=="o")&&(a[5]=="o")&&(a[8]=="o"))||((a[0]=="o")&&(a[4]=="o")&&(a[8]=="o"))||((a[2]=="o")&&(a[4]=="o")&&(a[6]=="o")))
            {
                return 1;
            }
         else if(((a[0]=="x")&&(a[1]=="x")&&(a[2]=="x"))||((a[3]=="x")&&(a[4]=="x")&&(a[5]=="x"))||((a[6]=="x")&&(a[7]=="x")&&(a[8]=="x"))||((a[0]=="x")&&(a[3]=="x")&&(a[6]=="x"))||((a[1]=="x")&&(a[4]=="x")&&(a[7]=="x"))||((a[2]=="x")&&(a[5]=="x")&&(a[8]=="x"))||((a[0]=="x")&&(a[4]=="x")&&(a[8]=="x"))||((a[2]=="x")&&(a[4]=="x")&&(a[6]=="x")))
            {
                return 1;
            }
            else
                return 0;
        }     
    }
        

