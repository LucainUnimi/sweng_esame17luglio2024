package it.unimi.di.sweng.esame.presenter;

import org.jetbrains.annotations.NotNull;

public class PaymentStrategy implements Strategy {
    @NotNull
    public final static PaymentStrategy INSTANCE = new PaymentStrategy();

    @Override
    public String checkInput(String who, String amount) {
        if (who.isBlank()) return "Empty customer name";
        if (amount.isBlank()) return "Empty payment amount";
        try {
            Float.parseFloat(amount);
        } catch (Exception e) {
            return "Amount must be a number";
        }
        return null;
    }
}
