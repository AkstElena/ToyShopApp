import java.util.PriorityQueue;
import Controller.Controller;
import Controller.iGetToyList;
import Controller.iGetView;
import Model.Toy;
import Model.ToyList;
import View.View;

public class App {
    public static void main(String[] args) {

        // System.out.println("Сколько игрушек будет участовать в розыгрыше: 10");
        PriorityQueue<Toy> toys = new PriorityQueue<>();

        iGetToyList model = new ToyList(toys);
        iGetView view = new View();

        Controller controller = new Controller(model, view);
        controller.run();

        System.out.println("=====================================");
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();
        controller.getToy();

    }
}
