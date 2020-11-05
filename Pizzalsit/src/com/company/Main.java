

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private BufferedReader reader;

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.doStuff();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doStuff() throws IOException {
        reader = new BufferedReader(new FileReader("Pizzaer.csv"));
        String line;
        Scanner scanner;
        int index = 0;
        List<Pizza> pizzaList = new ArrayList<>();


        while ((line = reader.readLine()) != null)  {
            int pizzaId = 0;
            String pizza = "";
            int price = 0;
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            //scanner.nextLine();
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    pizzaId = (Integer.parseInt(data));
                else if (index == 1)
                    pizza = (data);
                else if (index == 2)
                    price = (Integer.parseInt(data));
                else
                    System.out.println("invalid data::" + data);
                index++;

            }
            index = 0;
            pizzaList.add(new Pizza(pizzaId, pizza, price));

        }
        reader.close();

        System.out.println(pizzaList);
        System.out.println(pizzaList.size());


    }

}
