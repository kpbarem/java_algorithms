package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	// public static void main(String[] args) {
	// // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	//
	// Test test = new Test();
	//
	// List<String> orderList = new ArrayList<String>();
	//
	// orderList.add("zld 93 12");
	// orderList.add("fp kindle book");
	// orderList.add("10a echo show");
	// orderList.add("17g 12 25 6");
	// orderList.add("ab1 kindle book");
	// orderList.add("125 echo dot second generation");
	//
	// List<String> finalList = test.prioritizedOrders(6, orderList);
	//
	// for(String val: finalList) {
	// System.out.println(val + "\n");
	// }
	//
	// }

	// public List<String> prioritizedOrders(int numOrders, List<String> orderList)
	// {
	// List<String> nonPrimeOrders = new ArrayList<String>();
	// List<String> primeOrders = new ArrayList<String>();
	//
	// for (int i = 0; i < orderList.size(); i ++) {
	// String order = orderList.get(i);
	// String[] splitOrder = order.split(" ");
	// try {
	// Integer.parseInt(splitOrder[1]);
	// nonPrimeOrders.add(order);
	// } catch (NumberFormatException e) {
	// String primeOrder = "";
	// for (int j = 1; j< splitOrder.length; j++) {
	// primeOrder += splitOrder[j] + " ";
	// }
	// primeOrder += splitOrder[0];
	// primeOrders.add(primeOrder);
	// }
	// }
	//
	// Collections.sort(primeOrders);
	// List<String> finalListOfOrders = new ArrayList<String>();
	// for (String order: primeOrders) {
	// String[] splitOrders = order.split(" ");
	// String finalOrder = splitOrders[splitOrders.length -1];
	//
	// for (int i = 0; i < splitOrders.length - 1; i ++) {
	// finalOrder += " " + splitOrders[i];
	// }
	// finalListOfOrders.add(finalOrder);
	// }
	//
	// finalListOfOrders.addAll(nonPrimeOrders);
	//
	//
	//
	// return finalListOfOrders;
	// }

//	int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
//		int destinationRow = 0;
//		int destinationColumn = 0;
//		int currentRow = 0;
//		int currentColumn = 0;
//		int numMoves = 0;
//		for (int i = 0; i < numRows; i++) {
//			List<Integer> columnList = area.get(i);
//			for (int j = 0; j < numColumns; j++) {
//				if (columnList.get(j) == 9) {
//					destinationRow = i;
//					destinationColumn = j;
//				}
//			}
//		}
//
//		while (currentRow < destinationRow) {
//			if (currentRow + 1 < numRows && area.get(currentRow + 1).get(currentColumn) == 1) {
//				currentRow = currentRow + 1;
//				numMoves++;
//			} else {
//				break;
//			}
//		}
//
//		while (currentColumn < destinationColumn) {
//			if (currentColumn + 1 < numColumns && area.get(currentColumn + 1).get(currentColumn) == 1) {
//				currentColumn = currentColumn + 1;
//				numMoves++;
//			} else {
//				break;
//			}
//		}
//
//		return 5;
//
//	}

	Node root;

	class Node {
		int val;
		Node right;
		Node left;
	}

	void preOrder() {
		preOrderHelper(root);
	}
	
	void preOrderHelper(Node root) {
		if(root != null) {
			System.out.println(root.val + " ");
			preOrderHelper(root.left);
			preOrderHelper(root.right);
		}
	}
	
	void inOrder() {
		inOrderHelper(root);
	}
	
	void inOrderHelper(Node root) {
		if(root != null) {
			inOrderHelper(root.left);
			System.out.println(root.val + " ");
			inOrderHelper(root.right);
		}
	}
	
	void postOrder() {
		postOrderHelper(root);
	}
	
	void postOrderHelper(Node root) {
		if(root!= null) {
			postOrderHelper(root.left);
			postOrderHelper(root.right);
			System.out.println(root.val + " ");
		}
	}

}
