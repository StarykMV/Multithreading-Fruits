package app;

public class DataHandler {
    private final String[] fruits = new DataRepository().getData();

    public void getOutput() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(String fruit : fruits){
                sb.append(String.format("%d) %s ", count++, fruit));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}
