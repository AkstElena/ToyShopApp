package Controller;

import java.util.PriorityQueue;

import Model.Toy;

public interface iGetView {

  // запуска программы для получения списка игрушек для розыгрыша
  void start(PriorityQueue<Toy> toys);
}
