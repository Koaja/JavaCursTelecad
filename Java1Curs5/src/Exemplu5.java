public class Exemplu5{
    public static void main (String[] args){
    try{
       // Integer x = Integer.parseInt("12abc");
       // System.out.println(x);
        Integer y = 10/0;
    }catch(NumberFormatException e){
        System.out.println("Error here");
    }catch (Exception e3){
        e3.printStackTrace();
    }
    finally {
        System.out.println("Bye bye");
    }
}
}