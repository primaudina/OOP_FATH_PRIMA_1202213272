public class today {

    public static void main (String[] args) {
        		int[][] nilai = 
                {{1,0,0,0},
                {1,1,0,0},
                {1,1,1,0},
                {1,1,1,1},};

       for (int i=0; i<nilai.length;i++) {
          for (int j = 0; j <nilai[i].length; j++) {
              if (i>j){
                  nilai[i][j]=1;
                  System.out.print(nilai[i][j] + "\t");
              }else{
                  System.out.print(nilai[i][j] + "\t");
              }
              
          }
          System.out.println();
     }

}

}