package be.unamur.info.b314.compiler.emj.MySymbol;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * manages different symbols in a program( symbol table)
 */
public class TableSymbol {

    // we store symbols using their ID as Keys

    private HashMap<String , AllSymbol> table ;

    //to keep with the evolution of the stack
    private Stack<String>  evolStack = new Stack<>();

    private String name;

    /**
     * Constructor for creating a symbol table with a specified name.
     * @param name The name of the symbol table.
     */
    public TableSymbol(String name) {
        this.name = name;
        this.table = new HashMap<>();
    }

    /**
     * get the name of the symbol table.
     * @return the name of the symbol table.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Creates a new symbol with the given data.
     * @param ID the id of th symbol
     * @param scope the scope where the symbol (where it is found)
     * @param type the type of the symbol
     * @param value the value of the symbol null if do not have
     * @param givenName the name of the symbol in the target language MicroPython
     */
    public void defSymbol(String ID, String type,Object value, String scope,String givenName) {
        table.put(ID, new AllSymbol(ID, type, value, scope, givenName));
    }

    /**
     * generate a new symbol from the data.
     * @param Symbol the symbol
     */
    public void defSymbol(String ID, AllSymbol Symbol) {
        table.put(ID,Symbol);
    }


    /**
     * get a symbol from the givenName
     * @param givenName the name of the symbol
     * @return the symbol
     */
    public AllSymbol getSymbolfromGivenName(String givenName){

        for(AllSymbol Symbol : table.values()){

            if (Symbol.getGivenName().equals(givenName)){
                return Symbol;
            }
        }
        return null;
    }


    /**
     * get Symbol from ID
     * @param ID the ID of the symbol
     * @param scope the scope where the symbol is represented
     */
    public AllSymbol getSymbolFromID(String ID,String scope){

        for (AllSymbol symbol : table.values()){

            if (symbol.getName().equals(ID) && symbol.getScope().equals(scope)){
                return symbol;
            }
        }
        return null;

    }

    /**
     *
     * @return the table of symbol
     */
    public HashMap<String,AllSymbol> getTable(){
        return this.table;
    }

    /**
     * Retrieves the current scope from the top of stack.
     * @return the current scope id .
     */
    public String getCurrentScope() {
        return evolStack.peek();
    }



    /**
     * Enters a new scope with the given identifier in the scope stack.
     * @param ID The identifier of the new scope.
     */
    public void enterScope(String ID) {
        evolStack.push(ID);
    }

    /**
     * Exits the current scope on the top of the stack.
     */
    public void exitScope() {
        evolStack.pop();
    }


    /**
     * Finds and returns a list of scopes associated with a given identifier.
     * @param ID The identifier of the symbol to find in the symbol table.
     * @return An ArrayList of scopes for the specified identifier, or null if the identifier is not found.
     */

    public ArrayList<String> findListScopeForID(String ID) {
        ArrayList<String> AllScopesConcerned = new ArrayList<>();
        if (table.containsKey(ID)) {
            for (int i = 0; i < table.size(); i++) {
                AllScopesConcerned.add(table.get(ID).getScope());
            }
            return AllScopesConcerned;
        }
        return null;
    }

    /**
     * expand symbol table as a string.
     * @return content of the symbol table .
     */
    @Override
    public String toString() {
        StringBuilder TableTOString = new StringBuilder("{");
        for (String ID : this.table.keySet()) {
            TableTOString.append(this.table.get(ID).toString() + ", ");
        }
        TableTOString.append("}");
        return TableTOString.toString();
    }
}
