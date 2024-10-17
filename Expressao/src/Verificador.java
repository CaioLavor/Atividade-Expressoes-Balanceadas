public class Verificador
{
    public static boolean isBalanced(String expression)
    {
        Pilha pilha = new Pilha();

        for (int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
            {
                pilha.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (pilha.isEmpty() || !isMatchingPair(pilha.pop(), ch)) {
                    return false; // Não está balanceada
                }
            }
        }
        return pilha.isEmpty();
    }
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}