package View;

import java.util.PriorityQueue;
import java.util.Scanner;

import Controller.iGetView;
import Model.Toy;

public class View implements iGetView {

  @Override
  public void start(PriorityQueue<Toy> toys) {
    System.out.println("Начинаем розыгрыш игрушек!");

  }

}
