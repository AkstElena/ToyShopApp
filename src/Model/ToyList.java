package Model;

import java.io.FileWriter;
import java.util.PriorityQueue;
import java.util.Random;

import Controller.iGetToyList;

public class ToyList implements iGetToyList {
  private PriorityQueue<Toy> toys;

  public ToyList(PriorityQueue<Toy> toys) {
    this.toys = toys;
  }

  @Override
  public PriorityQueue<Toy> getAllToys() {
    Random rand = new Random();
    int num;
    for (int i = 0; i < 10; i++) {
      num = rand.nextInt(100);
      if (num >= 0 && num <= 14) {
        Toy toy = new Toy("Constructor", 15);
        toys.offer(toy);
      }
      if (num >= 15 && num <= 19) {
        Toy toy = new Toy("Robot", 5);
        toys.offer(toy);
      }
      if (num >= 20 && num <= 79) {
        Toy toy = new Toy("Teddy bear", 60);
        toys.offer(toy);
      }
      if (num >= 80 && num <= 99) {
        Toy toy = new Toy("Barbi", 20);
        toys.offer(toy);
      }
    }
    return toys;
  }

  @Override
  public void getWin() {
    try (FileWriter fw = new FileWriter("ToysWin", true)) {
      fw.append(toys.poll().toString() + '\n');
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
