package ToyStore;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
    
        toyStore.addToy(new Toy(1, "Машинка", 0.1));
        toyStore.addToy(new Toy(2, "Поезд", 0.3));
        toyStore.addToy(new Toy(3, "Меч", 0.4));
        toyStore.addToy(new Toy(4, "Слон", 0.2));
        toyStore.addToy(new Toy(5, "Самосвал", 0.3));
        toyStore.addToy(new Toy(6, "Мяч", 0.4));
        toyStore.addToy(new Toy(7, "Обезьянка", 0.2));
        toyStore.addToy(new Toy(8, "Кубик", 0.3));
        toyStore.addToy(new Toy(9, "Динозавр", 0.2));
        toyStore.addToy(new Toy(10, "Кукла", 0.4));
    
        try {
          FileWriter writer = new FileWriter("ToyStore\\result.txt");
    
          int counter = 0;
          int maxToys = 10;
          while (counter < maxToys) {
            Toy toy = toyStore.getRandomToy();
    
            if (toy != null) {
              counter++;
              writer.write(counter + ". " + "Выбрана игрушка: " + toy.getName()
               + " (Шанс выпадения" + " " + toy.getChance() +  "%" + ")\n");
            }
          }
    
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
}