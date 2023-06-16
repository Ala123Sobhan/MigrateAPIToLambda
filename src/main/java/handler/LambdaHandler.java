package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.testng.TestNG;


public class LambdaHandler implements RequestHandler<Object, String> {


	@Override
	public String handleRequest(Object o, Context context) {

		try {
			TestNG testng = new TestNG();
			testng.setTestClasses(new Class[]{DummyAPITest.class});
			testng.run();
			return "Test execution completed.";
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return "";
	}
}

//aws lambda create-function  --function-name LambdaApiTest --runtime java11  --handler handler.LambdaHandler::handleRequest --code S3Bucket=ala123sobhanbucket,S3Key=APITestingBDDApproach-1.0-SNAPSHOT.jar  --role arn:aws:iam::199055471403:role/lambdarole1
// --profile ala123sobhan --timeout 300 --memory-size 512