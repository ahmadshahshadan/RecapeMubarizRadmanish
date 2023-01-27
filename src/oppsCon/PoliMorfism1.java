package oppsCon;

public class PoliMorfism1 {
	
	public static void main(String[] args) {
		
		Toto to = new Toto();
		to.sing();
		
		Bird br = new Bird();
		br.sing();
	}
}

    class  bird1{
	int c;
    public void sing() {
         c =6;
    	System.out.println(" Qo qo qo ");
    	System.out.println(" Yooooooooooooooo");
    	System.out.println(c);
    
    	 System.out.println("---------------");
    }


    
	}


 class Bird extends bird1 {
	 
	 int c;
	 @Override
	 public void sing() {
		   
	    	System.out.println(" Qo qo qo iiiiiii ");
	    	System.out.println("jkjkkjkkjkkkk");
	    	System.out.println(c);
	    	 System.out.println("---------------");
	    } 	
	
}

 
 class Toto extends bird1 {
	
@Override	 
public void sing() {
//	super.sing();
	System.out.println(" to to to ");
}
	 
 }