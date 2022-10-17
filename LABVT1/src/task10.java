import task9.Ball;
import task9.Basket;
import task9.Color;

import java.util.Random;

public class task10 {
    public static void main(String[] args){
        Basket basket = new Basket();
        pickBallsInBasket(basket,10);
        System.out.printf("Weight of balls in basket: %f\n",basket.getBallsWeight());
        System.out.printf("Count of blue balls in basket: %d",basket.getCountByColor(Color.BLUE));
    }
    public static Ball generateBall(){
        Random random = new Random();
        double weight = random.nextDouble();
        Color color = Color.values()[random.nextInt(Color.values().length)];
        return new Ball(color,weight);
    }
    public static void pickBallsInBasket(Basket basket,int countOfBalls){
        for (int i = 0;i < countOfBalls - 1;i++){
            basket.balls.add(generateBall());
        }
    }
}
