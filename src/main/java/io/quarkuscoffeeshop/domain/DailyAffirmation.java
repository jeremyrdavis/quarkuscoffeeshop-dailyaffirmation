package io.quarkuscoffeeshop.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.StringJoiner;

@Entity
public class DailyAffirmation extends PanacheEntity {

    String loyaltyMemberId;

    String affirmation;

    public static DailyAffirmation forLoyaltyMember(final String loyaltyMemberId) {
        return new DailyAffirmation(
                loyaltyMemberId,
                String.format("%s, you are awesome and people like you!", loyaltyMemberId)
                );
    }

    public DailyAffirmation(String loyaltyMemberId, String affirmation) {
        this.loyaltyMemberId = loyaltyMemberId;
        this.affirmation = affirmation;
    }

    public DailyAffirmation() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DailyAffirmation.class.getSimpleName() + "[", "]")
                .add("loyaltyMemberId='" + loyaltyMemberId + "'")
                .add("affirmation='" + affirmation + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyAffirmation that = (DailyAffirmation) o;

        if (loyaltyMemberId != null ? !loyaltyMemberId.equals(that.loyaltyMemberId) : that.loyaltyMemberId != null)
            return false;
        return affirmation != null ? affirmation.equals(that.affirmation) : that.affirmation == null;
    }

    @Override
    public int hashCode() {
        int result = loyaltyMemberId != null ? loyaltyMemberId.hashCode() : 0;
        result = 31 * result + (affirmation != null ? affirmation.hashCode() : 0);
        return result;
    }

    public String getLoyaltyMemberId() {
        return loyaltyMemberId;
    }

    public void setLoyaltyMemberId(String loyaltyMemberId) {
        this.loyaltyMemberId = loyaltyMemberId;
    }

    public String getAffirmation() {
        return affirmation;
    }

    public void setAffirmation(String affirmation) {
        this.affirmation = affirmation;
    }
}
