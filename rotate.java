// question bhaut thoda s tricky h kyuki rotate value d>arr.length
public class rotate {// d=10;
    public static int[] ram(int []arr){
        int d=3;
        int n=arr.length;
        d=d%n;
        int i=0,j=d-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        int q=d,w=arr.length-1;
        while(q<w){
            int temp=arr[q];
            arr[q]=arr[w];
            arr[w]=temp;
            q++;
            w--;
        }
        int x=0,y=arr.length-1;
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }

        return arr;

    }

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7};
       int rot[]=ram(arr);
        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
