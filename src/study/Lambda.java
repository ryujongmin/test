package study;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Apple {}
class Banana {}

class FruitBox<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

public class Lambda {
	@FunctionalInterface
	interface MySum {
	    public int clac(int a, int b);
	}
	
	
    public static void main(String[] args) {
    	Predicate <Integer> greater = x -> x > 10;
    	Predicate <Integer> less = x -> x < 20;
        MySum func = (a, b) -> a + b;
        MySum func2 = (a, b) -> a - b;
        MySum func3 = (a, b) -> b % a;
        MySum func4 = (a, b) -> a / b;

        System.out.println(func.clac(10, 11));
        System.out.println(func2.clac(10, 11));
        System.out.println(func3.clac(10, 11));
        System.out.println(func4.clac(10, 11));
        List<String> list = new ArrayList();

        list.add("fu1nc1");
        list.add("fu2nc2");
        list.add("fu3nc3");
        list.add("fu4nc4");

        list.forEach(xx -> System.out.println(xx));
    }
}

