import java.util.ArrayDeque;
import java.util.Deque;
public class infixtoposfix {
    public boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '/' || ch == '^'){
            return true;
        }
            return false;
    }
    public int degreeOp(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '+' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        } else {
            return 0;
        }
    }
    public  String toPostfix() {
        char ch;
                do {
                    postfixExp += s.pop();
                } while (s.peek() != '(');
                s.pop();
        } else if (ch == '(') {
            s.push(ch);
        } else  {
            postfixExp += ch;
          }
        }
        if (!s.isEmpty()){
            do {
                postfixExp += s.pop();
            } while (!s.isEmpty());
        }   
        return postfixExp;
    }
}

