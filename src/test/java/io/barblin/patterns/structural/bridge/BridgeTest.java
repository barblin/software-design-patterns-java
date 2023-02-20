package io.barblin.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTest {

    @Test
    void purchasesShouldSucceed() {
        Purchase purchaseExpressDelivery = new PurchaseStandard(new DeliveryExpress());
        Purchase purchaseStandardDelivery = new PurchaseStandard(new DeliveryStandard());

        Purchase subscriptionExpressDeliver = new PurchaseSubscription(new DeliveryExpress());
        Purchase subscriptionStandardDeliver = new PurchaseSubscription(new DeliveryStandard());

        assertEquals("Thank you for your order. Your purchase will arrive in 1-2 business days.",
                purchaseExpressDelivery.complete());
        assertEquals("Thank you for your order. Your purchase will arrive in 2-5 business days.",
                purchaseStandardDelivery.complete());
        assertEquals("Your subscription is all set. Your next delivery is on the way. " +
                "Your purchase will arrive in 1-2 business days.", subscriptionExpressDeliver.complete());
        assertEquals("Your subscription is all set. Your next delivery is on the way. " +
                "Your purchase will arrive in 2-5 business days.", subscriptionStandardDeliver.complete());
    }
}