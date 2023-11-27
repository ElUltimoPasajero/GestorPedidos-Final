package com.example.gestorpedidoshibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

import java.io.IOException;

/**
 * Clase principal de la aplicación que extiende de javafx.application.Application.
 */
public class App extends Application {

    private static Stage stage;

    /**
     * Método principal para iniciar la aplicación.
     *
     * @param stage Instancia de Stage que representa la ventana principal de la aplicación.
     * @throws IOException Si hay un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setResizable(false);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        HibernateUtil.getSessionFactory();

        /**
         * Método estático para cambiar de escena en la aplicación.
         *
         * @param fxml  Ruta al archivo FXML que representa la nueva escena.
         * @param title Título de la nueva ventana.
         * @throws IOException Si hay un error al cargar el archivo FXML.
         */
    }
    public static void changeScene( String fxml,String title ) throws IOException { //Asi cambiamos de ventana
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}