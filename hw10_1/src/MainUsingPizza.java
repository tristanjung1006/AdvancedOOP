import java.util.ArrayList;

class MainUsingPizza {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();

        list.add("Pepperoni");
        list.add("Cheese");

        System.out.println("과제명: hw10_1");
        System.out.println("작성자: 정승원\n");
    
//        SelectToppingPizza pizza = new SelectToppingPizza(15); // 완성 후 아래 코드 실행
//        AbstractPizza pizza = new Pizza(15);
        // 피자 생성
        AbstractPizza pizza = new Pizza(15);

        // 토핑 추가
        pizza = new PepperoniToppingDecorator(pizza);
        pizza = new CheeseToppingDecorator(pizza);

        
        for (String topping : list) {
            pizza.addTopping(topping);  // 완성 후 아래 코드 실행

            if (topping.equals("Cheese")) {
                pizza = new CheeseToppingDecorator(pizza);
            }
            else if (topping.equals("Pepperoni")) {
                pizza = new PepperoniToppingDecorator(pizza);
            }

        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
