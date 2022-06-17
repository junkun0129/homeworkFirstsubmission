package Calculate;

public class Calculator {
 protected double num1;
 protected double num2;
 
 Calculator(double num1, double num2){
    this.num1 = num1;
    this.num2 = num2;
 }

public double getNum1() {
    return num1;
}

public void setNum1(double num1) {
    this.num1 = num1;
}

public double getNum2() {
    return num2;
}

public void setNum2(double num2) {
    this.num2 = num2;
}

public double add(){
    return this.num1 + this.num2;
}

public double subtract(){
    return this.num1 -  this.num2;
}

public double multiply(){
    return this.num1 * this.num2;
}

public double divide(){
    return this.num2 / this.num1;
}



@Override
public String toString() {
    return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
}


}
