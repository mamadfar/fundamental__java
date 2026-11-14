package java_2.data_types;

public class ArrayList {

    public static void main(String[] args) {
        int nums1[] = { 4, 5, 9, 1 };
        int nums2[] = new int[4];
        nums2[0] = 8;
        nums2[1] = 2;
        nums2[2] = 6;
        nums2[3] = 3;

        for (int i = 0; i < nums2.length; i++) {
            IO.println(nums2[i]);
        }
        IO.println("--------------------------------------------");
        for (int i : nums1) {
            IO.println(i);
        }
        IO.println("----------------------------------------------------------------------------------------------");

        //! ------------------------------------------------------------ Multi dimentional Array --------------------------------------------------------------------

        int nums[][] = new int[3][4];
        
        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
                IO.print(nums[i][j] + " ");
            }
            IO.println();
        }
        IO.println("--------------------------------------------");
        for(int num[] : nums) {
            for(int item : num) {
                item = (int)(Math.random() * 10);
                IO.print(item + " ");
            }
            IO.println();
        }
        IO.println("----------------------------------------------------------------------------------------------");

        //! ------------------------------------------------------------ 3D Array / Jagged Array --------------------------------------------------------------------

        int nums3[][] = new int[3][];

        //? Jagged Array
        nums3[0] = new int[3];
        nums3[1] = new int[4];
        nums3[2] = new int[2];

        //? 3D Array
        int nums4[][][] = new int[3][4][5];
    }
}
