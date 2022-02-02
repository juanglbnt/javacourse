package com.juan.designPatterns.Observer;

import com.juan.designPatterns.Observer.observer.Bidder;
import com.juan.designPatterns.Observer.observer.Observer;
import com.juan.designPatterns.Observer.observer.Product;
import com.juan.designPatterns.Observer.observer.Subject;
import org.junit.Test;

import java.math.BigDecimal;

public class ObserverTest {

    @Test
    public void testObserver() throws Exception{
        Subject product = new Product("36 inch led tv", new BigDecimal(350));
        Observer bidder1 = new Bidder("alex");
        Observer bidder2 = new Bidder("danna");
        Observer bidder3 = new Bidder("hannah");
        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);
        product.setBidAmount(bidder1, new BigDecimal(375));
        product.removeObserver(bidder2);
        product.setBidAmount(bidder3, new BigDecimal(400));
    }
}
