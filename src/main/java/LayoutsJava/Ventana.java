package LayoutsJava;

import java.awt.*;

public class Ventana extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button btnBoton1;
    private FlowLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        //introducimos en layout dentro del layout se puede poner la posición del mismo
        layout = new FlowLayout(FlowLayout.CENTER);
        this.setLayout(layout);
        //las etiquetas
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1);
        //texto de la etiqueta
        txtCuadro1 = new TextField(60);
        this.add(txtCuadro1);
        //2
        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2);
        //txt2
        txtCuadro2 = new TextField(60);
        this.add(txtCuadro2);


        this.setSize(800, 600);
        setVisible(true);
    }
}
