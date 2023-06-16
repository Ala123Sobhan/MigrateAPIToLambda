package handler;

import org.apache.logging.log4j.util.PropertySource;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;

import java.util.Collections;

public class RunnerClass {

    public static void main(String[] args) {
//        JUnitCore jUnitCore = new JUnitCore();
//        Result result = jUnitCore.run(IzaanSchoolAPITest.class);


        InvocationRequest request = new DefaultInvocationRequest();
        request.setGoals(Collections.singletonList("test"));

        DefaultInvoker invoker = new DefaultInvoker();
        try {
            InvocationResult result = invoker.execute(request);
            if (result.getExitCode() == 0) {
                System.out.println("Maven test completed successfully");
                //return "Maven test completed successfully.";
            } else {
                //return "Maven test failed with exit code: " + result.getExitCode();
                System.out.println("Maven test failed with exit code: " + result.getExitCode());
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        }

    }

