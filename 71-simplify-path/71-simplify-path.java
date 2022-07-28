class Solution {
    public String simplifyPath(String path) {
        int len = path.length();
        if(path.charAt(len-1) != '/'){
            path += "/";
        }
        
        String result = "";
        int currIndex = 0;
        // int nextIndex = findNextIndex(path, currIndex);
        
        while(true){
            if(currIndex == path.length()-1){
                break;
            }
            
            int i=currIndex+1;
            while(path.charAt(i) != '/'){
                i++;
            }
            int nextIndex = i;
            
            String sub = path.substring(currIndex+1, nextIndex);
            currIndex = nextIndex;
            
            if(sub.equals("") || sub.equals(".")){
                continue;
            }
            else if(sub.equals("..")){
                if(result == ""){
                    continue;
                }
                int index = result.lastIndexOf('/');
                result = result.substring(0, index);
            }
            else{
                result = result + "/" + sub;
            }   
        }
        
        if(result == ""){
            return "/";
        }
        
        return result;
    }
    
//     public int findNextIndex(String path, int currIndex){
        
//         for(int i=currIndex+1 ; i<path.length()-1 ; i++){
//             if(path.charAt(i) == '/'){
//                 return i;
//             }
//         }
        
//         return path.length()-1;
//     }
}