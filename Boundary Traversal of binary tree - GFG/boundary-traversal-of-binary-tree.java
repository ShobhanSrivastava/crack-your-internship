//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node) // TC: O(n)
	{
	    ArrayList<Integer> result = new ArrayList<>();
	    result.add(node.data);
	    
	    if(node.left != null){
	        //Traversing left boundary -> TC: O(n)
	        traverseLeftBoundary(node.left, result);
	        
	        //Finding leaf nodes on the left of the root
	        traverse(node.left, result);
	    }
        
        if(node.right != null){
            //Finding leaf nodes on the right of the root
            traverse(node.right, result);
            
            //Traversing right boundary -> TC: O(n)
            traverseRightBoundary(node.right, result);
        }
        
        return result;
	}
	
	void traverseLeftBoundary(Node node, ArrayList<Integer> result){
	    Node temp = node;
	    
        while(temp != null){
            result.add(temp.data);
            
            if(temp.left != null) temp = temp.left;
            else if(temp.right != null) temp = temp.right;
            else break;
        }
        
        result.remove(result.size()-1);
	}
	
	void traverseRightBoundary(Node node, ArrayList<Integer> result){
	    Node temp = node;
	    
        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            
            if(temp.right != null) temp = temp.right;
            else if(temp.left != null) temp = temp.left;
            else break;
        }
        
        st.pop();
        
        while(!st.isEmpty()){
            result.add(st.pop());
        }
	}
	
	void traverse(Node node, ArrayList<Integer> result){
	    if(node == null){
	        return;
	    }
	    
	    traverse(node.left, result);
	    
	    if(node.left == null && node.right == null) result.add(node.data);
	    
	    traverse(node.right, result);
	}
}








