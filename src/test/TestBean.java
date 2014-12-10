package test;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.support.SimpleTransactionStatus;

@Component
public class TestBean {
	@Resource
	SimpleTransactionStatus txstatus;

	public void doit() {
		System.out.println("Test from test bean");

		System.out.println(txstatus.isNewTransaction());

		System.out.println("After isNewTransaction");
	}
}
