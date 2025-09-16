// public class array1 {
//     public static void main(String[] args) {
//         float[] mark = {55.3f, 88.6f, 100.0f, 78.5f, 88.5f};
//         float sum = 0f;

//         for (int i = 0; i < mark.length; i++) {
//             sum = sum + mark[i];
//         }

//         System.out.println("Total sum = " + sum);
//     }
// }

// public class array10 {
//     public static void main(String[] args) {
//         float[] mark = {55.3f, 88.6f, 100.0f, 78.5f, 88.5f};
//         float check = 5.3f;

//         for (int i = 0; i < mark.length; i++) {
           

//             if(check==mark[i])
//             {
              

               
//             }
             
            
//         }
         

//         // System.out.println("Total sum = " + sum);
//     }
// }









public class array10 {
    public static void main(String[] args) {
        float[] mark = {55.3f, 88.6f, 100.0f, 78.5f, 88.5f};
        float sum = 0;

        for (float element:mark)
         {
           sum=sum+element;
        }
         

        sum=sum/5;

        System.out.println(sum);
    }
}