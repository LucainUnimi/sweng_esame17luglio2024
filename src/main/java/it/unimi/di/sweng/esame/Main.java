package it.unimi.di.sweng.esame;

import it.unimi.di.sweng.esame.model.ModelState;
import it.unimi.di.sweng.esame.presenter.BookingPresenter;
import it.unimi.di.sweng.esame.view.DisplayView;
import it.unimi.di.sweng.esame.view.InputConcreteView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;


public class Main extends Application {
    public static final int VIEWSIZE = 5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(@NotNull Stage primaryStage) {

        primaryStage.setTitle("Excursion Booking");

        DisplayView debits = new DisplayView(VIEWSIZE, "Bookers' Debits");
        DisplayView excursions = new DisplayView(VIEWSIZE, "Available Excursions");

        InputConcreteView inputBooking = new InputConcreteView("Name", "Excursion", "BOOK");
        InputConcreteView inputPayment = new InputConcreteView("Name", "Amount", "PAY");

        GridPane gridPane = new GridPane();
        gridPane.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.add(excursions, 0, 0);
        gridPane.add(inputBooking, 0, 1);

        gridPane.add(debits, 1, 0);
        gridPane.add(inputPayment, 1, 1);


        //TODO: modificare e completare il seguente codice per istanziare e collegare i vari componenti
        ModelState model = new ModelState();
        model.readFile();

        new BookingPresenter(inputBooking);
        new BookingPresenter(inputPayment);


        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
