class Solution {
public:
    string interpret(string command) {
        string result;
        int i = 0, len = command.size();
        while(i < len){
            if(command[i] == 'G'){
                result.push_back('G');
                i++;
            }
            else if(command[i] == '(' && command[i+1] == ')'){
                result.push_back('o');
                i+=2;
            }
            else{
                result += "al";
                i+=4;
            }
        }
        
        return result;
    }
};