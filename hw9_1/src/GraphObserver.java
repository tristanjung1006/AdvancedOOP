
public class GraphObserver implements Observer {
	  public void update(Subject generator) {
	    System.out.print("GraphObserver:");
	    int count = generator.getNumber();
	    for (int i=0; i<count; i++) {
	      System.out.print("*");
	    }
	    System.out.println("");
	  }
	}

/*
Observer 인터페이스를 구현한 구체적인 관찰자
관찰한 수를 ‘간단한 그래프’로 표시함
관찰한 숫자만큼의 ‘*‘를 출력
*/