package io.quarkuscoffeeshop.domain;

import java.util.StringJoiner;

public class PlaceOrderCommand {

    String loyaltyMemberId;

    public PlaceOrderCommand(String loyaltyMemberId) {
        this.loyaltyMemberId = loyaltyMemberId;
    }

    public PlaceOrderCommand() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PlaceOrderCommand.class.getSimpleName() + "[", "]")
                .add("loyaltyMemberId='" + loyaltyMemberId + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceOrderCommand that = (PlaceOrderCommand) o;

        return loyaltyMemberId != null ? loyaltyMemberId.equals(that.loyaltyMemberId) : that.loyaltyMemberId == null;
    }

    @Override
    public int hashCode() {
        return loyaltyMemberId != null ? loyaltyMemberId.hashCode() : 0;
    }

    public String getLoyaltyMemberId() {
        return loyaltyMemberId;
    }

    public void setLoyaltyMemberId(String loyaltyMemberId) {
        this.loyaltyMemberId = loyaltyMemberId;
    }
}
