import java.util.ArrayList;
import java.util.List;
public class PhoneFactory {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        if(state == false){
            System.out.println("手机生产出现问题,手机质量不过关");
            notifyAllObserversFalse();

        }


    }
    public void observerAdd(Observer observer){
        observers.add(observer);
    }
    public void observerRemoval(Observer observer){
        for (Observer observer1 : observers) {
            if (observer1.equals(observer)){
                observers.remove(observer1);
            }
        }
    }
    public void notifyAllObserversFalse(){
        for (Observer observer : observers) {
            observer.reaction();
        }

    }
}
