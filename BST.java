package PROJECT_DS;
class BSTnode<T>{
    String word;
    int index;
    BSTnode<T> right;
    BSTnode<T> left;

    BSTnode(String w ){
        this.word = w;
        // this.index = i;
    }


    public void Tostring(){
        System.out.println(this.word + "  " + this.index);
    }
}
public class BST<T extends Comparable<T>> {
    BSTnode<T> root;
    int size;
    int index;

    public BST() {
        this.size = 0;
        this.index = 0;
    }


    // void
    public BSTnode insert(String word) {
        BSTnode<T> n = new BSTnode<>(word);
        this.size++;
        // first case insertion; checking whether the root is empty or not ; if it is empty then have to insert at root
        if (root == null) {
            root = n;
            root.index = index;
            root.left = null;
            root.right = null;
        }
        // if not inserting at root then need to decide which side to move on whether left or right from root and onwards
        else {
            index++;
            //starting from root hence assigning both the temp variables the address of root
            BSTnode<T> prev = root;
            BSTnode<T> temp = root;

            //traversal to first find the location to whose left or right the dqta needs to be placed in the tree
            while (temp != null) {
                //storing the current node to previous node so that the node in which it has to be inserted doesnt gets lost
                prev = temp;
                if (word.compareTo(temp.word) < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            //if the data is less then you have to move to the left node
            if (word.compareTo(prev.word) < 0) {
                prev.left = n;
                n.index = index;
            }
            //if the data is greater than or equal then you have to move to the right node
            else {
                prev.right = n;
                n.index = index;
            }
        }
        return n;
    }

    public int sizeBST(BSTnode n) {
        // addition of 1 is for root node of the BST since it doesnt belong to the left and the right subtree
        if (n != null)
            // traversal of right and left subtree to get the total number of nodes for both
            return 1 + sizeBST(n.left) + sizeBST(n.right);
        return 0;
    }
    String s = "";

    public String RandomWord(BSTnode r, int rand) {
        boolean found = false;
        if (r != null && r.index == rand && found == false) {
            found = true;
            s = r.word;
            //System.out.println(s = r.word);
            return s;
        }
        if (r == null) {
            return "";
        } else {
            RandomWord(r.left, rand);

            RandomWord(r.right, rand);
        }
        //  System.out.println(s);
        return s;
    }

    public int getRandom(int bstsize) {
        int rand = (int) (Math.random() * (bstsize - 1)) + 1;

        return rand;
    }
}