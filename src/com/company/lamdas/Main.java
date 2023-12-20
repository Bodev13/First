package com.company.lamdas;

interface Executable {
    int print(int a, int b);
}

class Runner {
    public void run(Executable e) {
        int s = e.print(5, 5);
        System.out.println(s);
    }
}

class ExecutableImpl implements Executable {
    @Override
    public int print(int a, int b) {
        return a + b + 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImpl());

        runner.run(new Executable() {

            @Override
            public int print(int a, int b) {
                return a + b + 20;
            }
        });

        runner.run( (a, b) -> a + b + 30);

    }
}
