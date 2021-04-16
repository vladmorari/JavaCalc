package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label labelRez;
    public Label labelTop;
    public double num1 = 0;
    public double num2 = 0;
    public char operation;
    public double rezult = 0;

    public void buttonClearClick(ActionEvent e) {
        labelRez.setText("");
        labelTop.setText("");
    }

    public void buttonZeroClick(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "0");
    }

    public void button1Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "1");
    }

    public void button2Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "2");
    }

    public void button3Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "3");
    }

    public void button4Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "4");
    }

    public void button5Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "5");
    }

    public void button6Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "6");
    }

    public void button7Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "7");
    }

    public void button8Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "8");
    }

    public void button9Click(ActionEvent e) {
        labelRez.setText(labelRez.getText() + "9");
    }

    public void buttonDotClick(ActionEvent e) {
        labelRez.setText(labelRez.getText() + ".");
    }

    public void buttonDivisionClick(ActionEvent event) {
        labelTop.setText(labelRez.getText() + "/");
        num1 = Double.parseDouble(labelRez.getText());
        operation = '/';
        labelRez.setText("");
    }

    public void buttonMultiplicationClick(ActionEvent event) {
        labelTop.setText(labelRez.getText() + "*");
        num1 = Double.parseDouble(labelRez.getText());
        operation = '*';
        labelRez.setText("");
    }

    public void buttonMinosClick(ActionEvent event) {
        labelTop.setText(labelRez.getText() + "-");
        num1 = Double.parseDouble(labelRez.getText());
        operation = '-';
        labelRez.setText("");
    }

    public void buttonPlusClick(ActionEvent event) {
        labelTop.setText(labelRez.getText() + "+");
        num1 = Double.parseDouble(labelRez.getText());
        operation = '+';
        labelRez.setText("");
    }

    public void buttonEqualClick(ActionEvent event) {
        labelTop.setText(labelTop.getText() +
                labelRez.getText() + "=");
        num2 = Double.parseDouble(labelRez.getText());
        labelRez.setText(String.valueOf(calculate()));
        num1 = 0;
        num2 = 0;
        rezult = 0;
    }

    public double calculate() {
        switch (operation) {
            case '/':
                rezult = num1 / num2;
                break;
            case '*':
                rezult = num1 * num2;
                break;
            case '-':
                rezult = num1 - num2;
                break;
            case '+':
                rezult = num1 + num2;
                break;
        }
        return rezult;
    }

}
