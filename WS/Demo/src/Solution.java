
abstract class A {
	
}
public  class Solution {
    public int solution(int N) {
        // Implement your solution here
    	int count=0;
    	for (int i=1;i<=N;i++) {
    		String[] s= String.valueOf(i).split("");
    		for(String sChar: s) {
    			if(sChar.contains("1")) {
    				count++;
    			}
    		}
    	}
    	return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		System.out.println(s.solution(13));
		

	}

}
