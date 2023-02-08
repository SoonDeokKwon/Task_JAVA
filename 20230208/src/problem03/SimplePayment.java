package problem03;

public class SimplePayment implements Payment {

	//필드
	public double simplePaymentRatio;
	
	//생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	
	//메소드
	@Override
	public int online(int price) {
		double result = price * (1 - ONLINE_PAYMENT_RATIO - simplePaymentRatio);
		return (int)result;
	}

	@Override
	public int offline(int price) {
		double result = price * (1 - OFFLINE_PAYMENT_RATIO - simplePaymentRatio);
		return (int)result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
	}
	
}
