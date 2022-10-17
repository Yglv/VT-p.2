package task9;
import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;
    public Basket(){
        balls = new ArrayList<>();
    }
    public ArrayList<Ball> getBalls(){
        return balls;
    }
    public void addBall(Ball ball){
        balls.add(ball);
    }
    public void removeBall(Ball ball){
        balls.remove(ball);
    }
    public double getBallsWeight(){
        return balls.stream().mapToDouble(Ball::getWeight).sum();
    }
    public int getCountByColor(Color color){
        return (int)balls.stream().filter(elem->elem.getColor().equals(color)).count();
    }
}
