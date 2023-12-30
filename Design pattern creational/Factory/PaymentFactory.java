package Factory;

import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMedthod paymentMedthon) throws ClassNotFoundException {
        switch (paymentMedthon) {
            case CREDIT_CARD:
                return new CreditCardPayment();
            case PAYPAL:
                return new PayPalPayment();
            case GOOGLE_PAY:
                return new GooglePayPayment();
            case APPLE_PAY:
                return new ApplePayPayment();
            default:
                throw new ClassNotFoundException(MessageFormat.format(
                        "{0} is not currently supported as a payment method.", paymentMedthon));
        }

    }
}