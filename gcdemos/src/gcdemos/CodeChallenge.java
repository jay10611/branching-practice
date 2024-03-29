
	public static void main(String[] args) {
	        int sides = diceSides();
	        int dice = 2;
	        
	        int[] numbers = rollDice(sides, dice);
	        
	        System.out.print("Rolls: ");
	        for(int n: numbers) {
	            System.out.print(n + " ");
	            if( i < n ) {
	            	System.out.println("hello");
//	            }
	        }
	}
	        public static int diceSides() {
	            int sides = 0;
	            
	            System.out.print("How many sides are on the dice? ");
	            try {
	                BufferedReader br = new BufferedReader(
	                        new InputStreamReader(System.in));
	                sides = Integer.parseInt(br.readLine());
	            } catch(IOException exc) {
	                System.out.println("I/OException: " + exc);
	            }
	            
	            return sides;
	        }
	        	       
	        public static int[] rollDice(int sides, int dice) {
	            int[] numbers = new int[dice];
	            Random rand = new Random();
	            
	            for(int i=0; i < dice; i++) {
	                numbers[i] = rand.nextInt(sides);
	            }
	            
	            return numbers;
	        }
}