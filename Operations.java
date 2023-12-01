
class Plus implements OperationInterface {
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Minus implements OperationInterface {
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiply implements OperationInterface {
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Divide implements OperationInterface {
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
            case "+": return new Plus();
            case "-": return new Minus();
            case "*": return new Multiply();
            case "/": return new Divide();
            case "**": return new Power();
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}


