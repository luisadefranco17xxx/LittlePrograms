package at.campus02.zam21.pr1.Stack;

public class Stack {
    private Note []notes;
    private int pointer;

    public Stack(int size){
        notes = new Note[size];
        pointer = -1;
    }
    // not nice implementaiton without error checking
    public void push(Note note) throws StackFullException{
        if(pointer == notes.length - 1){
            throw new StackFullException("Stack already super full");
        }
        notes[++pointer] = note;
    }

    public Note pop() throws StackEmptyException{
        if(pointer == -1){
            // now we want to throw the error
            throw new StackEmptyException("cannot pop empty stack");
        }
        Note n = notes[pointer];
        notes[pointer--] = null; // notes[pointer] = null;  --pointer;
        return n;
    }
}