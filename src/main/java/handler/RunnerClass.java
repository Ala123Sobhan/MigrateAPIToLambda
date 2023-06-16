package handler;

import org.apache.logging.log4j.util.PropertySource;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.testng.TestNG;

import java.util.Collections;

public class RunnerClass {

    public static void main(String[] args) {
//        JUnitCore jUnitCore = new JUnitCore();
//        Result result = jUnitCore.run(IzaanSchoolAPITest.class);
//

        try {
            TestNG testng = new TestNG();
            testng.setTestClasses(new Class[]{DummyAPITest.class});
            testng.run();


        }catch(Exception e)
        {System.out.print(e.getMessage());}
    }
    }

