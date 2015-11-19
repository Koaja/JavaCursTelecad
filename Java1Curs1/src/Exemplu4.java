public class Exemplu4{
    /*
     *  Structuri de control
     * Structuri decizionale (switch , if) 
     * switch (expresie){
     *     case val1 : instructiuni1; break;
     *     case val2 : instructiuni2; break;
     *     case val3 : instructiuni3; break;
     *     case val4 : instructiuni4; break;
     *     default: instructionM; break; 
     *     }
     *     
     *  if(conditie){
     *      instructiuni;
     *  }else{
     *      instructiuni2;    
     *  }
     *  
     *  (see exemplu5 for if)
     */
    
    public static void main (String [] args){
        int m = 12;
        
        switch (m){
        case 1:
            System.out.println("Ianuarie");
            break;
        case 2:
            System.out.println("Februarie");
            break;
        case 3:
            System.out.println("Martie");
            break;
        case 4:
            System.out.println("Aprilie");
            break;
        case 5:
            System.out.println("Mai");
            break;
        case 6:
            System.out.println("Iunie");
            break;
        case 7:
            System.out.println("Iulie");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("Septembrie");
            break;
        case 10:
            System.out.println("Octombrie");
            break;
        case 11:
            System.out.println("Noiembrie");
            break;    
        default:
            System.out.println("Not a month");
            break;
        }
    }

}