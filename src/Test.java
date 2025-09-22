public class Test{
    void output() {
        System.out.println("test");
    }

    void sum(int upperLimit){
        int sum = 0;
        for (int i = 0; i <= upperLimit; i++) {
            sum ++;
        }
        System.out.println("The sum is "+sum);
    }
}
