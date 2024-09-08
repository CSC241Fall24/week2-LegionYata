// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function

        if (n < 3) {
            return n;
        }
        else if (n >= 3) {
            return fRecursive(n - 1) + (2 * fRecursive(n - 2) )+ (3 * fRecursive(n - 3) );
        }
        return fRecursive(n);
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
       
        if (n < 3){
return n;
        } else if (n >= 3){
for(int i = 3; i <= n; i++){
    return fIterative(n - 1) + (2 * fIterative(n - 2)) + (3 * fIterative(n - 3));
}

        }
        return n;
    }
}