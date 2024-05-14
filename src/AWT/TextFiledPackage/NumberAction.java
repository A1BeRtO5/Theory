package AWT.TextFiledPackage;

public enum NumberAction {
    SUM {
        public String getLabel() { return "+";}
        public double execute(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    },
    MINUS {
        public String getLabel() { return "-";}
        public double execute(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }
    },
    MULTI {
        public String getLabel() { return "*";}
        public double execute(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
    },
    DIV {
        public String getLabel() { return "/";}
        public double execute(int firstNumber, int secondNumber) {
            return (double) firstNumber / secondNumber;
        }
    };
    public abstract String getLabel();
    public abstract double execute(int firstNumber, int secondNumber);
}
