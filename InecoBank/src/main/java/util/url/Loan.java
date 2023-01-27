package util.url;

import static util.url.URL.INDIVIDUALS;

public class Loan {
    public static final String CUSTOMER_LOAN =  INDIVIDUALS + "/consumer-loans" ;
    public static final String LOAN_ONE_CLCICK = CUSTOMER_LOAN + "/1-click" ;
    public static final String LOAN_EXPRESS = CUSTOMER_LOAN + "/express" ;
    public static final String LOAN_SECURED = CUSTOMER_LOAN + "/secured-consumer-loan" ;
    public static final String LOAN_GOLD_PLADGE = CUSTOMER_LOAN + "/gold-pledge-secured" ;
    public static final String LOAN_DEPOSIT_SECURED = CUSTOMER_LOAN + "/deposit-secured" ;
    public static final String CREDIT_LINES = CUSTOMER_LOAN + "/loans/credit-lines" ;
    public static final String LOAN_COLLATERIAL = CREDIT_LINES + "/collateral" ;
    public static final String LOAN_CAR_LOANS = INDIVIDUALS + "/car-loans" ;
    public static final String LOAN_PARTNER_DEALERS =INDIVIDUALS +  "/car-list" ;
    public static final String LOAN_POINT_OF_SALES = INDIVIDUALS + "/point-of-sales" ;
    public static final String LOAN_MICROBUSINESS = INDIVIDUALS + "/microbusiness-loan" ;
}
