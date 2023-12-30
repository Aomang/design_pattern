package Factory;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class ApplePayPayment implements Payment {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully ${0} to merchant using a Apple Pay", amount));
    }
    
}
