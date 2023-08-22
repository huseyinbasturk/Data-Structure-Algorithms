package data_structures_and_algorithms;

public class BigOSingleLoop {
    public static void main(String[] args) {
        long numberofOperations=0;
        int n = 1000000; //size of data
        int m= 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);

        //Task 1 Single loop.............O(n)
        startTime=System.currentTimeMillis();
        for(int i=0; i<n; i++){
            numberofOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of operations: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");

        //Task 2 Nested loops.............O(n)

        numberofOperations=0;
        startTime=System.currentTimeMillis();
        for(int j=0; j < n; j++){
            for(int i=0; i<n; i++){
                numberofOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of operations with nested loop: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");

        //Task3 Triple nested loops

        numberofOperations=0;
        startTime=System.currentTimeMillis();
        for(int j=0; j < n; j++){
            for(int i=0; i<n; i++){
                for(int k=0; k<n; k++){
                    numberofOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of operations with three nested loop: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");


        //Task4 N and M nested loops O(n*m)

        numberofOperations=0;
        startTime=System.currentTimeMillis();
        for(int j=0; j < n; j++){
            for(int i=0; i<m; i++){
                numberofOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("N * M nested loops: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");

        //Task4.5 N and M nested loops O(n+m)

        numberofOperations=0;
        startTime=System.currentTimeMillis();
        for(int j=0; j < n; j++){
            numberofOperations+=1;
        }
        for(int i=0; i<m; i++){
            numberofOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Consecutive N + M nested loops: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");



        //Task 5 Logarithmic Complexity......O(log(n))
        numberofOperations =0;
        startTime=System.currentTimeMillis();
        for(int i=1; i<n; i*=2){
            numberofOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of operations with logarithmic: " + numberofOperations + " in " + (endTime-startTime) + " miliseconds");

    }
}