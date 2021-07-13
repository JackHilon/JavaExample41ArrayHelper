package javaexample41arrayhelper;

import MyArray.ArrayHelper;

public class JavaExample41ArrayHelper {

    public static void main(String[] args) {

        int[] v1 = new int[]{1, 9, 2, 8, 7, 4, 3, 0, 5, 6};
        int[] v2 = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int[] v3 = null;
        int[] v4 = new int[]{1, 2, 3};
        int[] v5 = new int[]{0, 0, 0, 0, 0};
        int[] v6 = null;
        int[] v7 = null;
        int[] v8 = new int[] {1,2,4,9,4,6,4,8,7,4,0,5,11,23,4,56,77,88,99};
        
        
        System.out.println("v1: "+ArrayHelper.Array2String(v1));
        System.out.println("v2: "+ArrayHelper.Array2String(v2));
        System.out.println("v3: "+ArrayHelper.Array2String(v3));
        System.out.println("v4: "+ArrayHelper.Array2String(v4));
        System.out.println("v5: "+ArrayHelper.Array2String(v5));
        System.out.println("v6: "+ArrayHelper.Array2String(v6));
        System.out.println("v7: "+ArrayHelper.Array2String(v7));
        System.out.println("v8: "+ArrayHelper.Array2String(v8));
        
        MySpace();
        
        System.out.println("Two Arrays (v1 , v2) are equal: "+ArrayHelper.AreTheyEqual(v1, v2));
        System.out.println("Two Arrays (v1 , v3) are equal: "+ArrayHelper.AreTheyEqual(v1, v3));
        System.out.println("Two Arrays (v1 , v4) are equal: "+ArrayHelper.AreTheyEqual(v1, v4));
        System.out.println("Two Arrays (v3 , v6) are equal: "+ArrayHelper.AreTheyEqual(v3, v6));
        System.out.println("Two Arrays (v5 , v6) are equal: "+ArrayHelper.AreTheyEqual(v5, v6));
        int[] v1Copy=ArrayHelper.Copy2NewArray(v1);
        System.out.println("Two Arrays v1 and its copy are equal: "+ArrayHelper.AreTheyEqual(v1, v1Copy));
        
        MySpace();
        
        System.out.println("v1: "+ArrayHelper.Array2String(v1));
        ArrayHelper.Sorting(v1);
        System.out.println("v1 (sorted): "+ArrayHelper.Array2String(v1));
        
        MySpace();
        
        int item1=3465;
        int item2=4;
        System.out.println("v8: "+ArrayHelper.Array2String(v8));
        System.out.println("Binary-search about item("+item1+") in v8... The index is: "+ArrayHelper.BinarySearching(v8, item1));
        System.out.println("Binary-search about item("+item2+") in v8... The index is: "+ArrayHelper.BinarySearching(v8, item2));
        System.out.println("Binary-search about item("+100+") in v8... The index is: "+ArrayHelper.BinarySearching(v8, 100));
        
        MySpace();
        
        int item3=100;
        System.out.println("v1: "+ArrayHelper.Array2String(v1));
        ArrayHelper.FillWithItem(v1, item3);
        System.out.println("Fill array v1 with item("+item3+"): "+ArrayHelper.Array2String(v1));
        ArrayHelper.FillWithItem(v3, item3);
        System.out.println("Fill null-array v3 with item("+item3+"): "+ArrayHelper.Array2String(v3));

        MySpace();
        
        System.out.println("v4: "+ArrayHelper.Array2String(v4));
        int[] v44=ArrayHelper.Copy2NewArray(v4);
        System.out.println("v44 (copy of v4): "+ArrayHelper.Array2String(v44));
        System.out.println("v4 and its copy are equal: "+ArrayHelper.AreTheyEqual(v4, v44));
        System.out.println("v7 (null-array): "+ArrayHelper.Array2String(v7));
        int[] v77 =ArrayHelper.Copy2NewArray(v7);
        System.out.println("v77 (copy of null-array): "+ArrayHelper.Array2String(v77));
        System.out.println("v7 and its copy are equal: "+ArrayHelper.AreTheyEqual(v7, v77));
        
    }
    
    private static void MySpace()
    {
        System.out.println();
        System.out.println("----");
        System.out.println();
    }
    
    

}
