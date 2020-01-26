public class Token {
    String name;
    String type;
	Integer value;
    
	public Token(String name, String type, Integer value){
        this.name = name;
        this.type = type;
		this.value = value;
    }
    
    public String getName(){
        return this.name;
    }
}
