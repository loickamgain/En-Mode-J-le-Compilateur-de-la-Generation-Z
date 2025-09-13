package be.unamur.info.b314.compiler.emj.MySymbol;

import java.util.ArrayList;

public class AllSymbol {

    private String scope;
    private String type ;
    private String name;

    private String givenName;

    private ArrayList<String> Params = new ArrayList<>();
    private Object value;

    /**
     * Creating a new symbol from the name and type.
     * @param name the name of the symbol
     * @param scope the scope where the symbol is define
     * @param type the type of the symbol
     * @param value the value of the symbol null if do not have
     * @param givenName the name of the symbol in the target language MicroPython
     */

    public AllSymbol(String name,String type,Object value,String scope,String givenName) {
        this.scope = scope;
        this.type = type;
        this.name = name;
        this.givenName = givenName;
        this.value = value;
    }

    // the getters
    /**
     * @return the Scope where is defined the symbol
     */
    public String getScope(){
        return scope;
    }


    /**
     * Returns the type of the symbol.
     * @return the type of the symbol
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the name of the symbol.
     * @return the name of the symbol
     */
    public String getName() {
        return name;
    }

    /**
     * @return the targetName of the symbol
     */
    public String getGivenName(){
        return givenName;
    }

    /**
     * @return the value of the symbol
     */
    public Object getValue(){
        return value;
    }

    // the setters

    public void setValue(Object value) {
        this.value = value;
    }
    /**
     * adding a parameter to  it list
     */
    public void addParmars(String param){
        this.Params.add(param);
    }

    /**
     * @return the parameters list
     */
    public ArrayList<String> getParamList(){
        return this.Params;
    }

    // method to string
    @Override
    public String toString() {
        return String.format("{scope=%s,type=%s,name=%s }",this.scope,this.type,this.name);
    }
}
