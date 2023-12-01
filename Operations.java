
class Addition implements OperationInterface {
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction implements OperationInterface {
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication implements OperationInterface {
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Division implements OperationInterface {
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}

class Power implements OperationInterface {
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}

class OperationFactory {
    public static OperationInterface getOperation(String operation) {
        switch (operation) {
            case "+": return new Addition();
            case "-": return new Subtraction();
            case "*": return new Multiplication();
            case "/": return new Division();
            case "**": return new Power();
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}


