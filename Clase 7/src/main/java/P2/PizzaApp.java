package P2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaApp {
    public static void main(String[] args) {
        // Crear una instancia de Pizza
        Pizza pizza = new Pizza("Margarita", 100);

        // Crear instancias de Topping y agregar ingredientes
        Topping tomateTopping = new Topping("Tomate", 5.0);
        Topping cebollaTopping = new Topping("Cebolla", 3.0);
        Topping peperoniTopping = new Topping("Peperoni", 7.0);
        Topping champinonesTopping = new Topping("Champiñones", 4.0);
        Topping aceitunasTopping = new Topping("Aceitunas", 6.0);
        Topping extraQuesoTopping = new Topping("Extra Queso", 10.0);

        // Agregar los toppings a la pizza
        pizza.addTopping(tomateTopping);
        pizza.addTopping(cebollaTopping);
        pizza.addTopping(peperoniTopping);
        pizza.addTopping(champinonesTopping);
        pizza.addTopping(aceitunasTopping);
        pizza.addTopping(extraQuesoTopping);

        // Crear la interfaz gráfica
        EventQueue.invokeLater(() -> {
            PizzaFrame frame = new PizzaFrame(pizza);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class PizzaFrame extends JFrame {
    private Pizza pizza;
    private List<JCheckBox> checkBoxes;

    public PizzaFrame(Pizza pizza) {
        this.pizza = pizza;
        checkBoxes = new ArrayList<>();

        setTitle("Pizza Order");
        setSize(400, 400);
        setLocationByPlatform(true);

        // Crear los componentes de la GUI aquí
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(pizza.getToppings().size() + 4, 1));

        for (Topping topping : pizza.getToppings()) {
            JCheckBox checkBox = new JCheckBox(topping.getName() + " - Q" + topping.getPrice());
            checkBoxes.add(checkBox);
            panel.add(checkBox);
        }

        JLabel normalPriceLabel = new JLabel("Normal Price: Q" + pizza.getPrice());
        panel.add(normalPriceLabel);

        JTextField paymentField = new JTextField(10);
        panel.add(paymentField);

        JButton calculateButton = new JButton("Calculate Total and Change");
        JLabel totalLabel = new JLabel("Total Price: Q");
        JLabel changeLabel = new JLabel("Change: Q");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = pizza.getPrice();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if (checkBoxes.get(i).isSelected()) {
                        total += pizza.getToppings().get(i).getPrice();
                    }
                }
                totalLabel.setText("Total Price: Q" + total);

                try {
                    double payment = Double.parseDouble(paymentField.getText());
                    if (payment >= total) {
                        double change = payment - total;
                        changeLabel.setText("Change: Q" + change);
                    } else {
                        changeLabel.setText("PAGO INSUFICIENTE");
                    }
                } catch (NumberFormatException ex) {
                    changeLabel.setText("PAGO INVALIDO");
                }
            }
        });

        panel.add(calculateButton);
        panel.add(totalLabel);
        panel.add(changeLabel);

        add(panel);
    }
}

class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping to : toppings) {
            this.toppings.add(to);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }
}

class Topping {
    private String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
