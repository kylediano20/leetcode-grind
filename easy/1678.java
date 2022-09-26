class Solution {
    public String interpret(String command) {

		StringBuilder translation = new StringBuilder(command.length()); // create a stringbuilder object with the capacity of command's length

		// loop through each index of the passed in command
		for (int i = 0; i < command.length(); i++) {

			// check if 'G' then add to the translation
			if(command.charAt(i) == 'G'){

				translation.append('G');
			
			// there are two options of what it could be if it starts with '('
			} else if (command.charAt(i) == '(') {

				// if the next element is ')'
				if (command.charAt(i + 1) == ')') {

					translation.append('o');
					i += 1; // move the current index of command to account for the extra character
				
				// if it isn't ), then the next must be '(al)'
				} else {

					translation.append("al");

					i += 3; // move the current index of command to account for the extra characters
				}
			}
		}

		// convert the translation from stringbuilder to a string
		return translation.toString();

    }

	public static void main(String[] args) {
		Solution t1 = new Solution();

		System.out.println(t1.interpret("G()()()()()()(al)"));
		System.out.println(t1.interpret("G()(al)"));
	
	}
}