package Controller;

import java.util.PriorityQueue;

import Model.Toy;

public interface iGetToyList {

  // позволяет получить список игрушек для розыгрыша
  public PriorityQueue<Toy> getAllToys();

  // позволяет получить из списка игрушек для розыгрыша одну игрушку
  public void getWin();

}
