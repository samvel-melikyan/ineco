package util.url;

import static util.url.URL.INDIVIDUALS;

public class Card {
    public static final String CARDS = INDIVIDUALS + "/cards" ;
    public static final String CARD_VISA = CARDS + "?attachedCardPossibility=false&cardTypes=visa&currency=AMD";
    public static final String CARD_MASTER = CARDS + "?attachedCardPossibility=false&cardTypes=master&currency=AMD";
    public static final String CARD_ARCA = CARDS + "?attachedCardPossibility=false&cardTypes=arca&currency=AMD";
    public static final String CARD_CLASSIC = CARDS + "/visa-classic" ;
    public static final String CARD_VISA_GOLD = CARDS + "/visa-gold" ;
    public static final String CARD_MASTERCARD_STANDART = CARDS + "/mastercard-standard" ;
    public static final String CARD_MASTERCARD_GOLD = CARDS + "/mastercard-gold" ;
    public static final String CARD_ARCA_CLASSIC = CARDS + "/arca-classic" ;
    public static final String CARD_MASTERCARD_BLACK = CARDS + "/mastercard-black-edition" ;
    public static final String CARD_VISA_SIGNITURE = CARDS + "/visa-signature" ;
    public static final String CARD_VISA_PLATINIUM = CARDS + "/visa-platinum" ;

    public static final String PAYMENTS_LATER = CARDS + "/paylater" ;
    public static final String PAYMENTS_APPLE = CARDS + "/apple-pay" ;
    public static final String PAYMENTS_NFC = CARDS + "/nfc" ;
    public static final String PAYMENTS_INECOPAY = CARDS + "/Inecopay" ;
}
