package com.example.fxtraining;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;


public class CalculatorInterface extends Application {
  String input = "";

  /**
   * Starts application and builds the stage.
   *
   * @param primaryStage
   * @throws Exception
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    TextField eqTF = new TextField();
    TextField ansTF = new TextField();
    eqTF.setMinSize(150, 50);
    ansTF.setMinSize(150,50);

    int btnWidth = 75;
    int btnHeight = 100;
    AtomicBoolean eq = new AtomicBoolean(false);


    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button zero = new Button("0");
    Button plus = new Button("+");
    Button minus = new Button("-");
    Button divide = new Button("/");
    Button multiply = new Button("x");
    Button equal = new Button("=");
    Button clearField = new Button("C");

    one.setMinSize(btnWidth, btnHeight);
    two.setMinSize(btnWidth, btnHeight);
    three.setMinSize(btnWidth, btnHeight);
    four.setMinSize(btnWidth, btnHeight);
    five.setMinSize(btnWidth, btnHeight);
    six.setMinSize(btnWidth, btnHeight);
    seven.setMinSize(btnWidth, btnHeight);
    eight.setMinSize(btnWidth, btnHeight);
    nine.setMinSize(btnWidth, btnHeight);
    zero.setMinSize(btnWidth, btnHeight);
    plus.setMinSize(btnWidth, btnHeight);
    minus.setMinSize(btnWidth, btnHeight);
    divide.setMinSize(btnWidth, btnHeight);
    multiply.setMinSize(btnWidth, btnHeight);
    equal.setMinSize(btnWidth, btnHeight);
    clearField.setMinSize(btnWidth, btnHeight);

    one.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "1";
      eqTF.setText(input);
    });
    two.setOnAction(actionEvent -> {
      if(eq.get()){
        eqTF.setText("");
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "2";
      eqTF.setText(input);
    });
    three.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "3";
      eqTF.setText(input);
    });
    four.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "4";
      eqTF.setText(input);
    });
    five.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "5";
      eqTF.setText(input);
    });
    six.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "6";
      eqTF.setText(input);
    });
    seven.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "7";
      eqTF.setText(input);
    });
    eight.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "8";
      eqTF.setText(input);
    });
    nine.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "9";
      eqTF.setText(input);
    });
    zero.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += "0";
      eqTF.setText(input);
    });
    plus.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += " + ";
      eqTF.setText(input);
    });
    minus.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += " - ";
      eqTF.setText(input);
    });
    divide.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += " / ";
      eqTF.setText(input);
    });
    multiply.setOnAction(actionEvent -> {
      if(eq.get()){
        eq.set(false);
        CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
      }
      input += " x ";
      eqTF.setText(input);
    });
    equal.setOnAction(actionEvent -> {
      input = eqTF.getText();
      eq.set(true);
      ansTF.setText(String.valueOf(CalculateEq(input)));
    });
    clearField.setOnAction(actionEvent -> {
      input = "";
      eq.set(false);
      CalculatorInterface.clearFields(Arrays.asList(eqTF, ansTF));
    });

    GridPane grid = new GridPane();
    grid.setMinSize(300, 400);
    grid.addRow(0, seven, eight, nine, divide);
    grid.addRow(1, four, five, six, multiply);
    grid.addRow(2, one, two, three, minus);
    grid.addRow(3, clearField, zero, equal, plus);

    VBox root = new VBox(ansTF, eqTF, grid);

    Scene scene = new Scene(root, 300, 500);
    primaryStage.setTitle("Calculator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * Clears all TextFields in a given List.
   *
   * @param textFields
   */
  private static void clearFields(List<TextField> textFields){
    for(TextField tf : textFields){
      tf.clear();
    }
  }

  /**
   * Calculate the total of an equation between two numbers.
   *
   * @param input
   * @return total
   */
  private float CalculateEq(String input){
    String[] equation = input.split(" ");
    float total = Float.parseFloat(equation[0]);

    if (equation.length > 3) {
      return 0;
    }
    for (int i = 0; i < equation.length; i++) {
      if (equation[i].equals("x")) {
        total = total * Float.parseFloat(equation[i + 1]);
        i++;
      }
      if (equation[i].equals("/")) {
        total = total / Float.parseFloat(equation[i + 1]);
        i++;
      }
      if (equation[i].equals("+")) {
        total = total + Float.parseFloat(equation[i + 1]);
        i++;
      }
      if (equation[i].equals("-")) {
        total = total - Float.parseFloat(equation[i + 1]);
        i++;
      }

    }
    return total;
  }

  public static void main(String[] args) {
    launch(args);
  }
}
