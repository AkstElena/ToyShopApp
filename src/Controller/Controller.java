package Controller;

public class Controller {
  private iGetToyList model;
  private iGetView view;

  public Controller(iGetToyList model, iGetView view) {
    this.model = model;
    this.view = view;
  }

  public void run() {
    view.start(model.getAllToys());
  }

  public void getToy() {
    model.getWin();
  }

}
