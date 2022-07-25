# Approach
​
* Store the indices of elements of **nums2** in a HashMap so that its better to find them while searching the corresponding element in **nums1**
* Create a stack to find the next greater element for each element
* If the stack is already empty, push the element's index
* If the stack is not empty, check if the element in hand is greater than the element whose index is at the top of the stack.
* Now this element in hand is the next greater element of element whose index is at the top, assign the value this index equal to the element in hand.
* Repeat this step until the element in hand is smaller than the element whose index is at the top or the stack becomes empty.
* Now when the above process is complete push the element in hand.
* When this whole process is complete for all the elements in the array, the indices remaining in the stack have no next greater element.
* Get the index at the top of the stack and make the value at that index -1.
* The next greater elements are now found for each element. Loop through each element in the nums1, get the corresponding index in the map. At that very index the next greater element value is placed.
​
​