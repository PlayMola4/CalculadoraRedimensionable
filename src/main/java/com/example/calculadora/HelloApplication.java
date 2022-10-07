package com.example.calculadora;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    //Metodo para poder Sumar, Restar, Multiplicar o Dividir segun el operando que seleccionemos.
    public String operacion(String opera) {
        int resultado;
        int num1;
        int num2;
        String result = "";
        if (opera.contains("+")) {
            String[] parts = opera.split("\\+");
            opera = "";
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[1]);
            resultado = num1 + num2;
            result = String.valueOf(resultado);
        }

        if (opera.contains("-")) {
            String[] parts = opera.split("\\-");
            opera = "";
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[1]);
            resultado = num1 - num2;
            result = String.valueOf(resultado);
        }

        if (opera.contains("x")) {
            String[] parts = opera.split("\\*");
            opera = "";
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[1]);
            resultado = num1 * num2;
            result = String.valueOf(resultado);
        }

        if (opera.contains("/")) {
            String[] parts = opera.split("\\/");
            opera = "";
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[1]);
            if (num2 == 0) {
                result = "No se puede dividir entre 0";
            } else {
                resultado = num1 / num2;
                result = String.valueOf(resultado);
            }
        }
        return result;
    }

    //Metodo para las dimensiones de los botones
    public void addDimensionesButton(Button btn, int ancho, int alto) {
        btn.setPrefHeight(alto);
        btn.setPrefWidth(ancho);
    }

    //Metodo para establecer las posiciones maximas de los botones
    public void addDimensionesMaximasButton(Button btn) {
        btn.setMaxHeight(Double.MAX_VALUE);
        btn.setMaxWidth(Double.MAX_VALUE);
    }

    @Override
    public void start(Stage primarystage) throws IOException {

        //Botones del 0 al 9
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        //Botones de Sumar, Restar, Multiplicar, Dividir, Igual y Dividir
        Button btnSumar = new Button("+");
        Button btnRestar = new Button("-");
        Button btnMultiplicar = new Button("*");
        Button btnDividir = new Button("/");
        Button btnIgual = new Button("=");
        Button btnBorrar = new Button("C");

        //TextField donde se muestra el resultado de la operacion
        TextField resultadoField = new TextField();
        resultadoField.setAlignment(Pos.CENTER_RIGHT);

        //Creamos el gridPane
        GridPane gridPane = new GridPane();

        //Alineado al centro
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(6);

        //Ordenamos por Filas
        //Fila 0
        GridPane.setConstraints(resultadoField, 0, 0, 5, 1);

        //Fila 1
        GridPane.setConstraints(btnSumar, 4, 1);
        GridPane.setConstraints(btn9, 3, 1);
        GridPane.setConstraints(btn8, 2, 1);
        GridPane.setConstraints(btn7, 1, 1);

        //Fila 2
        GridPane.setConstraints(btnRestar, 4, 2);
        GridPane.setConstraints(btn6, 3, 2);
        GridPane.setConstraints(btn5, 2, 2);
        GridPane.setConstraints(btn4, 1, 2);

        //Fila 3
        GridPane.setConstraints(btnMultiplicar, 4, 3);
        GridPane.setConstraints(btn3, 3, 3);
        GridPane.setConstraints(btn2, 2, 3);
        GridPane.setConstraints(btn1, 1, 3);

        //Fila4
        GridPane.setConstraints(btnBorrar, 1, 4);
        GridPane.setConstraints(btn0, 2, 4);
        GridPane.setConstraints(btnIgual, 3, 4);
        GridPane.setConstraints(btnDividir, 4, 4);


        //Añadir todos los botones al gridPane
        gridPane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSumar, btnRestar, btnMultiplicar, btnDividir, resultadoField, btnIgual, btnBorrar);

        //Dimensiones estandares de los botones y texto
        resultadoField.setPrefHeight(35);

        addDimensionesButton(btn0, 100, 100);
        addDimensionesButton(btn1, 100, 100);
        addDimensionesButton(btn2, 100, 100);
        addDimensionesButton(btn3, 100, 100);
        addDimensionesButton(btn4, 100, 100);
        addDimensionesButton(btn5, 100, 100);
        addDimensionesButton(btn6, 100, 100);
        addDimensionesButton(btn7, 100, 100);
        addDimensionesButton(btn8, 100, 100);
        addDimensionesButton(btn9, 100, 100);
        addDimensionesButton(btnSumar, 100, 100);
        addDimensionesButton(btnRestar, 100, 100);
        addDimensionesButton(btnMultiplicar, 100, 100);
        addDimensionesButton(btnDividir, 100, 100);
        addDimensionesButton(btnIgual, 100, 100);
        addDimensionesButton(btnBorrar, 100, 100);

        //Dimensiones Maximas para los botones
        addDimensionesMaximasButton(btn0);
        addDimensionesMaximasButton(btn1);
        addDimensionesMaximasButton(btn2);
        addDimensionesMaximasButton(btn3);
        addDimensionesMaximasButton(btn4);
        addDimensionesMaximasButton(btn5);
        addDimensionesMaximasButton(btn6);
        addDimensionesMaximasButton(btn7);
        addDimensionesMaximasButton(btn8);
        addDimensionesMaximasButton(btn9);
        addDimensionesMaximasButton(btnSumar);
        addDimensionesMaximasButton(btnRestar);
        addDimensionesMaximasButton(btnMultiplicar);
        addDimensionesMaximasButton(btnDividir);
        addDimensionesMaximasButton(btnIgual);
        addDimensionesMaximasButton(btnBorrar);

        //Redimensionar los botones para que ocupen toda la pantalla
        GridPane.setVgrow(resultadoField, Priority.ALWAYS);
        GridPane.setVgrow(btn7, Priority.ALWAYS);
        GridPane.setVgrow(btn4, Priority.ALWAYS);
        GridPane.setVgrow(btn1, Priority.ALWAYS);
        GridPane.setVgrow(btn5, Priority.ALWAYS);
        GridPane.setVgrow(btn2, Priority.ALWAYS);
        GridPane.setVgrow(btn0, Priority.ALWAYS);
        GridPane.setVgrow(btnBorrar, Priority.ALWAYS);

        GridPane.setHgrow(btn7, Priority.ALWAYS);
        GridPane.setHgrow(btn8, Priority.ALWAYS);
        GridPane.setHgrow(btn9, Priority.ALWAYS);
        GridPane.setHgrow(btn5, Priority.ALWAYS);
        GridPane.setHgrow(btn2, Priority.ALWAYS);
        GridPane.setHgrow(btn0, Priority.ALWAYS);
        GridPane.setHgrow(btnSumar, Priority.ALWAYS);

        //Eventos para los botones cuando se clican

        Scene scene = new Scene(gridPane, 300, 250);

        primarystage.addEventFilter(MouseEvent.MOUSE_CLICKED, evento -> {
            if (evento.getTarget() instanceof Button) {
                System.out.println("Flitro del STAGE ejecutado");
            }
        });

        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, evento -> {
            if (evento.getTarget() instanceof Button) {
                System.out.println("Flitro del SCENE ejecutado");
            }
        });

        gridPane.addEventFilter(MouseEvent.MOUSE_CLICKED, evento -> {
            if (evento.getTarget() instanceof Button) {
                System.out.println("Flitro del GRIDPANE ejecutado");
                String btnAux = ((Button) evento.getTarget()).getText();
                resultadoField.setText(resultadoField.getText() + btnAux);
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}