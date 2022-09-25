class Solution {
    public String interpret(String command) {

		StringBuilder translation = new StringBuilder(command.length()); // create a stringbuilder object with the capaity of command's length

		for (int i = 0; i < command.length(); i++) {

			if(command.charAt(i) == 'G'){

				translation.append('G');

			} else if (command.charAt(i) == '(') {

				if (command.charAt(i + 1) == ')') {

					translation.append('o');
					i += 1;

				} else {

					translation.append("al");

					i += 3;
				}
			}
		}

		return translation.toString();

    }

	public static void main(String[] args) {
		Solution t1 = new Solution();

		System.out.println(t1.interpret("G()()()()()()(al)"));
		System.out.println(t1.interpret("G()(al)"));
	
	}
}