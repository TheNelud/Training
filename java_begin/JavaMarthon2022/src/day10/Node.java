package day10;

public class Node {
    private int[] leftBranch;
    private int[] rightBranch;

    private int root = 20;

    public void addNode(int addNumber){
        if (addNumber >= getRoot()){
            for (int number : getLeftBranch()){
                number = addNumber;
                setRoot(number);
            }
        }else if(addNumber < getRoot()){
            for (int number : getRightBranch()){
                number = addNumber;
                setRoot(number);
            }
        }

    }


    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public int[] getLeftBranch() {
        return leftBranch;
    }

    public void setLeftBranch(int[] leftBranch) {
        this.leftBranch = leftBranch;
    }

    public int[] getRightBranch() {
        return rightBranch;
    }

    public void setRightBranch(int[] rightBranch) {
        this.rightBranch = rightBranch;
    }
}
