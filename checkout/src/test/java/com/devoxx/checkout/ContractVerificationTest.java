package com.devoxx.checkout;

import com.devoxx.checkout.domain.Cashier;
import com.devoxx.checkout.domain.ValidatedOrder;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@Provider("checkout-service")
//@PactBroker
public class ContractVerificationTest {

    @MockBean
    private Cashier cashier;

    /*
    @State("an order")
    public void before() {
        when(cashier.checkoutNow(any())).thenReturn(
                new ValidatedOrder("39ad34b5-e649-472d-ad5c-aab886a664e4",
                        5,
                        "maxime",
                        LocalDateTime.now())
        );
    }
    */

    /*
    @TestTemplate
    @ExtendWith(PactVerificationSpringProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }
    */

}
