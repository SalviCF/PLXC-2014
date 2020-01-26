import java.util.*;

public class TokensTable {
	Map<String,Token> table = new HashMap<String,Token>();

	private void error() {
		System.out.println("\terror;");
	}

	public Token add(String name, String type) {
		if(table.containsKey(name)) {
			error();
		}
		Token t = new Token(name, type, null);
		table.put(name, t);
		return t;
	}

	public Token extract(String name) {
		Token t = table.get(name);
		if(t==null) {
			error();
		}
		return t;
	}
}
