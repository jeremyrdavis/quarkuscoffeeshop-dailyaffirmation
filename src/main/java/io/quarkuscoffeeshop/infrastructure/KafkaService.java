package io.quarkuscoffeeshop.infrastructure;

import io.quarkuscoffeeshop.domain.DailyAffirmation;
import io.quarkuscoffeeshop.domain.PlaceOrderCommand;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class KafkaService {

    Logger logger = LoggerFactory.getLogger(KafkaService.class);

    @Incoming("orders-in")
    @Blocking
    @Transactional
    public void onOrderIn(final PlaceOrderCommand placeOrderCommand) {

        logger.debug("PlaceOrderCommand {}", placeOrderCommand);
        DailyAffirmation dailyAffirmation = DailyAffirmation.forLoyaltyMember(placeOrderCommand.getLoyaltyMemberId());
        dailyAffirmation.persist();
        logger.debug("The daily affirmation for {}, is {}", placeOrderCommand, dailyAffirmation);
    }
}
