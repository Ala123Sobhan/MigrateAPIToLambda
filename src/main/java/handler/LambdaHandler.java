package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class LambdaHandler implements RequestHandler<Object, String> {


	@Override
	public String handleRequest(Object o, Context context) {

		JUnitCore jUnitCore = new JUnitCore();
		Result result = jUnitCore.run(IzaanSchoolAPITest.class);

		// Check the test result
		if (result.wasSuccessful()) {
			return "Tests completed successfully.";
		} else {
			StringBuilder failureMessage = new StringBuilder("Test failures occurred:\n");
			for (Failure failure : result.getFailures()) {
				failureMessage.append(failure.toString()).append("\n");
			}
			return failureMessage.toString();
		}
	}
}