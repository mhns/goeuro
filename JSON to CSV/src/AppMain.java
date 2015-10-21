
public class AppMain {

	
	private static String argsToStr(String[]args){
		String result = "";
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i< args.length; i++){
			str.append(args[i]);
		}
		
		result = str.toString();
		return result;
	}
	
	
	/**
	 * The run method
	 * @param city City to be requested
	 */
	private static void run(String city) {
		
	}
	
	public static void main(String[] args) {
		
		String arg = argsToStr(args);
		run(arg);
		
	}

}
