package com.mycompany.tablasdemultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML TextField num;

    @FXML Label lbl1;
    @FXML Label lbl2;
    @FXML Label lbl3;
    @FXML Label lbl4;
    @FXML Label lbl5;
    @FXML Label lbl6;
    @FXML Label lbl7;
    @FXML Label lbl8;
    @FXML Label lbl9;
    @FXML Label lbl10;

    @FXML
    private void btnCalcular_click() {

        int numero;
        numero = Integer.parseInt(num.getText());

        int num1 = numero * 1;
        int num2 = numero * 2;
        int num3 = numero * 3;
        int num4 = numero * 4;
        int num5 = numero * 5;
        int num6 = numero * 6;
        int num7 = numero * 7;
        int num8 = numero * 8;
        int num9 = numero * 9;
        int num10 = numero * 10;

        lbl1.setText(numero + " x 1 = " + num1);
        lbl2.setText(numero + " x 2 = " + num2);
        lbl3.setText(numero + " x 3 = " + num3);
        lbl4.setText(numero + " x 4 = " + num4);
        lbl5.setText(numero + " x 5 = " + num5);
        lbl6.setText(numero + " x 6 = " + num6);
        lbl7.setText(numero + " x 7 = " + num7);
        lbl8.setText(numero + " x 8 = " + num8);
        lbl9.setText(numero + " x 9 = " + num9);
        lbl10.setText(numero + " x 10 = " + num10);
    }

    @FXML
    private void btnLimpiar_click() {
        num.clear();

        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");
        lbl7.setText("");
        lbl8.setText("");
        lbl9.setText("");
        lbl10.setText("");
    }
}