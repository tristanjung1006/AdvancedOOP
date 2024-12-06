public class Main {
	  public static void main(String[] args) {
//	    Subject generator = new RandomGenerator();
	  	System.out.println("hw9_1 정승원");
	 	Subject generator = new IncrementGenerator(10, 40, 4);
	    Observer observer1 = new DigitObserver();
	    Observer observer2 = new GraphObserver();
	    generator.addObserver(observer1);
	    generator.addObserver(observer2);
	    generator.execute();
	  }
	}