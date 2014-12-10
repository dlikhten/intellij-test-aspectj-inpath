package test;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@Aspect
public class TXAspect {
	@Before("execution(public boolean org.springframework.transaction.support.SimpleTransactionStatus.isNewTransaction())")
	public void advice() {
		System.out.println("In advice");
	}
}
