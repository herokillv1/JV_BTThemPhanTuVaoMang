import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*30);
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("Nhập số bất kì để kiểm tra : ");
        int number = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn : ");
        int index = scanner.nextInt();
        System.out.println("Mảng sau khi thêm phần tử : ");

        if (index>=0&&index<=array.length-1){
            int[] array1 = new int[size+1];
            for (int i=0;i<array.length;i++){
                array1[i]=array[i];
                if (index==i){
                    array1[i]=number;
                    break;
                }
            }
            for (int j=index;j<array.length;j++){
                array1[j+1]=array[j];
            }
            for (int i=0;i<array1.length;i++){
                System.out.print(array1[i]+"\t");
            }
        }else {
            System.exit(0);
        }
    }
}
