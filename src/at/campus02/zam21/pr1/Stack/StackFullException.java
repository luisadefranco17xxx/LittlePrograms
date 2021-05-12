package at.campus02.zam21.pr1.Stack;

public class StackFullException extends Exception {
    public StackFullException(){}
    public StackFullException(String msg){
        super(msg);
    }
}
