package com.educative.datastructures.tree;

public class BinarySearchTree {
    private Node root;
    public Node getRoot() {
        return this.root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Insert new node
//    public boolean add(int value) {
//        if (isEmpty()) {
//            root = new Node(value);
//            return true;
//        }
//
//        Node currentNode = root;
//        // Traverse until the proper position is found
//        while (currentNode != null) {
//            Node leftChild = currentNode.getLeftChild();
//            Node rightChild = currentNode.getRightChild();
//
//            if (value < currentNode.getData()) {
//                if (leftChild == null) {
//                    leftChild = new Node(value);
//                    currentNode.setLeftChild(leftChild);
//                    return true;
//                }
//                currentNode = leftChild;
//            } else {
//                if (rightChild == null) {
//                    rightChild = new Node(value);
//                    rightChild.setRightChild(rightChild);
//                    return true;
//                }
//                currentNode = rightChild;
//            }
//        }
//        return false;
//    }

    // Recursive insert
    private Node recursiveInsert(Node currentNode, int value) {
        // base case
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.getData()) {
            // iterate the left sub-tree
            currentNode.setLeftChild(recursiveInsert(currentNode.getLeftChild(), value));
        } else if (value > currentNode.getData()) {
            // iterate the right sub-tree
            currentNode.setRightChild(recursiveInsert(currentNode.getRightChild(), value));
        } else {
            return currentNode;
        }
        return currentNode;
    }
    public boolean add(int value) {
        root = recursiveInsert(root, value);
        return true;
    }

    // Iterative search
    public Node search(int value) {
        if (isEmpty()) return null;

        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getData() == value) {
                return currentNode;
            }
            if (value < currentNode.getData()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        System.out.println(value + " is not found");
        return null;
    }

    // Recursive search
    public Node searchRecursive(int value) {
        if (isEmpty()) {
            return null;
        }
        return recursiveSearch(root, value);
    }

    private Node recursiveSearch(Node currentNode, int value) {
        if (currentNode == null || currentNode.getData() == value) {
            return currentNode;
        }
        if (value < currentNode.getData()) {
            return recursiveSearch(currentNode.getLeftChild(), value);
        } else {
            return recursiveSearch(currentNode.getRightChild(), value);
        }
    }

    public void printTree(Node current) {
        if (current == null) {
            return;
        }
        System.out.print(current.getData() + " ");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());
    }

    // Delete node in tree
    public boolean delete(int value, Node currentNode) {
        if (root == null) return false;

        Node parent = null;
        // Set parent for current node and find required node
        while (currentNode != null && currentNode.getData() != value) {
            parent = currentNode;
            if (currentNode.getData() > value) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        // Node is found!
        if (currentNode == null) {
            return false;
        }
        // Case 1: Node is leaf node
        else if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            // if delete node is root -> set root == null
            if (root.getData() == currentNode.getData()) {
                setRoot(null);
                return true;
            } else if (currentNode.getData() < parent.getData()) {
                parent.setLeftChild(null);
                return true;
            } else {
                parent.setRightChild(null);
                return true;
            }
            // Case 2a: Node has one left child
        } else if (currentNode.getRightChild() == null) {
            // if delete node is root -> set root = left child
            if (root.getData() == currentNode.getData()) {
                setRoot(currentNode.getLeftChild());
                return true;
            } else if (currentNode.getData() < parent.getData()) {
                parent.setLeftChild(currentNode.getLeftChild());
                return true;
            } else {
                parent.setRightChild(currentNode.getLeftChild());
                return true;
            }
        } else if (currentNode.getLeftChild() == null) {
            if (root.getData() == currentNode.getData()) {
                setRoot(currentNode.getLeftChild());
                return true;
            } else if (currentNode.getData() < parent.getData()) {
                parent.setLeftChild(currentNode.getRightChild());
                return true;
            } else {
                parent.setRightChild(currentNode.getRightChild());
                return true;
            }
        } else {
            Node leastNode = findLeastNode(currentNode.getRightChild());
            int temp = leastNode.getData();
            delete(temp, root);
            currentNode.setData(temp);
            return true;
        }
    }
    private Node findLeastNode(Node currentNode) {

        Node temp = currentNode;

        while (temp.getLeftChild() != null) {
            temp = temp.getLeftChild();
        }

        return temp;

    }
}
