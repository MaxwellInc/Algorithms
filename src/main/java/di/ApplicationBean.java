package di;

import di.logic.Logging;

public class ApplicationBean implements Logging{

    public void doSomething() {
        System.out.println("I dont know what i am here for");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
