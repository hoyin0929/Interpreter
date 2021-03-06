package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class WriteCode extends ByteCode {

    public void init(ArrayList<String> args) {}

    public void execute(VirtualMachine vm) {
        int i = vm.peek();
        System.out.println(i);
    }

    public String toString() {
        return "WRITE ";
    }
}
