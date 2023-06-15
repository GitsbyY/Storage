
public class Ch5ArrayEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] snail = new int[3][3];
        
        int print = 3;
        int k = 1;
        int right = -1;
        int bottom = 0;
        int top = 1;
        
        for(int i=3; i>0; i--) {
            
            for(int j=0; j<print; j++) {
                right = right + top;
                snail[bottom][right] = k;
                k++;
            }
            
            print--;
            
            for(int j=0; j<print; j++) {
                bottom = bottom + top;
                snail[bottom][right] = k;
                k++;
            }
            
            top = top * (-1);
        }
        
        // 출력
        for(int i=0; i<snail.length; i++) {
            for(int j=0; j<snail[i].length; j++) {
        	    System.out.printf("%2d ", snail[i][j]);
            }
            System.out.println();
        }
		
	}

}
