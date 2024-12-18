package it.unimi.di.sweng.esame.presenter;

import it.unimi.di.sweng.esame.view.InputView;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BookingPresenter implements InputPresenter {

    @NotNull InputView view;
    @NotNull Strategy strategy;

    public BookingPresenter(@NotNull InputView inputBooking, @NotNull Strategy strategy) {
        this.view = inputBooking;
        this.strategy = strategy;
        view.addHandlers(this);
    }

    @Override
    public void action(@NotNull String who, @NotNull String where) {
        String error = strategy.checkInput(who, where);
        if (error != null) view.showError(error);
        else view.showSuccess();
    }
}
