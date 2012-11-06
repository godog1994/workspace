public class milk {

      int a;

    public int add(int x, int y){

        a = x + y; 

        return a;

   }

    public int sub(int x, int y){

       a = x - y;

       return a;

   }
    public static void main(String []args){
    	milk milk1 = new milk();
    	milk1.add(2, 2);
    	System.out.println(a);
    }

}